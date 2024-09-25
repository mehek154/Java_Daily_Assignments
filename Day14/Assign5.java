import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two intgers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b){
			System.out.println("The Maximum number amongst "+a+" & "+b+" is "+a);
		}else{
			System.out.println("The Maximum number amongst "+a+" & "+b+" is "+b);
		}
	}
}