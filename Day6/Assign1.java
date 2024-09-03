class Demo{
	public static void main(String[] args){
		int a=10;
		int b=20;
		int c=30;
		if(a>b || a>c){
			System.out.print(a+" is the second largest number");
		}else if(b>a || b>c){
			System.out.print(b+" is the second largest number");
		}else{
			System.out.print(c+" is the second largest number");
		}
	}
}