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
		System.out.print("Array in reverse order: ");
		for(int i=size-1;i>=0;i--){
			System.out.print(arr[i] +" ");
		}
	}
}