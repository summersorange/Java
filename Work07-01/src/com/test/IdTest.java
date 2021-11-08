package com.test;
import java.util.Scanner;
import java.util.Calendar;
import java.lang.*;



public class IdTest {
	static Calendar today=Calendar.getInstance();
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入身份证");
		String idNumber=input.next();
		idNumberTest(idNumber);			
	}
	public static void idNumberTest(String idNumber) {
		switch(idNumber.length()) 
		{	
			case 18:
			String yearString=idNumber.substring(6,10);//substring从一个较大字符串提取一小段字符
			String monthString=idNumber.substring(10,12);
			String dayString=idNumber.substring(12,14);
			
			int year=Integer.decode(yearString);
			int month=Integer.decode(monthString);
			int day=Integer.decode(dayString);
			Calendar ex=Calendar.getInstance();
			ex.set(year, month+1,1);
			ex.add(Calendar.DAY_OF_MONTH,-1);
			
			
			//parse ：将字符串转换成时间； parse ()返回的是一个Date类型数据， 
			//format ：将时间转换成字符串； format 返回的是一个StringBuffer类型的数据
			if((year<1900 || year>today.get(Calendar.YEAR))||(month<1 || month>12)||(day<1 || day>ex.get(Calendar.DAY_OF_MONTH)))
			{
				System.out.println("省份证不合法");
			}
			else 
			{
				System.out.println("你的身份证号码是"+year+"年"+month+"月"+day+"日");
				System.out.println(year+"-"+month+"-"+day);
			}
			break;
			default:
				System.out.println("身份证不合法");
			break;
		}
			
	}
	
}
