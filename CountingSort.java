package test;

public class CountingSort {

	
	public static void Sort(int[] array, int maxValue){
		int[] outputArray = new int[array.length];
		int[] count = new int[maxValue+1]; //this is also sumCount
		
		for(int i=0;i<array.length;i++){
			count[array[i]]++;
		}
		
		//converting count to sum count
		for(int j=1;j<count.length;j++){
			count[j]=count[j-1]+count[j]; 
		}	
		
		for(int k=0;k<array.length;k++){
			outputArray[(count[array[k]]--)-1] = array[k];
		}
		
		for (int i : outputArray) {
			System.out.println(i+" ");
		}	
	}
	
	public static void main(String[] args) {
		int[] array = {10,7,12,4,7,9,13,1,0};
		CountingSort.Sort(array, 13);
	}
}
