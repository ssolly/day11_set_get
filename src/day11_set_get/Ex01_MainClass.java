package day11_set_get;

public class Ex01_MainClass {

	/*
	 # this
	  - this�� Ŭ���� �ڱ� �ڽ��� ��ġ ������ ������ �ִ�
	  - ��� �޼ҵ带 ����� �ڵ������� �����ȴ�
	  - �ڽ��� ���� Ŭ������ �ּҸ� ������ �ִ�
	 */
	
	public static void main(String[] args) {
		
		Ex01_This ex = new Ex01_This();
		System.out.println("ex : " + ex);	//��ü�� ���� ��ġ ���� = �ּ�
		
		ex.func01();
		ex.func02(); 
		System.out.println();
		
		ex.a=777;
		ex.func01();
		ex.func02();
	}
}
