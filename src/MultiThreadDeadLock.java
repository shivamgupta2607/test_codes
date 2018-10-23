
public class MultiThreadDeadLock {

	public static void main(String[] args) {

		String s1 = new String("a");
		String s2 = new String("b");

		Thread t1 = new Thread("t1") {
			public void run() {

				while (true) {
					synchronized (s1) {
						synchronized (s2) {
							System.out.println(s1 + s2);
						}
					}

				}
			}
		};

		Thread t2 = new Thread("t2") {
			public void run() {
				while (true) {
					synchronized (s2) {
						synchronized (s1) {
							System.out.println(s1 + s2);
						}
					}
				}

			}
		};

		t1.start();
		t2.start();

	}
}
