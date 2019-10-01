

public class asdfasdf extends Cc{
	public asdfasdf() {
		System.out.println("A");
	}
	public static void main(String[] args) {
		asdfasdf t=new asdfasdf();
		t.f();
	}
	public void f() {
		new Cc();
		System.out.println("C");
	}
}

class Cc{
	public Cc() {
		System.out.println("B");
	}
}