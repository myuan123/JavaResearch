package BridgeAnother;

public abstract class CarAbstract {
	private EngineImpl engine;
	public CarAbstract(EngineImpl engine) {
		this.engine=engine;
	}
	
	public EngineImpl getEngine() {
		return engine;
	}
	
	public void setEngine(EngineImpl engine) {
		this.engine=engine;
	}
	
	public abstract void installEngine();
}
