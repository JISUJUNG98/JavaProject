
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//저장공간
		Movie m=new Movie();
		System.out.println("ma="+m);
		//int m
		
		Movie m1=new Movie();
		System.out.println("ma1="+m1);
		
		Movie m2=new Movie();
		System.out.println("ma2="+m2);
		
		m.title="오션스8";
		m1.title="드래곤길들이기3";
		m2.title="말모이";
		
		m.director="게리 로스";
		m1.director="딘 데블로이스";
		m2.director="엄유나";
		
		
		//출력
		System.out.println(m.title);
		System.out.println(m1.title);
		System.out.println(m2.title);
		
		System.out.println(m.director);
		System.out.println(m1.director);
		System.out.println(m2.director);
		
	}

}
