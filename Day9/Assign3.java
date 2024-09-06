class Demo{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			char c1='A';
			char c2='a';
			for(int j=0;j<=4-i;j++){
				if(i%2==1){
					System.out.print(c1 +" ");
					c1++;
				}else{
					System.out.print(c2 +" ");
					c2++;
				}
			}
			System.out.println();
		}
	}
}