package com.test;
import java.util.Scanner;
import java.util.Calendar;
import java.lang.*;



public class IdTest {
	static Calendar today=Calendar.getInstance();
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���������֤");
		String idNumber=input.next();
		idNumberTest(idNumber);			
	}
	public static void idNumberTest(String idNumber) {
		switch(idNumber.length()) 
		{	
			case 18:
			String yearString=idNumber.substring(6,10);//substring��һ���ϴ��ַ�����ȡһС���ַ�
			String monthString=idNumber.substring(10,12);
			String dayString=idNumber.substring(12,14);
			
			int year=Integer.decode(yearString);
			int month=Integer.decode(monthString);
			int day=Integer.decode(dayString);
			Calendar ex=Calendar.getInstance();
			ex.set(year, month+1,1);
			ex.add(Calendar.DAY_OF_MONTH,-1);
			
			
			//parse �����ַ���ת����ʱ�䣻 parse ()���ص���һ��Date�������ݣ� 
			//format ����ʱ��ת�����ַ����� format ���ص���һ��StringBuffer���͵�����
			if((year<1900 || year>today.get(Calendar.YEAR))||(month<1 || month>12)||(day<1 || day>ex.get(Calendar.DAY_OF_MONTH)))
			{
				System.out.println("ʡ��֤���Ϸ�");
			}
			else 
			{
				System.out.println("������֤������"+year+"��"+month+"��"+day+"��");
				System.out.println(year+"-"+month+"-"+day);
			}
			break;
			default:
				System.out.println("���֤���Ϸ�");
			break;
		}
			
	}
	
}
