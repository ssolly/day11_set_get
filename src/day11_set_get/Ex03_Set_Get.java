package day11_set_get;

public class Ex03_Set_Get {

	private int num;
	private int age;
	private String name;
	//alt+shift+s : setter&getter 만드는 작업 단축키
	
	//private로 지정된 인스턴스변수에 값을 세팅하기 위한 setter.
	//private로 지정되어 있어 외부에서 직접적으로 값을 세팅할 수 없다
	
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
