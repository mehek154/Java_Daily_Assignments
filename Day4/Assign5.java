class Demo{
	public static void main(String[] args){
		for(int n=1;n<=3;n++){
			for(int m=1;m<=4;m++){
				if(m%2==1){
					System.out.print("1 ");
				}else{
					System.out.print("0 ");
				}
			}
			System.out.println(" ");
		}
	}
}