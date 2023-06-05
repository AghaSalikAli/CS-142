public class driverclass {
    public static void main(String[] args) {
        /*Linkedlist l1 = new Linkedlist();
        l1.append(2);
        l1.append(1);
        l1.append(4);
        l1.append(3);
        l1.append(4);
        l1.append(4);
        l1.append(3);
        l1.append(2);
        l1.currentstate();
        l1.reverseList();
        l1.currentstate();
        l1.removeDuplicates();*/

      Stack s1 = new Stack();
        s1.push(2);
        s1.push(3);
        s1.currentstate();
        s1.pop();
        s1.currentstate();
        s1.push(5);
        s1.currentstate();
        s1.pop();
        s1.currentstate();
        s1.pop();
        s1.currentstate();
    }
}