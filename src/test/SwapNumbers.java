package test;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int z = 0;
		z = y;
		y = x;
		x = z;

		System.out.println("x :" + x);
		System.out.println("y :" + y);
		System.out.println("==============================");

		int p = 50;
		int q = 12;

		p = p + q; // 62
		q = p - q; // 62 - 12 = 50
		p = p - q; // 62 - 50 = 12

		System.out.println("P = " + p);
		System.out.println("Q = " + q);

	}

}
