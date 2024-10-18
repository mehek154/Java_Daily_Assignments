import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Distance(Km): ");
		Double km=sc.nextDouble();
		if(km>=0){
			System.out.println("Distance(meter): "+(km*1000)+" m");
		}
	}
}