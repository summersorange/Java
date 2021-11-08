package JCF;
import java.util.*;
public class ObjectHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Cat> hs=new HashSet<Cat>();
		System.out.println("==========CatHashSet==============");
		hs.add(new Cat(1));
		hs.add(new Cat(2));
		hs.add(new Cat(3));
		hs.add(new Cat(3));	//四个元素，仍然认为是两个不同的猫
		System.out.println(hs.size());
		
		HashSet<Dog> hs2=new HashSet<Dog>();
		System.out.println("==========DogHashSet==============");
		hs2.add(new Dog(1));
		hs2.add(new Dog(2));
		hs2.add(new Dog(3));
		hs2.add(new Dog(3));	
		System.out.println(hs2.size());
	}

}