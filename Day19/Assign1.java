import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<10;i++){
			System.out.print(a+" ");
			a=a+n;
		}
	}
}