package BridgeAnother;

public class Client {
	public static void main(String[] args) {
		EngineImpl e=new Engine();
		CarAbstract bus=new Bus(e);
		bus.installEngine();
	}
}
