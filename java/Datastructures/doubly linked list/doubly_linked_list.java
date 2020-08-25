
public class doubly_linked_list {
    
    
    public static class DoubleLinkedList {
        Node head;
        DoubleLinkedList(int[] data) {
            this.head = new Node(data[0]);
            for (int i = 1; i < data.length; i++) {
                this.append(new Node(data[i]));
            }
        }

        private static class Node {
            public int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
            }

            Node(int data, Node next, Node prev) {
                this.data = data;
                this.next = next;
                this.prev = prev;
            }

            public Node copy() {
                return new Node(this.data, this.next, this.prev);
            }
        }

        private Node getHead() {
            return this.head;
        }

        private void append(Node n) {
            Node current = getHead();
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
        public void append(int n) {
            Node current = getHead();
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(n);
        }

        public void print() {
            Node current = getHead();
            System.out.print("[");
            do {
                System.out.print(current.data + ", ");
                current = current.next;

            } while (current.next != null);
            System.out.print(current.data + "]\n");
        }

        public int lenght() {
            int counter = 1;
            Node current = getHead();
            while (current.next != null) {
                current = current.next;
                counter +=1;
            }
            return counter;
        }
        
        // example usage of doubly linked lists
        public void putFirst(Node n) {
            Node old_head = this.head.copy();
            this.head.prev = n;
            this.head = this.head.prev;
            this.head.next = old_head;
        }

        public void putFirst(int n) {
            Node old_head = this.head.copy();
            this.head.prev = new Node(n);
            this.head = this.head.prev;
            this.head.next = old_head;
            
        }
    }

    public static void main(String[] args) {

        int[] data = {3,5,34,6,45,7,54};

        DoubleLinkedList l = new DoubleLinkedList(data);
        l.print();
        l.append(99);
        l.putFirst(77);
        l.print();
    }
}