package logic;

import java.util.List;

public interface VOBInterface {

	public List<String> getFirstnameList();
	
	public void create(logic.Ven ven);
	
	public String read();
	
	public String update();
	
	public void delete(int i);
	
	public List<logic.Ven> getAll();
	
	public List<logic.Ven> search (String search);
	
	public List<Ven> compare();
}
