package com.sist;

import java.util.Scanner;

public class TimesTable {

	
	public void commandProcessor() {
		System.out.println("Hello");
		System.out.println("Hello");
		
		System.out.println("******구구단 프로그램*******"); 
		Scanner kb;
		while(true) {
			System.out.print("$ ");
			kb = new Scanner(System.in);
			String number = kb.next();
			if(number.equalsIgnoreCase("exit")) {
				break;
			} else {
				printTimesTable(Integer.parseInt(number));
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