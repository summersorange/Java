package com.test;

import java.util.Calendar;

public class CalendarTest {
	Calendar calendar=Calendar.getInstance();//c(calendar)��Calendar������һ���������
	
	public void test1(){ 
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1; //��Ϊ�·���0-11����Ҫ��1����ʵ���·�
		int date=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR_OF_DAY);//24Сʱ��ʾ
		int minute=calendar.get(Calendar.MINUTE);
		int weekday=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("������"+year+"��"+month+"��"+date+"��"+hour+"ʱ"+minute+"��"+"����"+weekday);
		
	}
	public void test2(){
		calendar.add(Calendar.YEAR, 1);//һ���Ľ���
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int date=calendar.get(Calendar.DATE);
		System.out.println("һ���Ľ���"+year+"��"+month+"��"+date+"��");
	}
		
	
	public void test3(){
		//�����µ����һ��
		int currentMonth=6;//ʵ��������
		calendar.set(calendar.get(Calendar.YEAR), currentMonth, 1);
		calendar.add(Calendar.DATE, -1);
		int day=calendar.get(Calendar.DATE);
		System.out.println("6�µ����һ��"+day+"��");
	}
	
	
	public void test4(){
		//��������
		calendar.set(Calendar.YEAR, 2000);
		System.out.println("������"+calendar.get(Calendar.YEAR)+"��");
		
		calendar.set(2008, 11, 5);
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		System.out.println("������"+year+"��"+month+"��"+date+"��");
	}
	
	
	public void test5(){
		calendar.set(2008, 11, 5);
		calendar.roll(Calendar.DAY_OF_MONTH, -8);//��Ӱ���·ݣ�add����Ӱ��
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("2018.12.5,��roll����8�죬������"+year+"��"+month+"��"+date+"��");
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