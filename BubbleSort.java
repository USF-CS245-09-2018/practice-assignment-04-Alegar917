public class BubbleSort implements SortingAlgorithm{

	public void sort(int [] a){
		boolean swaps=true;
		int j=0;
		while(swaps){
			swaps=false;
			for(int i=0;i<a.length-1-j;i++){
				if (a[i]>a[i+1]){
					swap(i,i+1,a);
					swaps=true;
				}
			}
			j++;
		}	
	}
	
	public void swap(int a, int b,int[]arr){
		int tep=arr[a];
		arr[a]=arr[b];
		arr[b]=tep;
	}
	
}