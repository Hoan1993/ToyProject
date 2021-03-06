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
		System.out.println("명령어를 입력하세요.");
		Scanner sc;
		while (true) {
			sc = new Scanner(System.in);
			System.out.print("$ ");
			String result = sc.next();
			if (result.length() == 0) {
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
			System.out.print("숫자를 입력하세요 :   ");

			int num = sc.nextInt();
			timesTable(num);

		} else {
			System.out.println("정수 두 개를 입력하세요 : ");
			
			try {
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
			} catch (Exception e) {
				System.out.println("정수를 입력하시라고요.");
			}

		}

	}

	@Override
	public void help() {
		// TODO Auto-generated method stub

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
		System.out.println("큰 수 : "+Math.max(num1, num2));
		
	}

	@Override
	public void min(int num1, int num2) {
		System.out.println("작은 수 : "+Math.min(num1, num2));
		
	}

	@Override
	public void sum(int num1, int num2) {
		System.out.println("합 : "+num1+num2);
		
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println("차 : "+Math.abs(num1-num2));
		
	}

	@Override
	public void mul(int num1, int num2) {
		System.out.println("곱 : "+num1*num2);
		
	}

	@Override
	public void div(int num1, int num2) {
		System.out.printf("나누기 : %.8f", (float)num1/num2);
		System.out.println();
		
	}

	@Override
	public void rem(int num1, int num2) {
		System.out.println("나머지 : "+num1%num2);
		
	}

	@Override
	public void timesTable(int num) {
		for(int x=1;x<10;x++) {
			System.out.println(x+"X"+num+"="+x*num);
		}
		System.out.println("구구단 끝");
		
	}



}
