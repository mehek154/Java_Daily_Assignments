import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		System.out.println("Before swap: "+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap: "+a+" " +b);
	}
}