package DSADouble;

public class DoubleLinkedList {
	Node head;
	int count=0;
	Node tail;
	
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public void add(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			tail=n;
			count++;
		return;
		}
		
		tail.next=n;
		n.prev=tail;
		tail=n;
		count++;
			
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.ele);
		
		temp=temp.next;	
	}
	}
	public void revDisplay() {
		Node temp=tail;
		while(temp!=null) { 
			System.out.println(temp.ele);
	
		temp=temp.prev;
		}
			
	}
	 
		public void addFirst(Object ele) {
			Node n=new Node(ele);
			n.next=head;
			head.prev=n;
			head=n;
			count++;
		}
			
		public void addLast(Object ele) {
			Node n=new Node(ele);
			tail.next=n;
			n.prev=tail;
			tail=n;
			count++;
		}
		
        public void set(Object ele,int index) {
                if(index<0||index>=size()) throw new IndexOutOfBoundsException();
                if(index==0) {
                	head.ele=ele;
                	return;
                }
                Node temp=head;
                for(int i=1;i<=index;i++) 
                	temp=temp.next;
                temp.ele=ele;
}
        public boolean contains(Object ele) {
        	Node temp=head;
        	while(temp!=null) {
        		if(temp.ele.equals(ele))
        			return true;
        		temp=temp.next;
        	}
        	return false;
        }

        
        public void addindex(Object ele,int index) {
        	if(index<0||index>=size()) throw new IndexOutOfBoundsException();
        	
        	if(index==0) {
        		addFirst(ele);
        		return;
        	
        }
        if(index==size()) {
        	addLast(ele);
        	return;
        }
        	 Node n=new Node(ele);
        	 Node temp=head;
        	 for(int i=1;i<index;i++)
        		 temp=temp.next;
        	 n.next.prev=n;
        	 n.prev=temp;
        	 temp.next=n;
        	 count++;
        	 
        }
        public void removeFirst() {
        	head=head.next;
        	head.prev=null;
        	count--;
        }
        public void removeLast() {
        	tail=tail.prev;
        	tail.next=null;
        	count--;
        }
        public void remove(int index) {
        	if(index<0||index>size()-1) throw new IndexOutOfBoundsException();
        	
        	if(index==0) {
        		removeFirst();
        		return;
        	}
        	if(index==size()-1) {
        		removeLast();
        		return;
        	}
        	Node temp=head;
        	for(int i=1;i<index;i++)
        		temp=temp.next;
        	temp.next.next.prev=temp;
        	temp.next=temp.next.next;
        	count--;
       }
        public Object get(int index) {
        	if(index<0||index>size()) throw new IndexOutOfBoundsException();
        	if(index==0) {
        		return head.ele;
        	}
        	if(index==size()) {
        		return tail.ele;
        	}
        	Node temp=head;
        	for(int i=1;i<index;i++) 
        		temp=temp.next;
        	return temp.ele;
        		
        }
}



