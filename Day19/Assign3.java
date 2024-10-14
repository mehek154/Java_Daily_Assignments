class Demo{
	public static void main(String[] args){
		char c='A';
		for(int i=1;i<=5;i++){
			for(int j=0;j<=5-i;j++){
				System.out.print(c+"  ");
			}
			c++;
			System.out.println();
		}
	}
}