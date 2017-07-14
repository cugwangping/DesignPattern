package sort;

// 插入排序
public class InsertSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub	
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                } else
                    break;
            }
            arr[j] = temp;
        }
        return arr;
	}
}
