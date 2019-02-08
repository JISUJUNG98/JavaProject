
/*
 *   재직자 =>   소프트웨어 패턴
 *           =============(디자인패턴)
 *               알고리즘 
 *           =============
 *           
 *           클래스 
 *           1) 변수 ==> 
 *           2) 메소드 =>  변수 사용법 
 *           3) 생성자 
 *           ========
 *            예) 자판기 
 *               =====
 *               변수 : 동전,음료수,커피  ===> 상태
 *                    =========
 *               메소드 : 동전 => 음료수 선택,잔돈 =>행위
 *               
 *           클래스 => 상태+행위 => 하나의 기능
 *                  ====
 */
public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BoardVO vo=new BoardVO();//  저장 공간
        
        vo.no=1;
        vo.subject="게시판 제작";
        vo.name="홍길동";
        vo.regdate="2019-02-08";
        vo.hit=0;
        vo.recom=0;
        
        BoardVO vo1=new BoardVO();//  저장 공간
        
        vo1.no=2;
        vo1.subject="게시판 제작";
        vo1.name="홍길동";
        vo1.regdate="2019-02-08";
        vo1.hit=0;
        vo1.recom=0;
        
        //   게시물 출력 
        System.out.println("===게시판 목록===");
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








