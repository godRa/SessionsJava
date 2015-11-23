package clientpackage;

import personpackage.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
		Person p1 = new Person("Nume1", "Nume2", 0, 18);
		Person p2 = new Person();
		
		p1.setAge(30);
//		p1.setFirstName("Nume1");
//		p1.setLastName("Nume2");
//		p1.setSex(0);
		p1.height = 2;
		p2.height = 1;
		System.out.println(p1.height + " " + p2.height);
		
		p1.run();
		
		Sum sum = new Sum();
		int s = sum.sum(10,11);
		int s1 = sum.sum(200, 1);
		System.out.println(s1);
		//System.out.println(sum.sum(200, 1));
		
		Sum s2 = new Sum();
		int nsum = s2.sum1(10);
		System.out.println(nsum);

		System.out.println(sum.produs(10));
		
		//large intiger; autoboxing
		Integer name = 5;
		//unboxing
		int unboxing = name;
		//int unboxing = name.intValue();
		Integer.parseInt("5");
		int parsing = Integer.parseInt("5");
		
		//declare and int as a String, then the string as an int
		int test = 10;
		String result = String.valueOf(test);
		int testResult = Integer.parseInt(result);
		System.out.println("the value is " + result + " " + testResult);
		
		int b = 15;
		changeValue(b);
		System.out.println(b);
		newMethod(p1);
	
	}
	public static void changeValue(int a){
		
		a = a+3;
	}
	
	private static void newMethod(Person mitica){
		
		mitica.setAge(18);
	}
	

}

