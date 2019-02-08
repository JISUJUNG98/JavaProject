//Music[] genie = new Music[200];    ==> 메모리 저장 위치를 다르게 (주소를 참조) => 참조변수
//int[] a= new int[200] ==> 실제 데이터가 저장
/*
 *         일반 변수 : 값
 *         클래스(사용자 정의) ==> new를 사용해서 초기값을 만든다.
 *         new ==> 없는 경우에는 null 이기 때문에 사용 할 수 없다.
 *         
 *         클래스의 생명주기
 *         =================
 *         생성             활용           소멸
 *     A a=new A()       a.title          a. null
 */
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//지니 뮤직
		/*
		Music m1=new Music();
		m1.rank=1;
		m1.icon='-';
		m1.idcrement=0;
		m1.title="벌써 12시";
		m1.singer="청하";
		m1.poster="http://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/143/295/81143295_1546410332404_1_600x600.JPG";
		m1.album="벌써 12시";
		
		//출력
		System.out.println("순위 : "+m1.rank);
		System.out.println("제목 : "+m1.title);
		System.out.println("가수 : "+m1.singer);
		System.out.println("앨범 : "+m1.album);
		*/
		
		
		//엠넷
		Music2 m2=new Music2();
		
		m2.rank=1;
		m2.icon='-';
		m2.idcrement=0;
		m2.title="벌써 12시";
		m2.singer="청하";
		m2.poster="javascript:photoView('http://cmsimg.mnet.com/clipimage/album/1024/003/223/3223767.jpg','1024','1024');";
		m2.album="벌써 12시";
		
		
		System.out.println("순위 : "+m2.rank);
		System.out.println("제목 : "+m2.title);
		System.out.println("가수 : "+m2.singer);
		System.out.println("앨범 : "+m2.album);
		/*
		 * boolen => false
		 * long 0L
		 * double 0.0
		 * float 0.0F
		 * 모든 클래스 ==> null
		 */
		

	}

}
