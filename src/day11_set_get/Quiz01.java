package day11_set_get;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Quiz01_method ex = new Quiz01_method();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1.로그인  2.가입  3.로그아웃");
			System.out.print(">>> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				ex.login();
				break;
			case 2 :
				ex.joinMember();
				break;
			case 3 :
				System.out.println("로그 아웃");
				return;
			}
		}
	}
}
