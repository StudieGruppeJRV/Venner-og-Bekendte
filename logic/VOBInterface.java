package logic;

import java.util.List;

public interface VOBInterface {
	
	public void create(Ven ven);
	
	public String read();
	
	public String update();
	
	public String delete();
	
	public List<Ven> getAll();
	
	public List<Ven> search (String search);
	
	public List<Ven> compare();
}
