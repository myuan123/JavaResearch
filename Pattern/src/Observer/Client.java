package Observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject cs=new ConcreteSubject();
		AbstractObserver e=new ConcreteObserver();
		cs.attach(e);
		cs.setState("new state");
	}
}
