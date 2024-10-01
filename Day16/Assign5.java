import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && a<c){
			System.out.println("The Minimum number amongst "+a+" "+b+" & "+c+" is: "+a);
		}else if(b<a && b<c){
			System.out.println("The Minimum number amongst "+a+" "+b+" & "+c+" is: "+b);
		}else{
			System.out.println("The Minimum number amongst "+a+" "+b+" & "+c+" is: "+c);
		}
	}
}