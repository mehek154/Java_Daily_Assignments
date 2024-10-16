import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length for array: ");
		int len=sc.nextInt();
		int arr[]= new int[len];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("Smallest number: "+smallest);
	}
}