package JCF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(null); //可以接受null，TreeSet不行
		hs.add(1000);
		hs.add(20);
		hs.add(3);
		hs.add(40000);
		hs.add(5000000);
		hs.add(3);	//重复
		hs.add(null);	//重复，相当于没有加进去
		
		System.out.println(hs.size());
		if(hs.contains(6)) {
			hs.add(6);
		}
		System.out.println(hs.size());
		hs.remove(4);
		System.out.println(hs.size());
		//hs.clear();
		//System.out.print(hs.size());
		
		System.out.println("===========for循环遍历=============");//HashSet是一个无序的集合结构
		for(Integer item:hs) {
			System.out.println(item);//定义一个元素，可以遍历它，这里的元素是HashSet类的一个对象
		}
		
		System.out.println("===========测试集合交集=============");
		HashSet<String> set1=new HashSet<String>();
		HashSet<String> set2=new HashSet<String>();
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		
		set2.add("c");
		set2.add("d");
		set2.add("f");
		
		set1.retainAll(set2);
		System.out.println("交集是"+set1);
		
		System.out.println("===========测试多种遍历方法速度=============");
		HashSet<Integer> hs2=new HashSet<Integer>();
		
		for(int i=0;i<100000;i++) {
			hs2.add(i);
		}
		
		traverseByIterator(hs2);
		traverseByFor(hs2);
	}
	
	public static void traverseByIterator(HashSet<Integer> hs) {
		long startTime=System.nanoTime();
		System.out.println("=====迭代器遍历=====");
		Iterator<Integer> iter1=hs.iterator(); 
		while(iter1.hasNext()) {
			iter1.next();
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"纳秒");
	}
	
	public static void traverseByFor(HashSet<Integer> hs) {
		long startTime=System.nanoTime();
		System.out.println("=====For循环遍历====="); //HashSet推荐用foreach进行遍历
		for(Integer item : hs)
		{
			;//数组或者实现了iterator的类对象
		}	
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"纳秒");
	}
}
