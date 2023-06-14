import java.util.*;

interface parameter{
   
   public double area();
   
   public double perimeter();
   
}

class Rectangle implements parameter{

   float a;
   
   float b;
   
   Rectangle(float a,float b){
   
      this.a=a;
     
      this.b=b;
     
   }
   public double area(){
   
      return a*b;
     
   }
   
   public double perimeter(){
     
      return 2*(a+b);
   
   }
   }
class Circle implements parameter{

   float r;
   
   Circle(float r){
   
      this.r=r;
     
   }
   public double area(){
   
      return Math.PI*r*r;
     
   }
   
   public double perimeter(){
     
      return 2*Math.PI*r;
   
   }
   }

class shapeMain{

   public static void main(String arg[]){
   
      Scanner sc=new Scanner(System.in);
     
      int ch;
     
      do{
     
         System.out.println("1.Rectangle \n2.Circle \n3.Exit \nEnter your choice:");
         
         ch=sc.nextInt();
         
         switch(ch){
         
            case 1:Rectangle re=new Rectangle(2,4);
           
                   System.out.println("Area of Rectangle:"+re.area());
                   
                   System.out.println("perimeter of Rectangle:"+re.perimeter());
                   
                   break;
             
            case 2:Circle c=new Circle(4);
           
                   System.out.println("Area of circle:"+c.area());
                   
                   System.out.println("perimeter of circle:"+c.perimeter());
                   
                   break;
           
            case 3:System.out.println("Exit");
                   
                  break;
                   
           default:
           
                  System.out.println("Try again");
                 
                 }}while(ch!=3);
           }
           }

