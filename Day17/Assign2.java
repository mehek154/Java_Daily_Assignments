import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		System.out.println("Second Predecessor: "+(n-2));
		System.out.println("Second Successor: "+(n+2));
	}
}