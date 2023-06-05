class Linkedlist {
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
        System.out.println();           //for clarity in output if called multiple times
    }

    public void removeNumall(int number) {
        Node current = head;
        //checking if number is at the start consecutively and removing it
        while (head.data == number) {
            head = head.next;
        }
        //traversing entire list and removing number
        while (current.next != null) {
            while (current.next.data == number) {   //for consecutive entries in the list
                current.next = current.next.next;
                if (current.next == null)
                    return;
            }
            current = current.next;
        }
    }

    public void add(int index, int data) {
        if (head == null || index == 0) {   //checks if list empty or index given is 0 to add to start of list
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;                //logic of prepend process
            return;
        }

        Node current = head;
        int currentIndex = 0;
        //traverses list until one less of index given
        while (current.next != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        //once reached...node added
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;     //logic of prepend process
    }

    public void removeIndex(int index) {
        //checking if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        //deletion of first node
        if (index == 0) {
            head = head.next;
            return;
        }
        //traverses list until one less of index given
            Node current = head;
            int currentIndex = 0;
            while (current.next != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            // if index greater than size of list
            if (current.next == null) {
                System.out.println("Given index does not exist");
                return;
            }
            //updating pointer and deleting
            current.next = current.next.next;
        }

    public void getAscii(String a) {
        for (int i = 0; i < a.length(); i++) {
            int b = a.charAt(i);
            this.append(b);
        }
    }

    public String getString() {
        String a = "";
        Node current = head;
        while (current != null) {
            a=a+(char)current.data;
            current = current.next;
        }

        return a;
    }

}


