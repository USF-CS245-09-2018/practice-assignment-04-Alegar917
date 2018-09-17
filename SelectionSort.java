public class SelectionSort implements SortingAlgorithm{
	public void sort(int[]a){
		for(int i=0;i<a.length;i++){
			swap(i,min(i,a),a);
		}
	}
	public int min(int from,int[]a){
		int min=from;
		for(int i=from+1;i<a.length;i++){
			if(a[i]<a[min]){
				min=i;
			}
		}
		return min;
	}
	public void swap(int a, int b,int[]arr){
		int tep=arr[a];
		arr[a]=arr[b];
		arr[b]=tep;
	}
	
}
