import org.w3c.dom.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {

    private Node07 root;

    public BinarySearchTree(){}
//    public BinarySearchTree(Node07 root) {
//        this.root = root;
//    }

    public Node07 getRoot() {
        return root;
    }

    public void setRoot(Node07 root) {
        this.root = root;
    }


//    a) подсчет количества вершин
        public int numberOfNodes(Node07 node) {
        if (node == null)
            return 0;

        int l = numberOfNodes(node.getLeft());
        int r = numberOfNodes(node.getRight());

        return l + r + 1;
        }

        public int rootNumberNodes() {
        return numberOfNodes(root);
        }
//    b) нахождение высоты дерева

    public int heightOfTree(Node07 node) {
        int height = 0;

        Queue <Node07> queue = new LinkedList<>();

        queue.add(node);
        queue.add(null);
//        while (!queue.isEmpty()) {
//            int s = queue.size();
//
//            for (int i = 0; i < s; i++) {
//                Node07 tmp = queue.poll();
//                if (tmp.getLeft() != null)
//                    queue.add(tmp.getLeft());
//                if (tmp.getRight() != null)
//                    queue.add(tmp.getRight());
//
//                height ++;
//            }
//        }

        while (!queue.isEmpty()) {
            Node07 tmp = queue.peek();
            queue.remove();

            if (tmp == null) {
                height ++;
            }

            if (tmp != null) {
                if (tmp.getLeft() != null)
                    queue.add(tmp.getLeft());
                if (tmp.getRight() != null)
                    queue.add(tmp.getRight());
            } else if (!queue.isEmpty()) {
                queue.add(null);
            }

        }
        return height;
    }
//    c) проверта того, является ли дерево BST: для каждой вершины ключи в левом поддерева меньше, в
//    правом поддереве – больше
    public int max(Node07 node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int value = node.getKey();
        int leftMax = max(node.getLeft());
        int rightMax = max(node.getRight());

        return Math.max (value, Math.max(leftMax,rightMax));
    }

    public int min (Node07 node) {
        if (node == null)
        return Integer.MAX_VALUE;

        int value = node.getKey();
        int leftMin = min(node.getLeft());
        int rightMin = min(node.getRight());

        return Math.min (value, Math.min(leftMin,rightMin));
    }

    public boolean isBST(Node07 node) {

        if(node == null)
            return true;
        if (node.getRight() != null && max(node.getLeft()) > node.getKey())
            return false;
        if (node.getRight() != null && min(node.getRight()) < node.getKey())
            return false;

        if (isBST(node.getLeft()) != true || isBST(node.getRight()) != true)
            return false;

        return true;
    }
//    d) поиск по ключу

    public Node07 searchByKey (Node07 node, int key) {
        if (node == null || node.getKey() == key) {
            return node;
        }

        if (key < node.getKey()) {
            return searchByKey(node.getLeft(), key);
        }
        return searchByKey(node.getRight(), key);
    }
//    e) поиск максимального элемента в дереве

    public Node07 getMax (Node07 node) {
        while (node.getRight() != null)
            node = node.getRight();
        return node;
    }
//    f) поиск минимального элемента в дереве

    public Node07 getMin (Node07 node) {
        while (node.getLeft() != null)
            node = node.getLeft();
        return node;
    }
//    g) для заданного элемента поиск следующего элемента
//    h) удаление элемента по ключу
//    i) вставка элемента

//    j) чтение данных для дерева из текстового файла

    public void readFromFile(String path) {

        try (Scanner radka = new Scanner(new File(path))) {
            int n = radka.nextInt();
            Node07[] nodes = new Node07[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node07();
            }
            for (int i = 0; i < n; i++) {
                nodes[i].setKey(radka.nextInt());

                int left = radka.nextInt();
                int right = radka.nextInt();

                if (left != 0) {
                    nodes[i].setLeft(nodes[left - 1]);
                    nodes[left -1].setParent(nodes[i]);
                }

                if (right != 0) {
                    nodes[i].setRight(nodes[right - 1]);
                    nodes[right - 1].setParent(nodes[i]);
                }
            }

            root = nodes[0];

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }


    }


}
