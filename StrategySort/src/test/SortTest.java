package test;

import sort.*;

//主函数，测试排序
public class SortTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,1,6,2,5,3,7,10,9};
	       int result[];
	       SortHandler sh=new SortHandler();
	       Sort bSort = new BubbleSort();	//冒泡排序
	       //Sort iSort = new InsertSort();	//插入排序
	       //Sort qSort = new QuickSort();    //使用快速排序 
	       
	       sh.setSortObj(bSort); //设置具体策略
	       System.out.println("冒泡排序......");
	       
	       //sh.setSortObj(iSort); //设置具体策略
	       //System.out.println("插入排序......");
	       
	       //sh.setSortObj(qSort); //设置具体策略
	       //System.out.println("快速排序......");
	       
	       result=sh.sort(arr);
	       
	       for(int i=0;i<result.length;i++)
	       {
	               System.out.print(result[i] + ",");
	       }
	}

}
