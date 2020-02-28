public class practice1 {
    Node head;

    public practice1() {
        head = null;
    }

    public Node getHead() {

        return head;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

  /* public boolean search(int data) {
        boolean response = false;
        Node temp = head;
        while (temp != null) {
            if (temp.getData()==data) {
                response = true;
                break;
            }
            temp = temp.getNext();
        }
        return response;
    }*/

    public void printlist() {
        System.out.println("printing contact list");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int delete(int data) {
        int response = 0;
        if (head != null) {
            Node temp = head;
            Node previous = null;
            while (temp.getNext() != null) {
                previous = temp;
                temp = temp.getNext();
            }
            response = temp.getData();
            if (previous != null) {
                previous.setNext(null);
            } else {
                head = null;
            }
        }
        return response;
    }
}

