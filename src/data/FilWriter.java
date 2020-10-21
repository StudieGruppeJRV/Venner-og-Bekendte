package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import logic.Ven;


public class FilWriter {
	
	


	public void saveFile(File file, List<Ven> list) {
		try (FileWriter filew = new FileWriter("VenFil.csv")){
			BufferedWriter output = new BufferedWriter(filew); 
		
			output.write(formatFile(list.toString()));
	
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	private String formatFile(String string) {
		String formated = "";
		while (!string.isEmpty()) {
			int open = string.indexOf('[');
			int close = string.indexOf(']');
			int next = string.indexOf(',');
			if (open != -1 && (close == -1 || close > open) && (next == -1 || next > open)) {
				formated += string.substring(0, open);
				formated += "[\n";
				string = string.substring(open + 1);
			}
			if (close != -1 && (open == -1 || open > close) && (next == -1 || next > close)) {
				formated += string.substring(0, close);
				formated += "\n]";
				string = string.substring(close + 1);
			}
			if (next != -1 && (close == -1 || close > next) && (open == -1 || open > next)) {
				formated += string.substring(0, next);
				formated += ",\n";
				string = string.substring(next + 2);
			}
		}
		return formated;
	}
}


