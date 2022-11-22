package mysql.bbs;

import java.util.List;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao dao = new ReplyDao();
		
		List<Reply> list = dao.listReply();
		for (Reply r: list)
			System.out.println(r);
	}

}