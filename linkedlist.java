public class linkedlist {

   Node head;
   private int size;

   linkedlist(){
    int size = 0;
   }
    public class Node {
        String dataString;
        Node nextNode;

        Node(String dataString, Node node){
            this.dataString = dataString;
            this.nextNode = null;
            size++;
        }
        
    }

    public void addFirst(String dataString){
        Node newnNode = new Node(dataString, head);
        if (head == null) {
            head = newnNode;
            return;
        }
        newnNode.nextNode = head;
        head = newnNode;
    }

    public void addLast(String daString){
        Node newnNode = new Node(daString, head);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node currentnode = head;
        while (currentnode.nextNode != null) {
            currentnode = currentnode.nextNode;
        }
        currentnode.nextNode = newnNode;
    }

    public void deleteFirst() {
        if (head ==  null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.nextNode;
    }

    public void deleteLast() {
        if (head ==  null) {
            System.out.println("The list is empty.");
        }
        size--;
        if (head.nextNode == null) {
            head = null;
            return;
        }
        Node secondLasNode = head;
        Node lasNode = head.nextNode;

        while (lasNode.nextNode != null) {
            lasNode = lasNode.nextNode;
            secondLasNode = secondLasNode.nextNode;
        }
     
        secondLasNode.nextNode = null;

    }

    public void printlist(){

        if (head == null) {
           System.out.println("list is empty");
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.dataString + "->");
            currentnode = currentnode.nextNode;
        }
        System.out.println("NULL");
    }
    
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linkedlist linkedlist = new linkedlist();
        linkedlist.addFirst("Parth");
        linkedlist.addFirst("Gandhi");

        linkedlist.printlist();

        linkedlist.addLast("Mahendra");
        linkedlist.printlist();    
        
        linkedlist.deleteFirst();
        linkedlist.printlist();

        linkedlist.deleteLast();
        linkedlist.printlist();
       
        linkedlist.addFirst("Gandhi");
        linkedlist.printlist();

        System.out.println(linkedlist.getSize());

    }
}
