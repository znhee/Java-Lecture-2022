package ch15_collection.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Q09_MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;			// 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0;			// 최고 점수를 저장하는 변수
		int totalScore = 0;			// 점수 합계를 저장하는 변수
		
		System.out.println("총 엔트리 수: " + map.size());
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String,Integer> entry: entrySet) {
			if (entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		System.out.println("아이디: " + name + ", 최고 점수:" + maxScore + ", 점수 합계: " + totalScore);
		
		
	}

}
