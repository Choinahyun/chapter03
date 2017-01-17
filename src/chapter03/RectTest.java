package chapter03;

public class RectTest {

	public static void main(String[] args) {
		Rect r1 = new Rect (10, 20);
		Rect r2 = new Rect (10, 20);
		
		// == 을 사용하지 않아서 둘 다 false
		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));

	}

}
