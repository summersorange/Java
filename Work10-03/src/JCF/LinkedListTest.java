package JCF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(3);
		l1.add(2); //ctrl+alt+向下箭头快速复制一行代码
		l1.add(5);
		l1.add(6);
		l1.add(6);
		System.out.println(l1.size());
		l1.addFirst(90);
		l1.add(3,10);
		l1.remove(3);
		
		System.out.println("=====遍历方法=====");
		LinkedList<Integer> list=new LinkedList<Integer>(); //注意没有容器大小
		for(int i=0;i<100000;i++)
		{
			list.add(i);
		}
		
		traverseByIterator(list);
		traverseByIndex(list);
		traverseByFor(list);
	
		
}

public static void traverseByIterator(LinkedList<Integer> list) {
	long startTime=System.nanoTime();
	System.out.println("=====迭代器遍历=====");
	Iterator<Integer> iter1=list.iterator(); //a1是形参
	while(iter1.hasNext()) {
		iter1.next();
	}
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(duration+"纳秒");
}

public static void traverseByIndex(LinkedList<Integer> list) {
	long startTime=System.nanoTime();
	System.out.println("=====随机索引遍历====="); //LinkedList最好不要采用随即索引访问，会很慢
	for(int i=0;i<list.size();i++) {
		list.get(i); 
		//因为是通过数组实现的
	}
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(duration+"纳秒");
	//LinkedList千万不能用随机访问，会很慢
}

public static void traverseByFor(LinkedList<Integer> list) {
	long startTime=System.nanoTime();
	System.out.println("=====For循环遍历=====");//从头到尾的顺序访问是很快的
	for(Integer item : list)
	{
		;//数组或者实现了iterator的类对象
	}	
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(duration+"纳秒");
}
}
