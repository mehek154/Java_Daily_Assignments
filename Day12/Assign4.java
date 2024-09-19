import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.print("Enter the sign of Operation: ");
		char c=sc.next().charAt(0);
		switch(c){
			case '+':
				System.out.println("Addition of "+a+" & "+b+ " is "+(a+b));
				break;
			case '-':
				System.out.println("Substraction of "+a+" & "+b+ " is "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication of "+a+" & "+b+ " is "+(a*b));
				break;
			case '/':
				if(a<b){
					System.out.println("Division of "+a+" & "+b+ " is "+(b/a));
				}else{
					System.out.println("Division of "+a+" & "+b+ " is "+(a/b));
				}
				break;
			case '%':
				System.out.println("Modulous of "+a+" & "+b+ " is "+(a%b));
				break;
			default:
				System.out.println("Invalid Operator");
				break;
		}
	}
}
		