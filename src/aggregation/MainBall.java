package aggregation;
import java.util.*;

public class MainBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		String [] nam= {"name1", "name2"};
	
		names.add("Munima");
		names.add("Jahan");
		names.add(1,"Test");
		for(String i:nam)
			System.out.println(i);
		Basket bas3=new Basket(3);
		int a=15;
		int b=20;
		//sum(a,b);
		//sum('A');
		bas3.addBal("Red", 2);
		bas3.addBal("blue", 3);
		bas3.addBal("green", 5);
		//bas3.printBalls();
		/*Ball redball;
		redball=new Ball("Red",2);
		Ball greenball= new Ball();
		Ball blueball=new Ball("Blue",3);*/
		
		//System.out.println(redball.toString());
		//redball.color="Red";
		//System.out.println("size of red ball is"+redball.getSize());
		//redball.setSize(2);
		
		//Scanner myobj=new Scanner(System.in);
		//System.out.println("Input the number of bounce");
		//int num=myobj.nextInt();
		//redball.bounce(num);
		/*blueball.setColor("Blue");
		//blueball.setSize(-3);
		//blueball.bounce(4);
		//blueball.bounce(4,5);
		System.out.println(blueball.getColor());
		System.out.println(greenball.getColor());
		
		bas3.addBal(redball);
		bas3.addBal(greenball);
		bas3.addBal(blueball);
		bas3.addBal(new Ball("purple",5));
		bas3.printBalls();*/
		Ball blueball=new Ball("Blue",3);
		//System.out.println(blueball.toString());
		System.out.println(bas3);
	}
	public static void sum(int a, long b) {
		long c=a+b;
		System.out.println("The sum is"+c);
		System.out.println("first method invoked");
	}
	public static void sum(char a) {
		int c=a;
		System.out.println("The sum is"+c);
		System.out.println("2nd method invoked");
	}

}
