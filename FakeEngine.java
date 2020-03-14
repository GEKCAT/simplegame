package mycar;

public class FakeEngine implements Engine {
	public int start() {
		// 假的12
		System.out.println("Starting!!");
		return 1;
	}
}
