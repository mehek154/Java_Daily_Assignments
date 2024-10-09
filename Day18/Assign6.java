import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length for array: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.print("Enter array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Odd elements: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\nEven elements: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");		
			}
		}
	}
}