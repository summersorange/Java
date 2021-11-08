package JCF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(3);
		l1.add(2); //ctrl+alt+���¼�ͷ���ٸ���һ�д���
		l1.add(5);
		l1.add(6);
		l1.add(6);
		System.out.println(l1.size());
		l1.addFirst(90);
		l1.add(3,10);
		l1.remove(3);
		
		System.out.println("=====��������=====");
		LinkedList<Integer> list=new LinkedList<Integer>(); //ע��û��������С
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
	System.out.println("=====����������=====");
	Iterator<Integer> iter1=list.iterator(); //a1���β�
	while(iter1.hasNext()) {
		iter1.next();
	}
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(duration+"����");
}

public static void traverseByIndex(LinkedList<Integer> list) {
	long startTime=System.nanoTime();
	System.out.println("=====�����������====="); //LinkedList��ò�Ҫ�����漴�������ʣ������
	for(int i=0;i<list.size();i++) {
		list.get(i); 
		//��Ϊ��ͨ������ʵ�ֵ�
	}
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(duration+"����");
	//LinkedListǧ������������ʣ������
}

public static void traverseByFor(LinkedList<Integer> list) {
	long startTime=System.nanoTime();
	System.out.println("=====Forѭ������=====");//��ͷ��β��˳������Ǻܿ��
	for(Integer item : list)
	{
		;//�������ʵ����iterator�������
	}	
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(duration+"����");
}
}
