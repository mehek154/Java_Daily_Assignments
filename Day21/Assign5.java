import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.print("Sum of all elements in array is: "+sum);
	}
}