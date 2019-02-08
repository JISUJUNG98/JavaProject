
public class RecipeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RecipeVO vo=new RecipeVO();
        vo.poster="http://recipe1.ezmember.co.kr/cache/recipe/2019/02/08/193a386e3876fe943bd38d2030dab1021.jpg";
        http://recipe1.ezmember.co.kr/img/thumb_over.png
        vo.title="#수미네반찬 #황태해장국만들기 #황태해장국";
        vo.chef="강철새잎";
        vo.content="수미네반찬에서 시원하고 구수하고 진한 황태해장국을 했는데\r\n" + 
        		"\r\n" + 
        		"황태채, 무, 거기에 두부까지 넣어서 만드는 황태해장국에 저는 콩나물도 함께 넣어 주었습니다.\r\n" + 
        		"\r\n" + 
        		"거의 사골국 끓이듯이 큰 들통에 끓여서는 여기저기에 다 나눠 주고\r\n" + 
        		"\r\n" + 
        		"시원하게 구수하고 진하게 한사발을 비웠습니다!!!\r\n" + 
        		"\r\n" + 
        		"밥을 말아서 드시면 더욱 맛있고요~~~ 속을 편안하게 풀어주는 그런 역할을 하겠지요.\r\n" + 
        		"\r\n" + 
        		"명절연휴때에 과음을 조금 하셨다면~~ 황태해장국으로 속을 풀어 주세요~~";
        vo.data="황태채 500g, 무 1/3개, 대파 1대, 다진마늘 1큰술, 두부 1모, 콩나물 1봉지, 천연조미료육수 1.5L, 참기름 2큰술, 후추 1작은술, 국간장 1큰술, 새우젓 2큰술";
	
	    System.out.println(vo.poster);
	    System.out.println(vo.title);
	    System.out.println("Chef:"+vo.chef);
	    System.out.println(vo.content);
	    System.out.println("재료:"+vo.data);
	}

}
