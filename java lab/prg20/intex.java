import java.util.*;
class negexcep extends Exception
{
	negexcep(String s)
	{
		super(s);
	}
}
class intex
{
	public static void main(String str[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int num=s.nextInt();
		System.out.println("Enter the elements:");
		int a[]=new int[num];
		int sum=0,count=0,avg,temp;
		for(int i=0;i<num;i++)
		{	
			try
			{
				a[i]=s.nextInt();			
				temp=a[i];
				if(a[i]>0)
				{
					sum+=temp;
					count+=1;
				}
				else
				{
					throw new negexcep(Integer.toString(temp));
				
				}
			}
			catch(negexcep ne)
			{
				System.out.print(ne.getMessage());
				System.out.println(" - is a negative number");
			}
		}
		System.out.println("Sum of positive integers:"+sum);
		System.out.println("Number of positive integers:"+count);
		System.out.println("Average of positive integers:"+((float)sum/count));
	}
}
