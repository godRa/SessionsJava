package personpackage;

public class Person {
	
	public static int height;
	
  public int age;
  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	return true;
}

String lastName;
  private String firstName;
  private int sex;
  private boolean major;
  
  
  public boolean isMajor() {
	return major;
}


public void setMajor(boolean major) {
	this.major = major;
}


public void run(){
	  
	  System.out.println(firstName +" "+ lastName+ " is running");
	  System.out.println(age);
	  
  }


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public int getSex() {
	return sex;
}


public void setSex(int sex) {
	this.sex = sex;
	
}

public Person(String firstName, String secondName, int sex, int age){
	
	this.firstName = firstName;
	this.lastName = secondName;
	//lastName=secondName;
	this.sex = sex;
	this.age = age;
	
	
}
public Person(){

}

}
