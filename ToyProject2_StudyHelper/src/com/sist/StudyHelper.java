package com.sist;

import java.util.Scanner;

public class StudyHelper implements ToyProject2_StudyHelper {

	public static void main(String[] args) {
		StudyHelper app = new StudyHelper();
		app.commandProcessor();

	}

	@Override
	public void commandProcessor() {
		System.out.println("::::수학도우미 시작::::");
		System.out.println("도움말 : help");
		Scanner sc;
		while (true) {
			sc = new Scanner(System.in);
			System.out.print("$ ");
			String result = sc.next();
			if (result == null) {

			} else if (result.equalsIgnoreCase("exit")) {
				System.out.println(":::: 수학 도우미가 종료되었습니다 ::::");
				break;
			} else {
				print(result);
			}

		}
		sc.close();

	}

	private void print(String result) {
		Scanner sc = new Scanner(System.in);
		if (result.equalsIgnoreCase("help")) {
			help();
		} else if (result.equalsIgnoreCase("tt")) {
			System.out.print("숫자를 입력하세요 : ");

			int num = sc.nextInt();
			timesTable(num);

		} else {
			System.out.println("숫자 두 개를 입력하세요 : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			switch (result) {
			case "max":
				max(num1, num2);
				break;
			case "min":
				min(num1, num2);
				break;
			case "sum":
				sum(num1, num2);
				break;
			case "sub":
				sub(num1, num2);
				break;
			case "mul":
				mul(num1, num2);
				break;
			case "div":
				div(num1, num2);
				break;
			case "rem":
				rem(num1, num2);
				break;
			default:
				break;
			}
		}

	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void max(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void min(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rem(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void timesTable(int num) {
		// TODO Auto-generated method stub
		
	}



}
