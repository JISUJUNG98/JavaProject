/*
 *    ����
 *    ===
 *      1. ������ ����
 *          Ŭ���� ������ �����ϴ� ����
 *          ========
 *             ��� ����(��������)
 *             =======
 *                 = ��ü���� ���� ����ϴ� ����(�ν��Ͻ� ����, ��ü����)
 *                    int a;
 *                 =�������� ����ϴ� ����(���� ���� = Ŭ���� ����)
 *                   static int a;   
 *                    class A
 *                    
 *                    A a=new A();
 *                      ==
 *                      ��ü(�ν��Ͻ�,Ŭ��������)
 *                      
 *                
 *                
 *          
 *          �޼ҵ� �����ȿ� �����ϴ� ����
 *          ========
 *             ���� ���� (�޼ҵ� �ȿ����� ��� ==> �ڵ� ����)
 */
public class MainClass {
	int kor;
	int eng;
	int math;
	String name;

	
	static String school_name; // ��� �л��� �������� ����ϴ� ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m1=new MainClass();
		//m1=kor,eng,math,name\
		m1.name="ȫ�浿";
		m1.school_name="SIST";
		MainClass m2=new MainClass();
		//m2=kor,eng,math,name
		m2.name="��û��";
		m2.school_name="�ֿ�";
		
		//school_name => m1,m2  ����
		
		//m1.name = ȫ�浿
		

	}

}
