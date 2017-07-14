package sort;

// 冒泡排序
public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for(int i=0; i<len; i++){
			for(int j=i+1; j<len; j++){
				//int temp;
				if(arr[i]>arr[j]){
					arr[i] = arr[i]^arr[j];	// temp = y
					arr[j] = arr[i]^arr[j];	// y = x
					arr[i] = arr[i]^arr[j];	// x = temp
				}
			}
		}
		return arr;
	}
}
