package mycar;

public class Car {
	private String numberOfWheels = "dud";
	private int numberOfWheels = 4;
	private double numberOfWheels = 2;
	private Engine engine;
	private String numberOfWheels;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return numberOfWheels;
	}

	public int start() {
		return engine.start();
	}

	public boolean isHighClass(int prize) {
		return (prize > 100 ? true : false);
	}

	public int getManyWheels() {
		for (int i = 0; i < 1000; i++) {
			System.out.println();
		}
		return 4;
	}

}
