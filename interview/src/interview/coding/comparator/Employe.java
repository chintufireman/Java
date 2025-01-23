package interview.coding.comparator;

public class Employe {
	private String name;
	private int id;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employe(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	
}
