package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {
	private List<AbstractObserver> list=new ArrayList<AbstractObserver>();
	public void attach(AbstractObserver e) {
		list.add(e);
		System.out.println("add the observer "+e);
	}
	
	public void remove(AbstractObserver e) {
		list.remove(e);
		System.out.println("remove the observer"+e);
	}
	
	public void notifyObserver(String newState) {
		for(AbstractObserver i:list) {
			i.update(newState);
		}
	}
}
