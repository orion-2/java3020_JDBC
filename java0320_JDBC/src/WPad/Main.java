package WPad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WPadDAO myDao = new WPadDAO();
		
		WPadDTO m = new WPadDTO();
		//�ܾ��߰�
//		m.setWord("milk");
//		int k = myDao.insertOne(m);
//		if (k == 1) {
//			System.out.println("����");
//		}else {
//			System.out.println("����");
//		}
		
//		m = new WPadDTO();
//		m.setWord("chair");
//		myDao.insertOne(m);
		
	//�ܾ����
		//�ó������� : 2�� �ܾ kiwii�κ���
		//	update wordpad set word = 'kiwii' where no='1';
//			m.setNo(1);
//			m.setWord("kiwii");
//			myDao.updateOne(m);
		
	//�ܾ����
		//11�� �ܾ� ����
//		m.setNo(10);
//		myDao.delOne(10);
	
	//�ܾ���ȸ
		//1�� �ܾ� ��ȸ
		WPadDTO nowWord = myDao.selOne(1);
		if(nowWord != null) {
			System.out.println("no : " + m.getNo());
			System.out.println("word : " + m.getWord());
		}else {
			System.out.println("��ϵ��� ���� ��ȣ�Դϴ�.");
		}
		
	}
	

}
