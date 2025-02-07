package com.javachobo.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesMain { // 2.7

	public static void main(String[] args) {

		// Properties key(순서x 중복x) value(순서x 중복o)
		// setProperty(key, value) : 값을 입력 , getProperty(key) : value 값을 읽음, load() : 파일을 메모리에 할당
		// Enumeration(인터페이스)를 사용해서 반복자 패턴을 작성 
		// 파일로부터 값을 제공 받는다
		// 파일 작성 규칙: key=value 띄어쓰기X
		// 기본적인 성능은 Map과 같다
		// key, value의 타입은 String으로만 입력 가능
		
//		Properties props = new Properties();
//		
//		props.setProperty("time", "30");
//		props.setProperty("language", "kr");
//		props.setProperty("size", "10");

//		System.out.println(props.getProperty("time"));
//		System.out.println(props.getProperty("language"));
//		System.out.println(props.getProperty("size"));
		
//		Enumeration e = props.propertyNames(); // key 값을 반환
//		
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			System.out.println("key : " + element);
//			System.out.println("value : " + props.getProperty(element));
//		}
		
//		Properties prop = new Properties();
//		
//		try {
//			FileInputStream fis = new FileInputStream("src/input.txt"); // 무조건 예외처리 해야함		
//			prop.load(fis); // load(InputStream 타입)을 사용함. 각기 다른 예외 처리가 필요.
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();			
//		}
//		
//		String name = prop.getProperty("name");
//		System.out.println(name);
//		
//		String data = prop.getProperty("data");
//		System.out.println(data);
//		
//		String[] val = data.split(","); // String Class
//		
//		int sum = 0;
//		for(String s : val) {
//			System.out.print(s + " ");
//			int num = Integer.parseInt(s); // Wrapper Class
//			sum += num;
//		}
//		System.out.println();
//		System.out.println("합계 : " + sum);			
		
		Properties pros = new Properties();
		
		try {
			FileInputStream fil = new FileInputStream("src/student.txt");
			pros.load(fil);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
//		String kim = pros.getProperty("kim");
//		String park = pros.getProperty("park");
//		String lee = pros.getProperty("lee");
//		
//		String[] kimval = kim.split(",");
//		String[] parkval = park.split(",");
//		String[] leeval = lee.split(",");
//		
		int sum = 0;
		int avg = 0;
//	
//		for(String s : kimval) {
//			int num = Integer.parseInt(s);
//			sum += num;
//		}
//		avg = sum / kimval.length;
//		System.out.printf("이름 : kim 총점 : %d 평균 : %d\n", sum, avg);
//		sum = 0;
//		avg = 0;
//		
//		for(String s : parkval) {
//			int num = Integer.parseInt(s);
//			sum += num;
//		}
//		
//		avg = sum / parkval.length;
//		System.out.printf("이름 : park 총점 : %d 평균 : %d\n", sum, avg);
//		sum = 0;
//		avg = 0;
//		
//		for(String s : leeval) {
//			int num = Integer.parseInt(s);
//			sum += num;
//		}
//		
//		avg = sum / leeval.length;
//		System.out.printf("이름 : lee 총점 : %d 평균 : %d\n", sum, avg);
		
		
		Enumeration e = pros.propertyNames();
		
		String name = "";
		
		while(e.hasMoreElements()) {
			name = (String)e.nextElement();
			String[] score = pros.getProperty(name).split(",");
			
			for(String s : score) {
				int num = Integer.parseInt(s);
				sum += num;
			}
			avg = sum / score.length;
			System.out.printf("이름 : %s 총점 : %d 평균 : %d\n",name, sum, avg);
		}		
		
		e = pros.propertyNames();
		
		String[] key = new String[pros.size()];
		int k = 0;
		while(e.hasMoreElements()) {
			name = (String)e.nextElement();
			key[k] = name;
			k++;
		}
		
		for(int i=0; i<key.length; i++) {
			String s = pros.getProperty(key[i]);
			String[] val = s.split(",");
			for(int j=0; j<val.length; j++) {
				int num = Integer.parseInt(val[j]);
				sum += num;
			}
			avg = sum / val.length;
			System.out.printf("이름 : %s 총점 : %d 평균 : %d\n",key[i], sum, avg);
			sum = 0;
			avg = 0;
		}
		
	}

}
