package accessmodifiers;

import personpackage.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private -- default -- protected -- public
		Person person = new Person();
		person.age = 18;
		
//		Person p1 = new Person ("Anamaria", "Crisan", 5, 1);
//		Person p2 = new Person ("Rares", "Bradi", 6, 2);
//		Person p1 = new Person ("Anamaria", "Crisan", 5, 1);
		Person p1 = null;
		Person p2 = new Person ("Anamaria", "Crisan", 6, 2);
		//p1.equals(p2);
		
		//null pointer exception
		//System.out.println(p1.equals(p2));
		System.out.println("hello");
		
//		String s = "abc";
//		String s1 = "abc";
//		s = s1 --true;
		
//		String s = "abc";
//		String s1 = new String ("abc");
//		s = s1 --false
		
//		Person p;
//		Person p =  null;
//		p.equals(p1); ----Null pointer exception
//		
//		int a [] = {1,2,3,4};
//		for (int i=0; i<=a.length;i++){
//			//no value because of =
//			System.out.println(a[i]);
//		}
		

	}

}
