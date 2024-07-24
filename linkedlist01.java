public class linkedlist01 {

    Node headNode;
    int size;

    linkedlist01(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
       }
    }

    public void addfirst(String data){
        Node newnode = new Node(data);
        newnode.next = headNode;
         headNode = newnode;
         return;
    }

    public void addlast(String data){
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        Node currNode = headNode;
        while (currNode.next != null) {
            currNode = currNode.next;    
        }

        currNode.next = newNode;   
    }

    public void display(){
        Node currNode = headNode;
        while (currNode != null) {
        System.out.print(currNode.data + "->");
           currNode = currNode.next; 
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist01 linkedlist01 = new linkedlist01();
        linkedlist01.addfirst("parth");
        linkedlist01.display();
        linkedlist01.addlast("Gandhi");
        linkedlist01.display();
        System.out.println(linkedlist01.size);
    
    }
    
}
