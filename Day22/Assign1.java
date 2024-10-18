class Demo{
	public static void main(String[] args){
		System.out.println("Series of Prime Numbers ranging between 1 to 100.....");
		for(int num=1;num<=100;num++){
			int count=0;
			for(int i=1;i<=100;i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(num +" ");
			}
		}
	}
}