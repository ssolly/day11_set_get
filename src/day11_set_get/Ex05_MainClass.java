package day11_set_get;

public class Ex05_MainClass {

	public static void main(String[] args) {
		
		// 객체 생성 후 각각의 값(kor,eng,math,sum,avg)을 저장핫요
		// 출력 하세요 (국,영,수,합,평균)
		int k=100, e=90, m=80;
		int sum=k+e+m;
		double avg = sum/3.0;
		
		Ex05_Set_Get ex = new Ex05_Set_Get();
		
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		ex.setSum(sum);
		ex.setAvg(avg);
		
		System.out.println("국어 : " + ex.getKor());
		System.out.println("영어 : " + ex.getEng());
		System.out.println("수학 : " + ex.getMath());
		System.out.println("총합 : " + ex.getSum());
		System.out.println("평균 : " + ex.getAvg());
		
	}
}
