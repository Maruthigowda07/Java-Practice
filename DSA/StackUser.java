package Stack;

public class StackUser {

	public static void main(String[] args) {
		 Stack s=new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		 s.push(40);
		 s.push(50);
		 s.push(60);
		 s.push(70);
		System.out.println(s.size());//7
		System.out.println(s.isEmpty());//false
		
		System.out.println("==============");
		while(!s.isEmpty()) {
		System.out.println(s.pop());
	}
		System.out.println("==============");
		System.out.println(s.isEmpty());
	}

}
