package Stack;

public class Stack {
	Node first;
	int count=0;
	public void push(Object ele) {
		Node n=new Node(ele);
		if(first==null) {
			first=null;
			count++;
			return;			
		}
		n.next=first;
		first=n;
		count++;
	}
	public Object pop() {
		if(first==null) {
			System.out.println("Stack UnderFlow");
			return null;
		}
		Object key=first.key;
		first=first.next;
		count--;
		return key;
		
	}
	public Object peek() {
		if(first==null) {
			System.out.println("Stack is Empty");
			return null;
		}
		return first.key;
	}
      public int size() {
    	  return count;
      }
      public boolean isEmpty() {
    	  return count==0;
    	  
      }
}
