class Demo{
	public static void main(String[] args){
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=0;j<=4-i;j++){
				System.out.print(7*n +"  ");
				n++;
			}
			System.out.println();
		}
	}
}