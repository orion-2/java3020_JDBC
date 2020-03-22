package WPad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WPadDAO myDao = new WPadDAO();
		
		WPadDTO m = new WPadDTO();
		//단어추가
//		m.setWord("milk");
//		int k = myDao.insertOne(m);
//		if (k == 1) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
		
//		m = new WPadDTO();
//		m.setWord("chair");
//		myDao.insertOne(m);
		
	//단어수정
		//시나리오는 : 2번 단어를 kiwii로변경
		//	update wordpad set word = 'kiwii' where no='1';
//			m.setNo(1);
//			m.setWord("kiwii");
//			myDao.updateOne(m);
		
	//단어삭제
		//11번 단어 삭제
//		m.setNo(10);
//		myDao.delOne(10);
	
	//단어조회
		//1번 단어 조회
		WPadDTO nowWord = myDao.selOne(1);
		if(nowWord != null) {
			System.out.println("no : " + m.getNo());
			System.out.println("word : " + m.getWord());
		}else {
			System.out.println("등록되지 않은 번호입니다.");
		}
		
	}
	

}
