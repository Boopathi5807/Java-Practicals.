package multithread;

class BookMyShow {
	int totalTickets = 30;

	synchronized public void bookTicket(int tickets) {
		if (totalTickets >= tickets) {
			totalTickets = totalTickets - tickets;
			System.out.println(Thread.currentThread().getName() + " has booked " + tickets + " tickets ");
			System.out.println("Remaining tickets " + totalTickets);
		} else {
			if (totalTickets == 0) {
				System.out.println("sorry,House is Full now..");
			} else {
				System.out.println("sorry , only " + totalTickets + "tickets are remaining.");
			}
		}
	}
}

public class SynchronizationDemo extends Thread {
	int ticket;
	static BookMyShow bookMyShow;

	public void run() {
		SynchronizationDemo.bookMyShow.bookTicket(ticket);
	}

	public static void main(String[] args) {
		bookMyShow = new BookMyShow();
		SynchronizationDemo boopathi = new SynchronizationDemo();
		boopathi.ticket = 5;
		boopathi.setName("boopathi");
		boopathi.start();

		SynchronizationDemo ashvin = new SynchronizationDemo();
		ashvin.ticket = 5;
		ashvin.setName("ashvin");
		ashvin.start();

		SynchronizationDemo aashik = new SynchronizationDemo();
		aashik.ticket = 5;
		aashik.setName("aashik");
		aashik.start();

		SynchronizationDemo selva = new SynchronizationDemo();
		selva.ticket = 5;
		selva.setName("selva");
		selva.start();

		SynchronizationDemo ajithkumar = new SynchronizationDemo();
		ajithkumar.ticket = 5;
		ajithkumar.setName("ajithkumar");
		ajithkumar.start();

		SynchronizationDemo abhishek = new SynchronizationDemo();
		abhishek.ticket = 5;
		abhishek.setName("abhishek");
		abhishek.start();

	}

}
