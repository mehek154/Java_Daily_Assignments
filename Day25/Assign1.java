//Prime Number or Not
import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(num+" is a Prime Number");
		}else{
			System.out.println(num+" is not a Prime Number");
		}
	}
}