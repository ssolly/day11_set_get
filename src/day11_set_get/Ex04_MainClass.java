package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {
	
	public static void main(String[] args) {
		
		Ex04_Set_Get ex = new Ex04_Set_Get();
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		// ��ü ���� �� setter�� ���� ������ ���� ����
		ex.setName(name);
		
		// ���̸� ������ ����ϴ� �޼ҵ� ���� �� age ����
		age = calcAge(age);
		ex.setAge(age);
		
		
		// ����� ���� getter�� ���� main���� ���
		// [ ]���� ���̴� [ ]�� �Դϴ�
		System.out.println(ex.getName()+"���� �� ���̴� "+ex.getAge()+"�� �Դϴ�");
	}

	public static int calcAge(int age) {
		age = age-1;
		return age;
	}
}
