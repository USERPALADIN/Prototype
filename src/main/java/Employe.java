import java.util.ArrayList;
import java.util.List;

public class Employe implements Cloneable {
	
	private List<String> empList;
	
	public Employe() {
		empList = new ArrayList<String>();
	}
	
	public Employe(List<String> list) {
		this.empList = list;
	}
	
	public void loadData() {
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employe(temp);
	}
}
