class Demo{
	public static void main(String[] args){
		int a=7;
		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				if(j>0){
					a--;
				}
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}