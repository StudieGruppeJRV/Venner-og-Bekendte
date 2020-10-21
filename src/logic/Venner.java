package logic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import data.FilWriter;


public class Venner implements VOBInterface {
	
	private FilWriter fw = new FilWriter();
	private List<logic.Ven> list = new ArrayList<logic.Ven>();
	@Override
	public void create(logic.Ven ven) {
		list.add(ven);	
		File file = new File("VenFil.csv");
		fw.saveFile(file, list);
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
