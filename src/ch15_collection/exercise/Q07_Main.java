package ch15_collection.exercise;

import java.util.List;

public class Q07_Main {

	public static void main(String[] args) {
		Q07_BoardDao dao = new Q07_BoardDao();
		List<Q07_Board> list = dao.getBoardList();
		for(Q07_Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
