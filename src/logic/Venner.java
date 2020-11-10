package logic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import data.FileManager;


public class Venner implements VOBInterface {

	private List<logic.Ven> list = new ArrayList<logic.Ven>();

	public Venner(){
		try{
			list = FileManager.openFile();
		}
		catch (IOException e){
			list= new ArrayList<>();
		}
	}


	@Override
	public List<String> getFirstnameList() {
		return list.stream().map(Ven::getFirstname).collect(Collectors.toList());
	}

	@Override
	public void create(logic.Ven ven) {
		list.add(ven);	
		File file = new File("VenFil.csv");
		FileManager.saveFile(list);
	}
	

	@Override
	public String read() {
		
		return null;
	}

	@Override
	public String update() {
		
		return null;
	}

	@Override
	public void delete(int i) {
		list.remove(i);
		
	}

	@Override
	public List<logic.Ven> getAll() {
		
		return list;
	}

	@Override
	public List<logic.Ven> search(String search) {
		
		return null;
	}

	@Override
	public List<Ven> compare() {
		
		return null;
	}

}
