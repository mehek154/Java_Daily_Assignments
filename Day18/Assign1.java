import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two integers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swap: a="+a+" & b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap: a="+a+" & b="+b);
	}
}
		