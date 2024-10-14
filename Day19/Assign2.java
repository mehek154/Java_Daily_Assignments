import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rupees: ");
		double rs=sc.nextDouble();
		if(rs>=0){
			System.out.println("Dollar= "+(rs/83.0));
		}else{
			System.out.println("Enter valid data");
		}
	}
}