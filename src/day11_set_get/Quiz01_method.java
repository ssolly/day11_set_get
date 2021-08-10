package day11_set_get;

import java.util.Scanner;

public class Quiz01_method {

	Quiz01_Set_Get ex = new Quiz01_Set_Get();
	
	public String inputId() {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력 : ");
		str = sc.next();
		return str;
	}
	
	public String inputPass() {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("password 입력 : ");
		str = sc.next();
		return str;
	}
	
	public void login() {
		if(ex.getId()==null) {
			System.out.println("로그인 정보가 존재하지 않습니다");
		} else {
			System.out.println(ex.getId());
			System.out.println(ex.getPass());
			String id, pass;
			id = inputId();
			pass = inputPass();
			if (id.equals(ex.getId()) && pass.equals(ex.getPass())) {
				System.out.println("로그인 성공");
			} else {
				if (!id.equals(ex.getId())) {
					System.out.println("로그인 실패 : 아이디가 같지 않습니다");
				} else if(!pass.equals(ex.getPass())) {
					System.out.println("로그인 실패 : 비밀번호가 같지 않습니다");
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
