public class Linkedlist {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            System.out.println("removed" + " " + data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.println("removed" + " " + data);
                return;
            }
            current = current.next;
        }
    }

    public void currentstate() {
        //checks if head node is empty
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked list: ");
        //traversing entire list and printing
        while (current!= null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" , ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverseList() {
        Node prev = null;
        Node next = null;
        Node current = head;

        while (current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    head = prev;
    }


    public void removeDuplicates () {
        Node current = head;
        while (current!=null) {
            Node next = current;
            while (next.next!=null) {
                if (next.next.data==current.data)
                    next.next = next.next.next;
                else
                    next=next.next;
            }
        current = current.next;
        }
    this.currentstate();
    }
}
