package day11_set_get;

import java.util.Scanner;

public class Quiz01_method {

	Quiz01_Set_Get ex = new Quiz01_Set_Get();
	
	public String inputId() {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("id �Է� : ");
		str = sc.next();
		return str;
	}
	
	public String inputPass() {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("password �Է� : ");
		str = sc.next();
		return str;
	}
	
	public void login() {
		if(ex.getId()==null) {
			System.out.println("�α��� ������ �������� �ʽ��ϴ�");
		} else {
			System.out.println(ex.getId());
			System.out.println(ex.getPass());
			String id, pass;
			id = inputId();
			pass = inputPass();
			if (id.equals(ex.getId()) && pass.equals(ex.getPass())) {
				System.out.println("�α��� ����");
			} else {
				if (!id.equals(ex.getId())) {
					System.out.println("�α��� ���� : ���̵� ���� �ʽ��ϴ�");
				} else if(!pass.equals(ex.getPass())) {
					System.out.println("�α��� ���� : ��й�ȣ�� ���� �ʽ��ϴ�");
				}
			}
		}
	}
	
	public void joinMember() {
		String id,pass;
		id = inputId();
		pass = inputPass();
		ex.setId(id);
		ex.setPass(pass);
		System.out.println(ex.getId());
		System.out.println(ex.getPass());
	}
}
