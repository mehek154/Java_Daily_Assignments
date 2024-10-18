import java.util.*;
class Demo{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value to be search: ");
		int num=sc.nextInt();
		boolean found=false;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				found=true;
				break;
			}
		}
		if(found){
			System.out.println("FOUND");
		}else{
			System.out.println("NOT FOUND");
		}
	}
}
		