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
		System.out.println("::::::::::::도우미 명령어::::::::::::::");
		System.out.println("수학도우미 입니다.");
		System.out.println("명령어 입력 후 숫자를 입력해 주세요.");
		System.out.println("max : 두 수 중 큰 값을 구해줍니다.");
		System.out.println("min : 두 수 중 작은 값을 구해줍니다.");
		System.out.println("sum : 두 수의 덧셈을 해 줍니다.");
		System.out.println("sub : 두 수의 뺄셈을 해 줍니다.");
		System.out.println("mul : 두 수의 곱셈을 구해줍니다.");
		System.out.println("div : 두 수의 나눗셈을 해 줍니다.");
		System.out.println("rem : 두 수의 나머지를 구해줍니다.");
		System.out.println("tt : 특정 수의 구구단을 출력해줍니다.");
		System.out.println("    사용례(tt 4)");
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
		for(int i=1; i<10; i++) {
			System.out.println(num+" X "+i+"="+(num*i));
		}
		
	}



}
