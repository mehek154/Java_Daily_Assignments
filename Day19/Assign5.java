import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int sum;
		for(int i=2;i<=num;i++){
			sum=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.print(i+" ");
			}
		}
	}
}
			