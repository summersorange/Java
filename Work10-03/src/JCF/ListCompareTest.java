package JCF;
import java.util.*;
public class ListCompareTest {

		//ArrayList & LinkedList Comparison of performance
		//只有有序集合可以使用迭代器的add功能
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times=10*1000;
		ArrayList<Integer> arrayList=new ArrayList<>();
		LinkedList<Integer> linkedList=new LinkedList<>();
		
		System.out.println("Test times"+times);
		System.out.println("---------------------------");
		
		long startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			arrayList.add(i);  //add到头部，后面的元素发生大面积的数据移动，数组已经 确定好大小
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"<--------ArrayList add");
		
		startTime=System.nanoTime(); //只有第一次初始化需要声明数据类型，后面的都不需要了，都做赋值处理
		for(int i=0;i<times;i++)
		{
			linkedList.add(i);  //LinkedList双向链表都是指针指向的，添加更容易，头部尾部都可以
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------LinkedList add");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			arrayList.get(i);  //位置访问，索引表现效果好
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------ArrayList get");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			linkedList.get(i);  //位置是随机的，索引访问表现较差
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------LinkedList get");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			arrayList.remove(0);  //删除头节点，后面节点往前挪，大面积数据移动
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------ArrayList remove");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			linkedList.remove(0);  //只需要删除一个点，不会发生大面积数据移动
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------LinkedList remove");
	}

}
