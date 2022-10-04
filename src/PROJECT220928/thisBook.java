package PROJECT220928;

public class thisBook {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	public thisBook() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public thisBook(String title) {
		this(title, "작자미상");
	}
	public thisBook(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String [] args) {
		thisBook littlePrince = new thisBook("어린왕자", "생텍쥐페리");
		thisBook loveStory = new thisBook("춘향전");
		thisBook emptyBook = new thisBook();
		loveStory.show();
	}
}
