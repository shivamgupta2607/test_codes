
public class MultithreadingEvenOdd {

	public boolean isOdd;
	public int count = 1;
	public int Max = 100;

	public void printOdd() {
		synchronized (this) {
			while (count < Max){
				while (!isOdd) {
					try {
						System.out.println("Waiting " + Thread.currentThread().getName());
						wait();
						System.out.println("notifying " + Thread.currentThread().getName());

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			System.out.println("printing " + Thread.currentThread().getName() + " value :  " + count++);
			isOdd = false;
			notify();
			}
		}

	}

	public void printEven() {
		synchronized (this) {
			while (count < Max) {
				while (isOdd) {
					try {
						System.out.println("Waiting " + Thread.currentThread().getName());
						wait();
						System.out.println("notifying " + Thread.currentThread().getName());

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println();
				System.out.println("printing " + Thread.currentThread().getName() + " value :  " + count++);
				isOdd = true;
				notify();

			}
		}
	}

	public static void main(String[] args) {

		MultithreadingEvenOdd m = new MultithreadingEvenOdd();
		m.isOdd = true;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				m.printOdd();
			}
		});
		t1.setName("t1");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				m.printEven();
			}
		});
		t2.setName("t2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
