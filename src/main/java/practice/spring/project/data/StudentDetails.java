package practice.spring.project.data;

public class StudentDetails {

	private String name;
	private int id;
	
	public StudentDetails() {}
	
	public StudentDetails(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
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
	
	
}
