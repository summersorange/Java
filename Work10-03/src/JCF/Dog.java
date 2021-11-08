package JCF;

public class Dog {
	private int size;
	
	public Dog(int size) {
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	
	//重写hashCode方法,equals方法,toString方法，
	//这三个方法三位一体，返回相同的值，需要同时被重写
	
	public int hashCode() {
		System.out.println("Dog hashCode()~~~~~~~~~~");
		return size;
	//Dog调用自身的hashCode返回的是size这个整数
	}
	//hashCode判定完后，继续第二个判定方法equals
	
	public boolean equals(Object obj2) {
		System.out.println("Dog equals()~~~~~~~~~~");
		if(0==size-((Dog)obj2).getSize()) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toSting() {
		System.out.println("Dog toString()~~~~~~~~~~");
		return size+ "";
	}
}
