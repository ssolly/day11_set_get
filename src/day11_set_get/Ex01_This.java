package day11_set_get;

public class Ex01_This {

	public int a = 10;
	
	public void func01() {
		int a = 12345;
		System.out.println("01 a : "+a);
		System.out.println("01 this.a : " + this.a);	//Ex01_This �ٱ��� a
		System.out.println("this : " + this);
		System.out.println();
		this.func02();
		func02();			//���� ���
	}
	
	public void func02() {
		System.out.println("02 a : " + a);
	}
	
}
