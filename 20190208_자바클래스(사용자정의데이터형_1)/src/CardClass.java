
/*
 *     �ڹ�: ��� ����(�޼ҵ�,����) ==> Ŭ���� ���ȿ� �ִ�
 *     ������ ���� 
 *     ========
 *     1) �������� :  �ٸ� Ŭ�������� ����� ����
 *         = ���� ���� => �ν��Ͻ� ����
 *           ====== �ݵ��  new�� ����ؼ� �޸𸮸� �����Ŀ� ����� ���� 
 *           A a=new A();
 *           a.������
 *           a.�޼ҵ��
 *           
 *           String s="";
 *             s.trim()
 *         = ���� ���� => ���뺯�� 
 *           ====== �׳� ����� ���� 
 *           A a=new A();
 *           a.������
 *           a.�޼ҵ�� 
 *             
 *           ===> A.������
 *           ===> A.�޼ҵ��  ==> Math.random(),String.valueOf()
 *     2) �������� :  �޼ҵ�ȿ����� ����� ���� (�ٸ� Ŭ���������� ������ �Ұ���)
 */
class Card
{
	//  �������� ==> ��� Ŭ�������� ����� ���� => heap
	//  �����Ǵ� ���� ==>  Card c=new Card()
	int num;
	String type;
	
	//  ����,�������� ==> �ٸ� Ŭ�������� ����� ����
	//  �����Ǵ� ���� ==> Ŭ������ �ε�Ǿ����� (����ӽ��� Ŭ������ �б� ����)
	static int width;
	static int height;
}

public class CardClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card.width=300;
		Card.height=350;
		Card a=new Card();
		a.num=100;
		new Card().num=100;
		//Math.random();
		/*
		 * Card c1=new Card(); c1.num=1; c1.type="��"; c1.width=200; c1.height=250; Card
		 * c2=new Card(); c2.num=2; c2.type="��"; c2.width=200; c2.height=250; Card
		 * c3=new Card(); c3.num=3; c3.type="��"; c3.width=200; c3.height=250; Card
		 * c4=new Card(); c4.num=4; c4.type="��"; c4.width=300; c4.height=350;
		 * System.out.println("===== c1(Card) ======"); System.out.println(c1.num);
		 * System.out.println(c1.type); System.out.println(c1.width);
		 * System.out.println(c1.height);
		 * 
		 * System.out.println("===== c2(Card) ======"); System.out.println(c2.num);
		 * System.out.println(c2.type); System.out.println(c2.width);
		 * System.out.println(c2.height);
		 * 
		 * System.out.println("===== c3(Card) ======"); System.out.println(c3.num);
		 * System.out.println(c3.type); System.out.println(c3.width);
		 * System.out.println(c3.height);
		 * 
		 * System.out.println("===== c4(Card) ======"); System.out.println(c4.num);
		 * System.out.println(c4.type); System.out.println(c4.width);
		 * System.out.println(c4.height);
		 */
        
	}
	

}
