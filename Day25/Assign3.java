//skip occurence of numbers that are divisible by 7 using continue statement.
class Demo{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%7==0){
				continue;
			}else{
				System.out.print(i+" ");
			}
		}
	}
}