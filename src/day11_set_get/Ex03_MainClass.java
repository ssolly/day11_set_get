package day11_set_get;

// 정보 은닉, 캡슐화
public class Ex03_MainClass {

	public static void main(String[] args) {
		
		Ex03_Set_Get ex = new Ex03_Set_Get();
		ex.setAge(20);
		ex.agePrint();

		ex.setNum(32456);
		int num = ex.getNum()-1000;
		System.out.println("연산 결과 : " + num);
		
	}
}
