
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class TreeNode {
    private String data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public TreeNode(String data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
//DEPTH-FIRST IMPLEMENTATION
    public void preorder (TreeNode node) {
        if ( node == null) return;
        System.out.println(node.getData());
        preorder(node.leftChild);
        preorder((node.rightChild));
    }

    public void iterativePreorder(TreeNode node) {
        if (node == null)
            return ;
        Stack <TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            System.out.println(node.getData());

            if (node.rightChild != null) {
                stack.push(node.rightChild);
            }
            if (node.leftChild != null) {
                stack.push(node.leftChild);
            }
        }
    }
//BREADTH FIRST IMPLEMENTATION
    public void levelOrder (TreeNode node) {
       Queue <TreeNode> queue = new LinkedList<>();
      // Queue <TreeNode> queue = new PriorityQueue<>();

        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.remove();
            System.out.println(node.getData());

            if (node.leftChild != null) {
                queue.add(node.leftChild);
            }
            if (node.rightChild != null) {
                queue.add(node.rightChild);
            }
        }
    }

    public void postOrder (TreeNode node) {
        if (node == null) return;
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.println(node.getData());
    }


   public void secPreOrder (TreeNode node, Consumer <TreeNode> p) {
        if ( node == null) return;
        p.accept(node);
        secPreOrder(node.leftChild, p);
        secPreOrder(node.rightChild, p);
   }

   public Integer preOrderFunc (TreeNode node, Function<TreeNode, Integer> p) {
        if (node== null) return 0;

        Integer res = p.apply(node);
        Integer leftRes = preOrderFunc(node.leftChild, p);
        Integer rigthRes = preOrderFunc(node.rightChild, p);

        return res
                + leftRes + rigthRes;
   }

   public boolean sameElem (TreeNode node, HashSet<String> s) {

        if (node == null)
            return false;

        if (s.contains(node.data))
            return true;

        s.add(node.data);

        return sameElem(node.leftChild, s) || sameElem(node.rightChild, s);
//         if (node.getData() == node.leftChild.getData()) {
//            return true;
//        } else if (node.getData() == node.rightChild.getData()) {
//            return true;
//        }
//       sameElem(node);
//       return false;
   }

   public boolean checkSameElem (TreeNode node) {
        HashSet <String> s = new HashSet<>();
        return sameElem(node, s);
   }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode { " +
                "data='" + data + '\'' +
                '}';
    }
}
