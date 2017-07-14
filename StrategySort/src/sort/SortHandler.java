package sort;

// 处理排序接口对象
public class SortHandler {
	private Sort sortObj;		// 排序接口对象
	
	public int[] sort(int[] arr){
		sortObj.sort(arr);
		return arr;
	}
	
	public void setSortObj(Sort sortObj){
		this.sortObj = sortObj;
	}
}
