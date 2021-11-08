package JCF;
import java.util.*;

public class ObjectTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需要加入到TreeSet，需要实现Comparable接口，即实现compareTo方法
		//Integer类实现了Comparable接口，可比较的
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
