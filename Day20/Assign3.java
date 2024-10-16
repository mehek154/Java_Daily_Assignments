import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the hours: ");
		int hrs=sc.nextInt();
		int sec=60;
		int min=hrs*sec;
		sec=sec*min;
		System.out.println(sec +" seconds");
	}
}