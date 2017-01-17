package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("둘리", new Integer(100));
		map.put("마이콜", 60);		// auto boxing new Integer (60)
		map.put("도우넛", 90);
		map.put("도우넛", 100);	// 새로 값이 세팅된다.
		
		Integer score1 = map.get("마이콜");
		System.out.println(score1);
		
		int score2 = map.get("도우넛");
		System.out.println(score2);
		
		// 평균
		Set<String> KeySet = map.keySet();
		int count = KeySet.size();
		
		int sum = 0;
		
		Iterator<String> it = KeySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key + ":" + score);
			sum += score;
		}
		System.out.println("평균:"+ (sum/count));
		
	}

}
