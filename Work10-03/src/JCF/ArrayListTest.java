package JCF;
import java.util.ArrayList;
import java.util.Iterator;
//vector��ArraYlIST�÷�����һ��
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> s1=new ArrayList<Integer>();
		s1.add(1);
		s1.add(2); //ctrl+alt+���¼�ͷ���ٸ���һ�д���
		s1.add(3);
		s1.add(4);
		//ArrayList�Զ�װ�䣬integer4�Զ����integer(3)�Ķ���
		//Ȼ�����ArrayLiat������
		s1.add(5);
		s1.add(6);
		s1.add(new Integer(6));//һ���߸�Ԫ��
		
		System.out.println("The third element is");
		System.out.println(s1.get(3));//���ʵ��ĸ�Ԫ��
		s1.remove(3); //ɾ�����ĸ�Ԫ�أ�����Ԫ����ǰŲ
		s1.add(3, 9); //�ڵ��ĸ�Ԫ�ص�λ���ϲ���9������Ԫ������Ų
		
		System.out.println("=====��������=====");
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
		System.out.println("=====����������=====");
		Iterator<Integer> iter1=a1.iterator(); //a1���β�
		while(iter1.hasNext()) {
			iter1.next();
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"����");
	}
	
	public static void traverseByIndex(ArrayList<Integer> a1) {
		long startTime=System.nanoTime();
		System.out.println("=====�����������=====");
		for(int i=0;i<a1.size();i++) {
			a1.get(i); 
			//��Ϊ��ͨ������ʵ�ֵ�
		}
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"����");
	}
	
	public static void traverseByFor(ArrayList<Integer> a1) {
		long startTime=System.nanoTime();
		System.out.println("=====Forѭ������=====");
		for(Integer item : a1)
		{
			;//�������ʵ����iterator�������
		}	
		long endTime=System.nanoTime();
		long duration=endTime-startTime;
		System.out.println(duration+"����");
	}
}
