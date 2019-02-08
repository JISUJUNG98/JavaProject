/*
 *    변수
 *    ===
 *      1. 변수의 종류
 *          클래스 영역에 설정하는 변수
 *          ========
 *             멤버 변수(전역변수)
 *             =======
 *                 = 객체마다 따로 사용하는 변수(인스턴스 변수, 객체변수)
 *                    int a;
 *                 =공통으로 사용하는 변수(공유 변수 = 클래스 변수)
 *                   static int a;   
 *                    class A
 *                    
 *                    A a=new A();
 *                      ==
 *                      객체(인스턴스,클래스변수)
 *                      
 *                
 *                
 *          
 *          메소드 영역안에 설정하는 변수
 *          ========
 *             지역 변수 (메소드 안에서만 사용 ==> 자동 삭제)
 */
public class MainClass {
	int kor;
	int eng;
	int math;
	String name;

	
	static String school_name; // 모든 학생이 공통으로 사용하는 변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m1=new MainClass();
		//m1=kor,eng,math,name\
		m1.name="홍길동";
		m1.school_name="SIST";
		MainClass m2=new MainClass();
		//m2=kor,eng,math,name
		m2.name="심청이";
		m2.school_name="쌍용";
		
		//school_name => m1,m2  공유
		
		//m1.name = 홍길동
		

	}

}
