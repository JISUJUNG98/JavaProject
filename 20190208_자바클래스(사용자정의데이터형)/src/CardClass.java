/*
 *     자바  :  모든 내용 (메소드,변수) ==> 클래스 블럭 안에 있다.
 *     변수의 종류
 *     =========
 *     1) 전역 변수  :  다른 클래스에서 사용 가능
 *         = 따로 저장 : 인스턴스 변수
 *           ========> 반드시 new 사용해서 메모리를 생성 후 사용 가능
 *            A a=new A();
 *            a.변수명
 *            a.메소드명
 *                
 *                String s="";
 *                   s.trim()
 *            
 *         = 공통 저장 : 공통 변수
 *           ========> 그냥 사용 가능
 *           A a=new A();
 *           a.변수명
 *           a.메소드명
 *             
 *           ====> A.변수명
 *                       A.메소드명    ==> Math.random(), String.valueOf()
 *     2) 지역 변수  :  메소드 안에서만 사용 가능 (다른 클래스에서 접근 불가)
 */
class Card{
	
	//전역 벼수 ==> 모든 클래스에서 사용이 가능
	//생성 되는 시점 =>  Card c=new Card()
	int num;
	String type;
	
	
	// 공통(공유)변수 ==>다른 클래스에서 사용 가능
	// 생성 되는 시점 ==> 클래스가 로드되었을때 (가상머신이 클래스를 읽기 시작했을 때)
	static int width;
	static int height;
}
public class CardClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card.width=300;
		Card.height=350;
		
		//Card a=new Card();
		//a. 
		//Math.random();
		/*
		 * Card c1=new Card(); c1.num=1; c1.type="♠"; c1.width=200; c1.height=250;
		 * 
		 * Card c2=new Card(); c2.num=2; c2.type="♡"; c2.width=200; c2.height=250;
		 * 
		 * Card c3=new Card(); c3.num=3; c3.type="♣"; c3.width=200; c3.height=250;
		 * 
		 * Card c4=new Card(); c4.num=4; c4.type="◇"; c4.width=200; c4.height=250;
		 * 
		 * System.out.println("=========   c1   ========="); System.out.println(c1.num);
		 * System.out.println(c1.type); System.out.println(c1.width);
		 * System.out.println(c1.height);
		 * 
		 * System.out.println("=========   c2   ========="); System.out.println(c2.num);
		 * System.out.println(c2.type); System.out.println(c2.width);
		 * System.out.println(c2.height);
		 * 
		 * System.out.println("=========   c3   ========="); System.out.println(c3.num);
		 * System.out.println(c3.type); System.out.println(c3.width);
		 * System.out.println(c3.height);
		 * 
		 * System.out.println("=========   c4   ========="); System.out.println(c4.num);
		 * System.out.println(c4.type); System.out.println(c4.width);
		 * System.out.println(c4.height);
		 */

	}

}
