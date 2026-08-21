package DSADouble;

public class Doubleuser {

	public static void main(String[] args) {
		DoubleLinkedList d=new DoubleLinkedList();

                d.add(10);
                d.add(20);
                d.add(30);
                d.add(40);
                d.add(50);
                
                
            //    d.display();
                
          //   d.addFirst(70);
            // d.addLast(70);
       //       d.set(100, 2);  
             
           d.addFirst(90);
           d.addLast(560);
          d.addindex(5, 1);
           d.removeLast();
           d.removeFirst();
           d.remove(2);
          // d.getIndex();
                //d.get(2);
              System.out.println("____________");
               
               d.display();
               
               
             //  System.out.println("A set");
           //     d.revDisplay();

	}

}
