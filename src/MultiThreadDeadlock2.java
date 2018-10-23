
public class MultiThreadDeadlock2 {

	public static void main(String[] args) {
		Utility u = new Utility();
		Thread t1 = new Thread() {
			public void run() {
				try {
					u.read();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					u.write();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		t1.start();
		t2.start();
	}
}

class Resource {
	public int value;
}

class Utility {
	Resource r1 = new Resource();
	Resource r2 = new Resource();

	public void read() throws InterruptedException {
		while(true)
		synchronized (r1) {
			Thread.sleep(1000l);
			synchronized (r2) {
				System.out.println(r1.value + " , " + r2.value);
			}
		}
	}

	public void write() throws InterruptedException {
		while(true)
		synchronized (r2) {
			Thread.sleep(1000l);
			synchronized (r1) {
				r1.value = 10;
				r2.value = 20;
				System.out.println("Modified r1 and r2");
			}
		}
	}
}
