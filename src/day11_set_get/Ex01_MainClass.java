package day11_set_get;

public class Ex01_MainClass {

	/*
	 # this
	  - this는 클래스 자기 자신의 위치 정보를 가지고 있다
	  - 멤버 메소드를 만듦녀 자동적으로 생성된다
	  - 자신이 속한 클래스의 주소를 가지고 있다
	 */
	
	public static void main(String[] args) {
		
		Ex01_This ex = new Ex01_This();
		System.out.println("ex : " + ex);	//객체에 대한 위치 정보 = 주소
		
		ex.func01();
		ex.func02(); 
		System.out.println();
		
		ex.a=777;
		ex.func01();
		ex.func02();
	}
}
