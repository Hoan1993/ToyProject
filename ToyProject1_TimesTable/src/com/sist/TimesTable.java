package com.sist;

import java.util.Scanner;

public class TimesTable {
	
	public void commandProcessor() {
		//테스트
		
		System.out.println("Hello");
		System.out.println("Hi");
		
		System.out.println("******구구단 프로그램*******"); 
		Scanner kb;
		while(true) {
			System.out.print("$ ");
			kb = new Scanner(System.in);
			String number = kb.next();
			if(number.equalsIgnoreCase("exit")) {
				break;
			}else {
				try {
					printTimesTable(Integer.parseInt(number));
				}catch(Exception e) {
					System.out.println("없는 명령어 입니다.");
				}
			}
				
			
		}
		System.out.println("******구구단 프로그램 종료*******");
		kb.close();
		
		
	}

	private void printTimesTable(int number) {
		int i;
		for(i=1; i<10; i++) {
			System.out.println(number+" X "+i+"="+(number*i));
		}
		
	}

	public static void main(String[] args) {
		TimesTable app = new TimesTable();
		app.commandProcessor();

	}

}