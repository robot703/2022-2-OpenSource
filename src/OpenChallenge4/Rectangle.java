package OpenChallenge4;

class option{
	private int x;
	private int y;
	private int width;
	private int height;

	option(int x,int y, int width,int height){
		this.x=x;
		this.height=height;
		this.width=width;
		this.y=y;
	}
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public int square() {
		return (width*height);
	}
	boolean contains(option r) {
		if(x<r.x&&y<r.y)
			if((width+x)>(r.x+r.width)&&(height+y)>(r.y+r.height))
				return true;
		return false;
	}
}
public class Rectangle{
	public static void main(String[] args) {



		option r = new option(2, 2, 8, 7);

		option s = new option(5, 5, 6, 6);

		option t = new option(1, 1, 10, 10);



		r.show();

		System.out.println("s의 면적은 "+s.square());

		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");

		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}

