
public class RecipeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RecipeVO vo=new RecipeVO();
        vo.poster="http://recipe1.ezmember.co.kr/cache/recipe/2019/02/08/193a386e3876fe943bd38d2030dab1021.jpg";
        http://recipe1.ezmember.co.kr/img/thumb_over.png
        vo.title="#���̳׹��� #Ȳ�����屹����� #Ȳ�����屹";
        vo.chef="��ö����";
        vo.content="���̳׹������� �ÿ��ϰ� �����ϰ� ���� Ȳ�����屹�� �ߴµ�\r\n" + 
        		"\r\n" + 
        		"Ȳ��ä, ��, �ű⿡ �κα��� �־ ����� Ȳ�����屹�� ���� �ᳪ���� �Բ� �־� �־����ϴ�.\r\n" + 
        		"\r\n" + 
        		"���� ��� ���̵��� ū ���뿡 �������� �������⿡ �� ���� �ְ�\r\n" + 
        		"\r\n" + 
        		"�ÿ��ϰ� �����ϰ� ���ϰ� �ѻ���� ������ϴ�!!!\r\n" + 
        		"\r\n" + 
        		"���� ���Ƽ� ��ø� ���� ���ְ��~~~ ���� ����ϰ� Ǯ���ִ� �׷� ������ �ϰ�����.\r\n" + 
        		"\r\n" + 
        		"�������޶��� ������ ���� �ϼ̴ٸ�~~ Ȳ�����屹���� ���� Ǯ�� �ּ���~~";
        vo.data="Ȳ��ä 500g, �� 1/3��, ���� 1��, �������� 1ū��, �κ� 1��, �ᳪ�� 1����, õ�����̷����� 1.5L, ���⸧ 2ū��, ���� 1������, ������ 1ū��, ������ 2ū��";
	
	    System.out.println(vo.poster);
	    System.out.println(vo.title);
	    System.out.println("Chef:"+vo.chef);
	    System.out.println(vo.content);
	    System.out.println("���:"+vo.data);
	}

}
