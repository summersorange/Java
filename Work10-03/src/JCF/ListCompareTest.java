package JCF;
import java.util.*;
public class ListCompareTest {

		//ArrayList & LinkedList Comparison of performance
		//ֻ�����򼯺Ͽ���ʹ�õ�������add����
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
			arrayList.add(i);  //add��ͷ���������Ԫ�ط���������������ƶ��������Ѿ� ȷ���ô�С
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"<--------ArrayList add");
		
		startTime=System.nanoTime(); //ֻ�е�һ�γ�ʼ����Ҫ�����������ͣ�����Ķ�����Ҫ�ˣ�������ֵ����
		for(int i=0;i<times;i++)
		{
			linkedList.add(i);  //LinkedList˫��������ָ��ָ��ģ���Ӹ����ף�ͷ��β��������
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------LinkedList add");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			arrayList.get(i);  //λ�÷��ʣ���������Ч����
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------ArrayList get");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			linkedList.get(i);  //λ��������ģ��������ʱ��ֽϲ�
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------LinkedList get");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			arrayList.remove(0);  //ɾ��ͷ�ڵ㣬����ڵ���ǰŲ������������ƶ�
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------ArrayList remove");
		
		startTime=System.nanoTime();
		for(int i=0;i<times;i++)
		{
			linkedList.remove(0);  //ֻ��Ҫɾ��һ���㣬���ᷢ������������ƶ�
		}
		endTime=System.nanoTime();
		duration=endTime-startTime;
		System.out.println(duration+"<--------LinkedList remove");
	}

}
