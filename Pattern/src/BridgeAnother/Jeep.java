package BridgeAnother;

public class Jeep extends CarAbstract{
	public Jeep(EngineImpl engine) {
		super(engine);
	}
	
	public void installEngine() {
		// TODO Auto-generated method stub
		System.out.println("Jeep");
		this.getEngine().installEngine();
	}
}
