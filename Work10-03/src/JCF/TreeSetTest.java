package JCF;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//lhs.add(null); //���󣬲��ܼ���null
		ts.add(1000);
		ts.add(20);
		ts.add(3);
		ts.add(40000);
		ts.add(5000000);
	
		
		System.out.println("===========forѭ������=============");
		for(Integer item:ts) {
			System.out.println(item);//TreeSet���մ�С�����˳�����
		}
	}

}
