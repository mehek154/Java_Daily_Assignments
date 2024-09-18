import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int cube1=a*a*a;
		int cube2=b*b*b;
		int square1=a*a;
		int square2=b*b;
		System.out.println("Addition of "+cube1+" & "+cube2+" is "+(cube1+cube2));
		System.out.println("Substraction of "+square1+" & "+square2+" is "+(square1-square2));
	}
}