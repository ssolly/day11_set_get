package day11_set_get;

public class Ex03_Set_Get {

	private int num;
	private int age;
	private String name;
	//alt+shift+s : setter&getter ����� �۾� ����Ű
	
	//private�� ������ �ν��Ͻ������� ���� �����ϱ� ���� setter.
	//private�� �����Ǿ� �־� �ܺο��� ���������� ���� ������ �� ����
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void agePrint() {
		System.out.println("age : " + age);
	}
}
