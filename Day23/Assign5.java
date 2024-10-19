class Demo{
	public static void main(String[] args){
		int n=4;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(j<3-i){
					System.out.print("  ");
				}else{
					System.out.print(j+1 +" ");
				}
			}
			System.out.println();
		}
	}
}