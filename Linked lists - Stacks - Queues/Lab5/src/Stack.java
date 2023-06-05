public class Stack {
    Node top;

    public void push (int data) {
        Node newnode = new Node(data);
        if (top==null) {
            top = newnode;
        } else
            newnode.next = top;
        top = newnode;
        }


    public void currentstate() {
        //checks if top node is empty
        if (top == null) {
            System.out.println("The stack is empty.");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        //traversing entire stack and printing
        while (current!= null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" , ");
            current = current.next;
        }
        System.out.println();
    }

    public void pop () {
        if (top==null) {
            System.out.println("Stack is empty.");
        return;
        }
        int x = top.data;
        top=top.next;
        System.out.println(x);
    }

}
