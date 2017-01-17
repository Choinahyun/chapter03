package chapter03;

public class PointTest {

	public static void main(String[] args) {
		
		Point pt = new Point(100, 200);
		
		System.out.println(pt.getClass()); // 클래스 정보
		System.out.println(pt.hashCode()); // 
		System.out.println(pt.toString()); // pt.getClass().getName() + "@" +pt.hashCode()
		System.out.println(pt);

		// String과 비교
		String s = new String("hello");
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		System.out.println(s.toString());
	}

}
