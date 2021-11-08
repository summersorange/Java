package JCF;

public class Cat {
	private int size;
	public Cat(int size) {
		this.size=size;
	}
	//Cat没有自己的hashCode()方法，而是继承Object类的，返回了结合地址信息的整数
	//所以两个Cat(4)被认定为连个不同的吗猫
	
}
