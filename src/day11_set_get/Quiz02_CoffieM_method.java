package day11_set_get;

import java.util.Scanner;

public class Quiz02_CoffieM_method {

	Quiz02_CoffeeMachine cm = new Quiz02_CoffeeMachine();
	
	public int input() {
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.print(">>> ");
		select = sc.nextInt();
		return select;
	}
	
	public void selectCoffee() {
		System.out.println("1. ���������� (1000��)");
		System.out.println("2. �Ƹ޸�ī�� (1500��)");
		System.out.println("3. ���     (1300��)");
		System.out.println("4. ��     (2000��)");
		int select;
		select = input();
		cm.setMenuNum(select);
		
		switch(select) {
		case 1 :
			cm.setMenu("����������");
			cm.setTotal(1000);
			break;
		case 2 :
			cm.setMenu("�Ƹ޸�ī��");
			cm.setTotal(1500);
			break;
		case 3 :
			cm.setMenu("���");
			cm.setTotal(1300);
			break;
		case 4 :
			cm.setMenu("��");
			cm.setTotal(2000);
			break;
		} 
	}
	
	public void hotIce() {
		System.out.println("1. hot");
		System.out.println("2. ice (+500��)");
		int select;
		select = input();
		
		switch(select) {
		case 1 :
			cm.setHotIce("������");
			break;
		case 2 :
			cm.setHotIce("���̽�");
			cm.setTotal(cm.getTotal()+500);
			break;
		}
	}
	
	public void coffeeBean() {
		System.out.println("1. �ɳ�");
		System.out.println("2. ��Ƽ���Ǿ� (+500��)");
		System.out.println("3. ���׸���   (+300��)");
		int select;
		select = input();
		
		switch(select) {
		case 1 :
			cm.setCoffeeBean("�ɳ�");
			break;
		case 2 :
			cm.setCoffeeBean("��Ƽ���Ǿ�");
			cm.setTotal(cm.getTotal()+500);
			break;
		case 3 :
			cm.setCoffeeBean("���׸���");
			cm.setTotal(cm.getTotal()+300);
			break;
		}
	}
	
	public void printMenu() {
		System.out.print(cm.getHotIce()+" "+cm.getMenu()+"("+cm.getCoffeeBean()+")" );
		System.out.println("  �� ���� : " + cm.getTotal()+"��");
	}
	
	public void pay() {
		System.out.println("1. ī�� ���");
		System.out.println("2. ���� ���");
		int select;
		select = input();
		
		switch(select) {
		case 1 :
			System.out.println("ī�带 �������ּ���");
			System.out.println(cm.getTotal()+"�� ���� �Ϸ�");
			System.out.println();
			break;
		case 2 :
			System.out.print("�ݾ��� �������ּ���\n ���� �ݾ� ");
			int price;
			price = input();
			if (price==cm.getTotal()) {
				System.out.println(cm.getTotal()+"�� ���� �Ϸ�");
			} else if (price>cm.getTotal()) {
				System.out.println("���� �Ϸ�");
				System.out.println("�Ž����� : " +(price-cm.getTotal())+"��");
			} else {
				System.out.println("���� �Ұ� : ���� �ݾ��� �����մϴ�");
			}
			break;
		}
	}
	
	
}
