
public class OverrideIssue extends Egg{
	//类名相同不能够重写
	protected class Yolk{
		public Yolk() {
			System.out.println("main yolk");
		}
	}
	
	public static void main(String[] args) {
		OverrideIssue oi=new OverrideIssue();
	}
}

class Egg{
	private Yolk yolk;
	
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}
	
	public Egg() {
		System.out.println("New Egg()");
		yolk=new Yolk();
	}
}