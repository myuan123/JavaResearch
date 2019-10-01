package BridgeAnother;

public class Bus extends CarAbstract{
	
	public Bus(EngineImpl engine) {
		super(engine);
	}
	
	public void installEngine() {
		// TODO Auto-generated method stub
		System.out.println("Bus:");
		this.getEngine().installEngine();
	}
	
}
