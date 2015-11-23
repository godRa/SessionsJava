package pack1;

public class Car {
	enum Engine {
		BENZINA, MOTORINA, GAZ, CURENT
	}

	int Numar;
	Engine engine;

	public void setEngine(Engine type) {
		engine = type;

	}

	public void listEngines() {
		Engine[] engines = engine.values();
	}
}
