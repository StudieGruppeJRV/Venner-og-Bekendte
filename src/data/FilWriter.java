package data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javafx.util.Pair;
import logic.Ven;

public class FilWriter {

    public static void saveFile(List<Ven> list) {
        try (FileWriter filew = new FileWriter("VenFil.csv")) {
            BufferedWriter output = new BufferedWriter(filew);

            output.write(formatFile(list.toString()));

            output.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static String formatFile(String string) {
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


    public static List<logic.Ven> openFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("VenFil.csv"));
        String sfile = br.lines().collect(Collectors.joining("\n"));
        //fjerner [ i starten af filen og fjerner ] i slutningen af filen
        int start = sfile.indexOf('[');
        int end = sfile.lastIndexOf(']');
        sfile = sfile.substring(start + 1, end);
        //fjerner ] i slutningen
        end = sfile.lastIndexOf(']');
        //hvis den ikke findes er filen tom
        if (end == -1) {
            return new ArrayList<Ven>();
        }
        sfile = sfile.substring(0, end);
        // splitter ved hvert object
        return Arrays.stream(sfile.split("]"))
                //fjerner [
                .map(s -> {
                    int i = s.indexOf('[');
                    return s.substring(i + 1);
                })
                // omdanner til et Map over attributter parret op med attribut navne som key
                .map(s ->
                        Arrays.stream(s.split(",")).map(p -> {
                            String[] pees = p.split("=");
                            return new Pair<String, String>(pees[0].trim(), pees[1].trim());
                        }).collect(Collectors.toMap(Pair::getKey, Pair::getValue))
                )
                //setter attributter ud fra attributnavne
                .map(map -> {
                    Ven ven = new Ven();
                    ven.setFirstname(map.get("firstname"));
                    ven.setLastname(map.get("lastname"));
                    ven.setDateOfBirth(map.get("dateOfBirth"));
                    ven.setEmail(map.get("email"));
                    ven.setCity(map.get("city"));
                    ven.setPhonenumber(map.get("phonenumber"));
                    ven.setCar(map.get("car"));

                    return ven;
                })
                .collect(Collectors.toList());
    }
}


