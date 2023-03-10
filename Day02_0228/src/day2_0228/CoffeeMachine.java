package day2_0228;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu, money, remain;
		int coin500 = 0, coin100 = 0, coin50 = 0;

		while (true) {

			System.out.println("[KOSTA CAFE]");
			System.out.println("0. 종료");
			System.out.println("1. 커피(350원)");
			System.out.println("2. 우유(150원)");
			System.out.println("3. 핫초코(450원)");

			System.out.println("====선택하세요!====");
			menu = sc.nextInt();

			if (menu == 0)
				break;

			System.out.println("====돈을 넣어주세요!====");
			money = sc.nextInt();

			switch (menu) {
			case 1:
				remain = money - 350;
				break;
			case 2:
				remain = money - 150;
				break;
			case 3:
				remain = money - 450;
				break;
			default:
				remain = money;
			}// switch

			coin500 = remain / 500;
			remain = remain % 500;

			coin100 = remain / 100;
			remain = remain % 100;

			coin50 = remain / 50;
			remain = remain % 50;

			System.out.println("잔돈 : "); // 잔돈 : 500(1개) 100(1개) 50(1개)

			if (coin500 > 0)
				System.out.println("500(" + coin500 + ")");
			if (coin100 > 0)
				System.out.println("100(" + coin100 + ")");
			if (coin50 > 0)
				System.out.println("50(" + coin50 + ")");

			System.out.println();
		} // while
	}// main

}// CoffeeMachine