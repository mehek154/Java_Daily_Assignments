import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Distence(Feet): ");
		int ft=sc.nextInt();
		if(ft>=0){
			System.out.println("Equivalent Distance for "+ft+"ft in cm is: "+(ft*30.48)+" cm");
		}
	}
}