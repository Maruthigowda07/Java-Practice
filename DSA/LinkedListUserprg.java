package DSA;

public class LinkedListUserprg {

	public static void main(String[] args) {

        LinkedList l=new LinkedList();
    

        		// add()
        		l.add(10);
        		l.add(20);
        		l.add(30);
        		l.add(40);
        		l.add(50);

        		System.out.println("After add()");
        		l.display();

        		// addFirst()
        		l.addFirst(5);

        		System.out.println("After addFirst()");
        		l.display();

        		// addLast()
        		l.addLast(60);

        		System.out.println("After addLast()");
        		l.display();

        		// addIndex()
        		l.addIndex(25, 3);

        		System.out.println("After addIndex(25,3)");
        		l.display();

        		// contains()
        		System.out.println("Contains 30 : " + l.contains(30));
        		System.out.println("Contains 100 : " + l.contains(100));

        		// set()
        		l.set(35, 4);

        		System.out.println("After set(35,4)");
        		l.display();

        		// remove()
        		l.remove(2);

        		System.out.println("After remove(2)");
        		l.display();

        		// removeFirst()
        		l.removeFirst();

        		System.out.println("After removeFirst()");
        		l.display();

        		// size()
        		System.out.println("Size : " + l.size());

        		// isEmpty()
        		System.out.println("Is Empty : " + l.isEmpty());
        	}
        }