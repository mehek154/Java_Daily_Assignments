class Demo{
	public static void main(String[] args){
		int n;
		for(int i=0;i<4;i++){
			n=7-i;
			for(int j=0;j<=i;j++){
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}
	}
}