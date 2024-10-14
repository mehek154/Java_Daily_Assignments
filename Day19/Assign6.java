import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Array Length: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.print("Enter an Array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Even Numbers: ");	
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\nOdd Numbers: ");	
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
		