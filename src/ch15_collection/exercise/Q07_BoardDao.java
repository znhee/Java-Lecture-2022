package ch15_collection.exercise;

import java.util.ArrayList;
import java.util.List;

public class Q07_BoardDao{

	public List<Q07_Board> getBoardList() {
		List<Q07_Board> list = new ArrayList<Q07_Board>();
		list.add(new Q07_Board("제목 1", "내용 1"));
		list.add(new Q07_Board("제목 2", "내용 2"));
		list.add(new Q07_Board("제목 3", "내용 3"));
		return list;
	}
}
