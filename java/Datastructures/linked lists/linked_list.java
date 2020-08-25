
public class linked_list {
    
    
    static class LinkedList {
        Node head;

        LinkedList(int[] data) {
            this.head = new Node(data[0]);
            for (int i = 1; i  < data.length; i++) {
                this.append(new Node(data[i]));
            }
        }

        private static class Node {
            public int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
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

        private Node getHead() {
            return this.head;
        }

        public void print() {
            Node current = getHead();
            System.out.print("[");
            do {
                System.out.print(current.data + ", ");
                current = current.next;

            } while(current.next != null);
            System.out.print(current.data + "]\n");
        }

        public int lenght() {
            int counter = 1;
            Node current = getHead();
            while (current.next != null) {
                current = current.next;
                counter += 1;
            }
            return counter;
        }

    }

    public static void main(String[] args) {
        
        int[] data = {1,2,3,4};

        LinkedList l = new LinkedList(data);
        l.append(7);
        l.print();


        
    }
}