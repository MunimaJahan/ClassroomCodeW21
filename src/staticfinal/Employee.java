package staticfinal;

import java.io.*;
public class Employee {

   // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "COMP";

   public static void main(String args[]) {
      salary = 1000;
      salary=4000;
      //DEPARTMENT="Math";
      System.out.println(DEPARTMENT + " average salary:" + salary);
   }
}