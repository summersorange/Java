package JCF;
import java.util.*;

public class ObjectTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ҫ���뵽TreeSet����Ҫʵ��Comparable�ӿڣ���ʵ��compareTo����
		//Integer��ʵ����Comparable�ӿڣ��ɱȽϵ�
		System.out.print("==========TigerTreeTest==============");
		
		TreeSet<Tiger> ts=new TreeSet<Tiger>(); 
		ts.add(new Tiger(1));
		ts.add(new Tiger(2));
		ts.add(new Tiger(2));
		ts.add(new Tiger(3));
		ts.add(new Tiger(4));
		System.out.print(ts.size());
	}

}
