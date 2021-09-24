package com.test;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println("current time"+time);
		
		LocalTime specificTime=LocalTime.of(12,20,25,40);
		System.out.println("current time"+specificTime);
		
		LocalTime timeSH=LocalTime.now(ZoneId.of("Asia/Shanghai"));
		System.out.println("current time in Shanghai"+timeSH);
	}

}
