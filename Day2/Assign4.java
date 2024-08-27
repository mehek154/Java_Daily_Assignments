class Demo{
	public static void main(String[] args){
		System.out.println("Number divisible by 3 or 7 are:");
		for(int i=1;i<=20;i++){
			if(i%3==0 || i%7==0){
				System.out.println(i);
			}
		}
	}
}