class Demo{
	public static void main(String[] args){
		char c='a';
		for(int i=1;i<=4;i++){
			for(int j=0;j<=4-i;j++){
				System.out.print(c+ " ");
				c++;
			}
			if(i<2){
				c-=2;
			}else if(i<3){
				c-=1;
			}
			System.out.println();
		}
	}
}