import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Min of Series: ");
		int min=sc.nextInt();
		System.out.print("Max of Series: ");
		int max=sc.nextInt();
		System.out.println("Series Of Even Numbers Ranging Between "+min+" & "+max+" is: ");
		for(int i=min;i<=max;i++){
			if(i%2==0){
				System.out.print(i +" ");
			}
		}
	}
}