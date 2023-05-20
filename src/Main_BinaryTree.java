public class Main_BinaryTree {
    public static void main(String[] args) {

        TreeNode rootF = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");

        TreeNode f = new TreeNode("F");
        //TreeNode g = new TreeNode("G");
//        TreeNode h = new TreeNode("H");
//        TreeNode i = new TreeNode("IIIII");


//        d.setLeftChild(c);
//        d.setRightChild(e);

        b.setLeftChild(d);
//        b.setRightChild(d);

        c.setLeftChild(e);

        c.setRightChild(f);

        rootF.setLeftChild(b);
        rootF.setRightChild(c);

        rootF.preorder(rootF);

        rootF.postOrder(rootF);
//        System.out.println("-----------------EXERCISE 1-SECOND PART----------------------");
//        rootF.iterativePreorder(rootF);
//        System.out.println("-----------------EXERCISE 2--BREADTH-FIRST SEARCH----------------------");
//        rootF.levelOrder(rootF);
//        System.out.println("------------------------ECERCISE 2---------------");
//        rootF.secPreOrder(rootF, System.out::println);
//        rootF.secPreOrder(rootF, node -> {
//            for (int j = 0; j < 10
//                    ; j ++) {
//                System.out.println(node.getData());
//            }
//        });
//        System.out.println(rootF.preOrderFunc(rootF,node -> node.getData().length()));
//
//        System.out.println("--------------EXERCISE 3 (DUPLICATE ELEMENTS)------------");
//         if (rootF.checkSameElem(rootF))
//             System.out.println("YES");
//         else
//             System.out.println("NO");
//       // rootF.sameElem(rootF);


    }
}
