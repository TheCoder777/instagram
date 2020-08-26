public class binary_tree {

    public static class BinaryTree {
        Node root;

        BinaryTree(Node root) {
            this.root = root;
        }

        BinaryTree(int data) {
            this.root = new Node(data);
        }

        private Node getRoot() {
            return this.root;
        }

        public int sum() {
            Node root = getRoot();
            int sum = root.data;
            if (root.left == null && root.right == null) {
                return sum;
            } else {
                return sum + sum(root.left) + sum(root.right);
            }

        }

        public int sum(Node n) {
            int leftSum, rightSum;
            int sum = n.data;
            System.out.println(n.data);
            try {
                if (n.left == null && n.right == null) {
                    return sum;
                } else {
                    if (n.hasLeft()) {
                        leftSum = sum(n.left);
                    } else { leftSum = 0;}
                    if (n.hasRight()) {
                        rightSum = sum(n.right);
                    } else {rightSum = 0;}

                    return sum + leftSum + rightSum;
                } 
            } catch (NullPointerException e) {
                return sum;
            }
        }

        public void print() {
            int stage = 0;
            Node root = getRoot();
            System.out.println(root.data);

            print(root.right, stage, "right");
            print(root.left, stage, "left");
            
        }

        private void print(Node current, int stage, String side) {
            int intend = 3;

            for (int i = 0; i < intend * stage; i++) {
                if (i == 0) {
                    System.out.print("│");
                }
                if (i == intend) {
                    if (current.hasChildren()) {
                        System.out.print(" ");
                    } else {
                        System.out.print("│");
                    }
                } else {
                    System.out.print(" ");
                }
                
            }
            if (side == "left" ) {
                System.out.print("└");
            } else if (side == "right") {
                System.out.print("├");
            }
            for (int i = 0; i - 1 < stage; i++) {
                System.out.print("─");
            }
            System.out.println(" " + current.data);
            if (current.hasChildren()) {
                stage += 1;
                print(current.right, stage, "right");
                print(current.left, stage, "left");
            }
            
        }

        class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
            // for node
            public void appendLeft(Node left) {
                this.left = left;
            }

            public void appendRight(Node right) {
                this.right = right;
            }
            // for int
            public void appendLeft(int d) {
                this.left = new Node(d);
            }

            public void appendRight(int d) {
                this.right = new Node(d);
            }

            public Boolean hasChildren() {
                if (this.left != null && this.right != null) {
                    return true;
                } else {
                    return false;
                }
            }

            public Boolean hasLeft() {
                if (this.left != null) {
                    return true;
                } else {
                    return false;
                }
            }

            public Boolean hasRight() {
                if (this.right != null) {
                    return true;
                } else {
                    return false;
                }
            }

            public String getCase() {
                if (this.hasChildren()) {
                    return "both";
                } else if (! this.hasChildren()) {
                    return "none";
                } else if (this.hasRight()) {
                    return "right";
                } else if (this.hasLeft()) {
                    return "left";
                }
                return "";
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree(7);
        t.root.appendLeft(3);
        t.root.appendRight(9);
        t.root.right.appendLeft(7);
        t.root.right.appendRight(9);
        t.root.left.appendLeft(4);
        t.root.left.appendRight(5);
        t.root.right.left.appendRight(4);
        t.root.right.left.appendLeft(3);
        t.root.right.right.appendLeft(7);
        t.root.right.right.appendRight(9);
        t.root.right.right.right.appendRight(66);

        System.out.println(t.sum());
        t.print();


    }
}


/* sum
            int intend = 3;

            for (int i = 0; i < intend * stage; i++) {
                if (i == intend) {
                    if (current.hasChild()) {
                        System.out.print(" ");
                    }else {
                        System.out.print("│");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("└");
            for (int i = 0; i -1 < stage; i++) {
                System.out.print("─");
            }
            System.out.println(" " + current.data);
            if (current.hasChild()) {
                stage += 1;
                print(current.left, stage);
                print(current.right, stage);
            }
*/