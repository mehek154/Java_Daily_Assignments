import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Mass: ");
		double m=sc.nextDouble();
		System.out.print("Enter Velocity: ");
		double v=sc.nextDouble();
		if(m>=0 && v>=0){
			System.out.println("Kinetic Energy of that Object is :"+(m*v*v/2));
		}else{
			System.out.println("Enter the vaild data");
		}
	}
}
