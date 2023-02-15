package interface_test;

public class Inter {

	public static void main(String[] args) {
		Computer c = new Computer();
		Flash f = new Flash();
		c.transfer(new Printer());

	}

}

class Computer{
	public void transfer(USB usb) {
		usb.start();
		System.out.println("transfer...");
		usb.stop();
	}
}

interface USB{
	void start();
	void stop();
}

class Printer implements USB{
	public void start() {
		System.out.println("printer start");
	}
	public void stop() {
		System.out.println("printer stop");
	}
}

class Flash implements USB{
	public void start() {
		System.out.println("flash start");
	}
	public void stop() {
		System.out.println("flash stop");
	}
}