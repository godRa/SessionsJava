package personpackage;

public class Student extends Person {
	
	private int nrMatricol;
	
	private String id;
	
	public String generateId(){
		
		return id + this.lastName;
	}
	
	public void getAgeTest(){
		
		this.age = 25;
		
	}

}
