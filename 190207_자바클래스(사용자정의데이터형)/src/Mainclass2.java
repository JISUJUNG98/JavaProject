//Music[] genie = new Music[200];    ==> �޸� ���� ��ġ�� �ٸ��� (�ּҸ� ����) => ��������
//int[] a= new int[200] ==> ���� �����Ͱ� ����
/*
 *         �Ϲ� ���� : ��
 *         Ŭ����(����� ����) ==> new�� ����ؼ� �ʱⰪ�� �����.
 *         new ==> ���� ��쿡�� null �̱� ������ ��� �� �� ����.
 *         
 *         Ŭ������ �����ֱ�
 *         =================
 *         ����             Ȱ��           �Ҹ�
 *     A a=new A()       a.title          a. null
 */
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		/*
		Music m1=new Music();
		m1.rank=1;
		m1.icon='-';
		m1.idcrement=0;
		m1.title="���� 12��";
		m1.singer="û��";
		m1.poster="http://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/143/295/81143295_1546410332404_1_600x600.JPG";
		m1.album="���� 12��";
		
		//���
		System.out.println("���� : "+m1.rank);
		System.out.println("���� : "+m1.title);
		System.out.println("���� : "+m1.singer);
		System.out.println("�ٹ� : "+m1.album);
		*/
		
		
		//����
		Music2 m2=new Music2();
		
		m2.rank=1;
		m2.icon='-';
		m2.idcrement=0;
		m2.title="���� 12��";
		m2.singer="û��";
		m2.poster="javascript:photoView('http://cmsimg.mnet.com/clipimage/album/1024/003/223/3223767.jpg','1024','1024');";
		m2.album="���� 12��";
		
		
		System.out.println("���� : "+m2.rank);
		System.out.println("���� : "+m2.title);
		System.out.println("���� : "+m2.singer);
		System.out.println("�ٹ� : "+m2.album);
		/*
		 * boolen => false
		 * long 0L
		 * double 0.0
		 * float 0.0F
		 * ��� Ŭ���� ==> null
		 */
		

	}

}
