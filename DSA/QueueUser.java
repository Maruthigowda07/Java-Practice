package Queue;

public class QueueUser {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);

		 System.out.println(q.size());
		 System.out.println(q.peek());
		 System.out.println(q.poll());
		 System.out.println(q.isEmpty());
		 System.out.println("==========");
		 while(!q.isEmpty())
			 System.out.println(q.poll() + "\t");
		 System.out.println();
		 System.out.println("=======");
		 System.out.println(q.isEmpty());
	}

}
