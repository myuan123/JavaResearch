package Bridge;

public abstract class Pen {
	protected Implementor color;
	public void setColor(Implementor color) {
		this.color=color;
	}
	public abstract void draw(String name);
}
