package Objects;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class teststaticBall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Ball>balls=new ArrayList<Ball>();
		int a[]= {1,2,3};
		Ball redball=new Ball(Color.RED,2);
		Ball blueball=new Ball(Color.BLUE,3);
		
		//Displaying a message dialog box
		JOptionPane.showMessageDialog(null, "Ball objects created");
		//System.out.println("The color of red ball is:"+redball.getColor());
		//System.out.println("The color of red ball is:"+redball.getColor());
		
		//OWNER cannot be changed because it is a final constant
		//Ball.OWNER="MRU";
		
		//OWNER for red and blue ball is same because it is part of class and not objects
		System.out.println("The owner of red ball is:"+redball.getOwner());
		System.out.println("The owner of blue ball is:"+blueball.getOwner());
		//System.out.println("The owner of red ball is:"+blueball.getShape());
		//redball.color="Red";
		//System.out.println(redball.getSize());
		
		//Displaying an input dialog box which returns a String
		String num=JOptionPane.showInputDialog("Enter number of bounce");
		
		//Converting String to int
		int n=Integer.parseInt(num);
		redball.bounce(n);
	}
}
