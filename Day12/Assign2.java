import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Multiplication is "+(a*b));
		if(a<b){
			System.out.println("Division is "+(b/a));
		}else{
			System.out.println("Divisin is "+(a/b));
		}
	}
}