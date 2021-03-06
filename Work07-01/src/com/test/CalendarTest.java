package com.test;

import java.util.Calendar;

public class CalendarTest {
	Calendar calendar=Calendar.getInstance();//c(calendar)是Calendar这个类的一个具体对象
	
	public void test1(){ 
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1; //因为月份是0-11，需要加1才是实际月份
		int date=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR_OF_DAY);//24小时表示
		int minute=calendar.get(Calendar.MINUTE);
		int weekday=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("现在是"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+"星期"+weekday);
		
	}
	public void test2(){
		calendar.add(Calendar.YEAR, 1);//一年后的今天
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int date=calendar.get(Calendar.DATE);
		System.out.println("一年后的今天"+year+"年"+month+"月"+date+"日");
	}
		
	
	public void test3(){
		//求六月的最后一天
		int currentMonth=6;//实际是七月
		calendar.set(calendar.get(Calendar.YEAR), currentMonth, 1);
		calendar.add(Calendar.DATE, -1);
		int day=calendar.get(Calendar.DATE);
		System.out.println("6月的最后一天"+day+"号");
	}
	
	
	public void test4(){
		//设置日期
		calendar.set(Calendar.YEAR, 2000);
		System.out.println("今年是"+calendar.get(Calendar.YEAR)+"年");
		
		calendar.set(2008, 11, 5);
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		System.out.println("现在是"+year+"年"+month+"月"+date+"日");
	}
	
	
	public void test5(){
		calendar.set(2008, 11, 5);
		calendar.roll(Calendar.DAY_OF_MONTH, -8);//不影响月份，add方法影响
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("2018.12.5,用roll减少8天，现在是"+year+"年"+month+"月"+date+"日");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarTest c=new CalendarTest();
		c.test1();
		System.out.println("=========");
		c.test2();
		System.out.println("=========");
		c.test3();
		System.out.println("=========");
		c.test4();
		System.out.println("=========");
		c.test5();
	}

}
