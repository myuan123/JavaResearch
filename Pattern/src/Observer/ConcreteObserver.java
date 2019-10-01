package Observer;

public class ConcreteObserver extends AbstractObserver{
	private String ObserverState;
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		ObserverState=state;
		System.out.println("observer state is"+state);
	}
	
}
