class Demo{
	public static void main(String[] args){
		int a=20;
		int b=30;
		int c=40;
		if(a>b && a>c){
			System.out.print(a+ " is the largest among all numbers");
		}else if(b>c && b>a){
			System.out.print(b+ " is the largest among all numbers");
		}else{
			System.out.print(c+ " is the largest among all numbers");
		}
	}
}