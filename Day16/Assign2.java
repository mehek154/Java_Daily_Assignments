import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting number:");
		int a=sc.nextInt();
		System.out.print("Enter ending number:");
		int b=sc.nextInt();
		int fact;
		for(int i=a;i<=b;i++){
			fact=1;
			for(int j=1;j<=i;j++){
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" = "+fact);
		}
	}
}