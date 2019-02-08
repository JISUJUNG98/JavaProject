import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *    �޼ҵ� ==> �����͸� ����
 *                   ==============
 *                   1) �Ѱ�
 *                   2) ������
 */
public class Mainclass3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		movieRankData();

	}
	
	static MovieRank[] movieRankData() throws Exception {
		 MovieRank[] mr=new  MovieRank[10];
		 Document doc=Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		 Elements title=doc.select("td.title div.tit3 a");
		 Elements icon=doc.select("td.ac img");
		 Elements idcrement=doc.select("td.range");
		 int j=1;
		 for(int i=0; i<10;i++) {
			 System.out.println("��ȭ�� : "+title.get(i).text());
			 String s=icon.get(i).attr("src");
			 
			 String ss="";
			 s=s.substring(s.lastIndexOf("/"));
			 if(s.contains("na"))
				 ss="-";
			 else if(s.contains("up"))
				 ss="��";
			 else if(s.contains("down"))
				 ss="��";
			 System.out.println("���� :  "+(i+1));
			 System.out.println("������ : "+ss);
			 System.out.println("���� : "+idcrement.get(i).text());
			 System.out.println("==================================");
			 j+=2;
		 }
		 return mr;
		 
	}

}
