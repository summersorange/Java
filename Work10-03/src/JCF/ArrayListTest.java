package JCF;
import java.util.ArrayList;
import java.util.Iterator;
//vector和ArraYlIST用法基本一致
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> s1=new ArrayList<Integer>();
		s1.add(1);
		s1.add(2); //ctrl+alt+向下箭头快速复制一行代码
		s1.add(3);
		s1.add(4);
		//ArrayList自动装箱，integer4自动变成integer(3)的对象
		//然后放入ArrayLiat的容器
		s1.add(5);
		s1.add(6);
		s1.add(new Integer(6));//一共七个元素
		
		System.out.println("The third element is");
		System.out.println(s1.get(3));//访问第四个元素
		s1.remove(3); //删除第四个元素，后面元素往前挪
		s1.add(3, 9); //在第四个元素的位置上插入9，后面元素往后挪
		
		System.out.println("=====遍历方法=====");
		ArrayList<Integer> as=new ArrayList<Integer>(100000);
		for(int i=0;i<100000;i++)
		{
			as.add(i);
		}
		
		traverseByIterator(as);
		traverseByIndex(as);
		traverseByFor(as);
			
	}
	
	public static void traverseByIterator(ArrayList<Integer> a1) {
		long startTime=System.nanoTime();
		System.out.println("=====迭代器遍历=====");
		Iterator<Integer> iter1=a1.iterator(); //a1是形参
		while(iter1.hasNext()) {
			iter1.next();
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"纳秒");
	}
	
	public static void traverseByIndex(ArrayList<Integer> a1) {
		long startTime=System.nanoTime();
		System.out.println("=====随机索引遍历=====");
		for(int i=0;i<a1.size();i++) {
			a1.get(i); 
			//因为是通过数组实现的
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"纳秒");
	}
	
	public static void traverseByFor(ArrayList<Integer> a1) {
		long startTime=System.nanoTime();
		System.out.println("=====For循环遍历=====");
		for(Integer item : a1)
		{
			;//数组或者实现了iterator的类对象
		}	
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"纳秒");
	}
}
