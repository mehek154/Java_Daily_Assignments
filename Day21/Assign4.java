class Demo{
	public static void main(String[] args){
		for(int i=0;i<=3;i++){
			char c='A';
			c+=i;
			for(int j=0;j<=3-i;j++){
				System.out.print(c +" ");
				c+=2;
			}
			System.out.println();
		}
	}
}