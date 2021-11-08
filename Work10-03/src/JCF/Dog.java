package JCF;

public class Dog {
	private int size;
	
	public Dog(int size) {
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	
	//��дhashCode����,equals����,toString������
	//������������λһ�壬������ͬ��ֵ����Ҫͬʱ����д
	
	public int hashCode() {
		System.out.println("Dog hashCode()~~~~~~~~~~");
		return size;
	//Dog���������hashCode���ص���size�������
	}
	//hashCode�ж���󣬼����ڶ����ж�����equals
	
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
