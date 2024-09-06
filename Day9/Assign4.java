class Demo{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			char c='A';
			for(int j=0;j<=4-i;j++){
				System.out.print(c +" ");
				c++;
			}
			System.out.println();
		}
	}
}
			