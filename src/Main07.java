import org.w3c.dom.Node;

public class Main07 {
    public static void main(String[] args) {

        Node07 f = new Node07(1,null,null);
        Node07 g = new Node07(4, null, null);
        Node07 h = new Node07(7, null, null);
        Node07 i = new Node07(13, null,null);
        Node07 d = new Node07(14, i,null);
        Node07 e = new Node07(6, g,h);
        Node07 c = new Node07(10,null,d);
        Node07 b = new Node07(3,f,e);
        Node07 a = new Node07(8,b,c);

       // BinarySearchTree tree = new BinarySearchTree(a);

//        System.out.println("----------LINE A) (NUMBER OF VERTICES)-------------");
//        System.out.println(tree.numberOfNodes(a));
//
//        System.out.println("----------LINE B) (TREE HEIGHT)-------------");
//        System.out.println(tree.heightOfTree(a));
//
//        System.out.println("----------LINE C) (CHECK FOR BST)-------------");
//        System.out.println(tree.isBST(a));
//
//        System.out.println("----------LINE D) (SEARCH BY KEY)-------------");
//        System.out.println(tree.searchByKey(a,200));
//
//        System.out.println("----------LINE E) (MAXIMUM VALUE)-------------");
//        System.out.println(tree.getMax(a));
//
//        System.out.println("----------LINE F) (MINIMUM VALUE)-------------");
//        System.out.println(tree.getMin(a));

        BinarySearchTree treeFromFile = new BinarySearchTree();
        treeFromFile.readFromFile("C:\\Users\\radka\\IdeaProjects\\Heap\\src\\input.txt");
        System.out.println(treeFromFile.heightOfTree(treeFromFile.getRoot()));
        System.out.println(treeFromFile.numberOfNodes(treeFromFile.getRoot()));


    }
}
