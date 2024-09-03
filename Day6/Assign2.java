class Demo{
	public static void main(String[] args){
		double percent=92.40;
		if(percent>=90 && percent<=100){
			System.out.println("Grade:A");
		}else if(percent>=80 && percent<=89){
			System.out.println("Grade:B");
		}else if(percent>=70 && percent<=79){
			System.out.println("Grade:C");
		}else if(percent>=60 && percent<=69){
			System.out.println("Grade:D");
		}else if(percent>=0 && percent<=59){
			System.out.println("Grade:F");
		}else{
			System.out.println("Invalid Percentage");
		}
		System.out.println("Percentage="+percent);
	}
}