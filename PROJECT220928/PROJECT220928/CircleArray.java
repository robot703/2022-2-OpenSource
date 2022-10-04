package PROJECT220928;

class CircleR{

	int radius;

	public CircleR(int radius) {
		this.radius = radius;
	}
	public double getArea() {

		return 3.14*radius*radius;
	}
}

public class CircleArray {

	public static void main(String[] args) {

		CircleR[] c;

		c = new CircleR[5];

		for(int i=0; i<c.length;i++)

			c[i] = new CircleR(i);

		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea())+ " ");
	}

}
