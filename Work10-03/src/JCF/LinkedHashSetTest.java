package JCF;
import java.util.*;
public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(null);
		lhs.add(1000);
		lhs.add(20);
		lhs.add(3);
		lhs.add(40000);
		lhs.add(5000000);
	
		
		System.out.println("===========for循环遍历=============");
		for(Integer item:lhs) {
			System.out.println(item);//LinkedHashSet保留了元素的插入顺序，遍历时按顺序输出
		}
	}

}
