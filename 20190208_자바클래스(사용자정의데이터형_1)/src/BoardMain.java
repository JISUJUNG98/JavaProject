
/*
 *   ������ =>   ����Ʈ���� ����
 *           =============(����������)
 *               �˰��� 
 *           =============
 *           
 *           Ŭ���� 
 *           1) ���� ==> 
 *           2) �޼ҵ� =>  ���� ���� 
 *           3) ������ 
 *           ========
 *            ��) ���Ǳ� 
 *               =====
 *               ���� : ����,�����,Ŀ��  ===> ����
 *                    =========
 *               �޼ҵ� : ���� => ����� ����,�ܵ� =>����
 *               
 *           Ŭ���� => ����+���� => �ϳ��� ���
 *                  ====
 */
public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BoardVO vo=new BoardVO();//  ���� ����
        
        vo.no=1;
        vo.subject="�Խ��� ����";
        vo.name="ȫ�浿";
        vo.regdate="2019-02-08";
        vo.hit=0;
        vo.recom=0;
        
        BoardVO vo1=new BoardVO();//  ���� ����
        
        vo1.no=2;
        vo1.subject="�Խ��� ����";
        vo1.name="ȫ�浿";
        vo1.regdate="2019-02-08";
        vo1.hit=0;
        vo1.recom=0;
        
        //   �Խù� ��� 
        System.out.println("===�Խ��� ���===");
        System.out.println(vo.no+"  "
        		+vo.subject+"  "
        		+vo.name+"  "
        		+vo.regdate+"  "
        		+vo.hit+"  "
        		+vo.recom);
        System.out.println(vo1.no+"  "
        		+vo1.subject+"  "
        		+vo1.name+"  "
        		+vo1.regdate+"  "
        		+vo1.hit+"  "
        		+vo1.recom);
	}

}








