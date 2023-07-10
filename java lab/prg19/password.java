import java.util.*;

class pswd_exp extends  Exception{
	pswd_exp(String s){
	
	super(s);
	}
	}
	
class password{
	public static void main(String a[]){
	try{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username:");
	String uname=sc.nextLine();
	System.out.println("enter password:");
	String pwd=sc.nextLine();
	check(uname,pwd);
	}
	catch(pswd_exp p){
	System.out.println("Denied because of ..."+p);
	}
	}
	static void check(String uname,String pwd) throws pswd_exp{
	if (uname.equals("Sneha")&&pwd.equals("Sneha@123")){
	System.out.println("welcome");
	}
	else{
	throw new pswd_exp("sorry .... incorrect username and password");
	}
	}
	}
	
	
		
