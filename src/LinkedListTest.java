
public class LinkedListTest {

	public static void main(String args[]){
		
		
		Link link1 = new Link("1st");
		Link link2 = new Link("2nd");
		Link link3 = new Link("3rd");
		
		LinkedList list = new LinkedList();
		
		long start = System.currentTimeMillis();
		for(int i=1; i<11; i++){
			 
			Link link = new Link(" " +i + " ");
			list.addToLinkedList(link);
		}
		
		long end = System.currentTimeMillis();
	//	System.out.println("Time taken to create list "+ (end-start));	
		list.display();
		reverse(list);
		list.display();
		
	//	list.findmiddle();
		
		//list.findnthelement(15);
	
	}

	private static void reverse(LinkedList list) {
		Link current = list.head;
		Link prev = null;
		Link next = null;
		list.tail = current;
		while(current!=null){
			System.out.println("Running while "+current);
			next = current.next;
			current.next= prev;
			prev =current;
			current = next;
			
		} 
		list.head = prev;
		
	}
}

 class LinkedList{
	Link head;
	Link tail;
	public void addToLinkedList(Link link) {
		if(head == null){
			head = link;
			tail = head;
		}
		else{
			tail.next = link;
			tail = link;
		}
	}
	public void findnthelement(int i) {
	Link current = head;
	Link nthlink = head;
	int counter = 0;
	while(current != null){
		
		if(counter<i)
			current = current.next;
		else{
			current = current.next;
			nthlink = nthlink.next;
		}
		counter++;
	} 
	
	System.out.println("Nth Element is " +nthlink.name);
		
	}
	public void findmiddle() {
		Link current = head;
		Link middle = head;
		int length = 0;
		while(current != null){
			
			current = current.next;
			length++;
			if(length%2==0)
			middle = middle.next;   
		} 
		
		
		System.out.println("Length is " +length);
		System.out.println("Middle Element is " +middle.name);
		
	}
	public void display() {
		
		Link link = this.head;
		while(link != null){
			System.out.print(link.name + " ");	
			link = link.next;
		} 
		
	}
}
 
 
 class Link{
	 public String name;
	 public Link next;
	 Link(String name){
		 this.name=name;
	 }
	 
	
 }
 
 
 