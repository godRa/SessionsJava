package clientpackage;

import javax.swing.JButton;

public class OperatoriSiInstructiuni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean test = 5 >  'a';
//		System.out.println(test);
//		exemplu1();
//		exemplul2();
//		exemplul3();
//		ifElse();
//		sWitch();
//		wHile();
//		doWhile();
//		fOr();
		forEach();
		

	}
	
	private static void exemplu1(){
		
		JButton a = new JButton("exit");
		JButton b = new JButton("exit");
		JButton c = a;
		
		System.out.println("is reference a==b? is " + (a==b));
		System.out.println("is reference a==c? is " + (a==c));
	}
	
	private static void exemplul2(){
		
		int numOfPets = 3;
		String status = (numOfPets<4)? "pet limit not exceeded":"pet limit is exceeded";
		System.out.println(status);
	}
	
	private static void exemplul3(){
		
		int y = 5;
		int x = 2;
		
//		if (((x>3)&&(y<2))|true){
//			System.out.println("true");
		if ((x>3)&&(y<2)|true){
			System.out.println("true");
		}else{
			System.out.println("true");
		}
	}
	
	private static void ifElse(){
		
		int x =1;
		if (x==3){
			System.out.println("egal cu 3");
		}else if (x<4){
			System.out.println("mai mic ca 4");
		}else if (x<2){
			System.out.println("mai mare ca 2");
		}else{
			System.out.println("else");
		}
	}
	private static void sWitch(){
		
		//int x=7;
		String s = "xyz";
		//switch(s.length()){
		switch(s){
		//switch(x){
		case "xyz":
		//case 1: 
			System.out.println("x=1");
			break;
		case "xxx":
		//case 2:
			System.out.println("x=2");
			break;
		case "yzt":
		//case 3:
			System.out.println("x=3");
			break;
		default:
			System.out.println("nu gaseste nimic");
		}
	}
	private static void wHile(){
		
		int x = 0;
		
		while (x<15){
			System.out.println(x);
			++x;
		}
		
	}
	
	//in do while se executa cel putin 1 data (pentru DO)
	private static void doWhile(){
		
		int x = 1;
		do{
			System.out.println(x);
		}while(x<1);
	}
	
	private static void fOr(){
		
//		for (int i=0, j=1; i < 10||j<7; i++, j++){
//			System.out.println(i);
////			System.out.println(j);
//		//iese din for si continua la urmatoarea instructiune
//			//break;
//		//iese din toata metoda si trece la next method
//			return;
//		//iese din methoda/app
//			//System.exit(0);
		int i = 0;
		for(;i<10;){
			i++;
			System.out.println(i);
		}
	}
	
	private static void forEach(){
		
		int [] x = {1,2,3,4};
		for (int i:x){
			System.out.println(i);
		}
		for (int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
	

}
