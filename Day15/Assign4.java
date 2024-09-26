import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start number to print pattern: ");
		int a=sc.nextInt();
		System.out.println("Pattern...");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a*a +"  ");
				a++;
			}
			System.out.println();
		}
	}
}