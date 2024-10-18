class Demo{
	public static void main(String[] args){
		int arr1[]={1,2,3};
		int arr2[]={4,5,6};
		int mergedArr[]=new int[arr1.length+arr2.length];
		//copy elemnets from 1st array to merged array
		for(int i=0;i<arr1.length;i++){
			mergedArr[i]=arr1[i];
		}
		//copy elemnets from 2nd array to merged array
		for(int i=0;i<arr2.length;i++){
			mergedArr[arr1.length+i]=arr2[i];
		}
		//Print merged array
		System.out.println("Merged Array: ");
		for(int i=0;i<mergedArr.length;i++){
			System.out.println(mergedArr[i]);
		}
		System.out.println();
	}
}