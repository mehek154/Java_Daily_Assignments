import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter distance:");
		double dist=sc.nextDouble();
		System.out.print("Enter Time: ");
		double time=sc.nextDouble();
		if(dist>=0 && time>=0){
			System.out.println("Velocity of a Particle roaming In space is "+dist/time+" m/s");
		}else{
			System.out.println("Enter valid details");
		}
	}
}