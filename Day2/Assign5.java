class Demo{
	public static void main(String[] args){
		int n=1;
		System.out.println("Number divisible by 3 and 7 are:");
		while(n<=20){
			if(n%3==0 && n%7==0){
				System.out.println(n);
			}
		}
	}
}