package arithmetics;
import java.util.*;
class sample{
   
   public static void main(String args[]){
      
      double a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enetr values for a :");
      a=sc.nextInt();
      System.out.println("Enter value for b:");
      b=sc.nextInt();
      addition add=new addition(a,b);
      add.calc();
      subtraction sub=new subtraction(a,b);
      sub.calc();
      multiplication mul=new multiplication(a,b);
      mul.calc();
      division div=new division(a,b);
      div.calc();
      
}}
      
