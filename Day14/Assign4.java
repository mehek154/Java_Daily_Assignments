class Demo{
	public static void main(String[] args){
		char c1='a';
		char c2='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(c1 +"  ");
				}else{
					System.out.print(c2 +"  ");
				}
			}
			System.out.println();
		}
	}
} 