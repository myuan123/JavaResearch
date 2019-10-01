package Observer;

public class ConcreteSubject extends AbstractSubject{
	private String state;
	public void setState(String state) {
		this.state=state;
		System.out.println("the subject state is"+state);
		this.notifyObserver(state);
	}
	
	public String getState() {
		return state;
	}
	
}
