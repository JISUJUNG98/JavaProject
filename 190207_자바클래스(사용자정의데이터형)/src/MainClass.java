
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������
		Movie m=new Movie();
		System.out.println("ma="+m);
		//int m
		
		Movie m1=new Movie();
		System.out.println("ma1="+m1);
		
		Movie m2=new Movie();
		System.out.println("ma2="+m2);
		
		m.title="���ǽ�8";
		m1.title="�巡�����̱�3";
		m2.title="������";
		
		m.director="�Ը� �ν�";
		m1.director="�� ������̽�";
		m2.director="������";
		
		
		//���
		System.out.println(m.title);
		System.out.println(m1.title);
		System.out.println(m2.title);
		
		System.out.println(m.director);
		System.out.println(m1.director);
		System.out.println(m2.director);
		
	}

}
