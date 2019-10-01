package Bridge;

public class SmallPen extends Pen{

	public void draw(String name) {
		// TODO Auto-generated method stub
		String paintType="small pen";
		this.color.paint(paintType, name);
	}
}

class MiddlePen extends Pen{

	public void draw(String name) {
		// TODO Auto-generated method stub
		String paintType="middle pen";
		this.color.paint(paintType, name);
	}
}

class BigPen extends Pen{

	public void draw(String name) {
		// TODO Auto-generated method stub
		String paintType="big pen";
		this.color.paint(paintType, name);
	}
}