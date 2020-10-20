package logic;

import java.util.List;
import java.util.ArrayList;

public class Venner implements VOBInterface{

	private List<Ven> list = new ArrayList<Ven>();
	@Override
	public void create(Ven ven) {
		list.add(ven);	
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
	public String delete() {
		
		return null;
	}

	@Override
	public List<Ven> getAll() {
		
		return list;
	}

	@Override
	public List<Ven> search(String search) {
		
		return null;
	}

	@Override
	public List<Ven> compare() {
		
		return null;
	}

}
