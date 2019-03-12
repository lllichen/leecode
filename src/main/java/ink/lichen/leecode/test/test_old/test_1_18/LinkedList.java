package ink.lichen.leecode.test.test_old.test_1_18;

public class LinkedList<T> {

    private Node header;

    private Node tail;

    public LinkedList(){
        header =  new Node(null,null,null);
        tail = new Node(header,null,null);
    }

    public boolean add(T t){
        Node node = tail.pre;
        Node newNode = new Node(node,tail,t);
        node.next = newNode;
        newNode.next = tail;
        return true;
    }

    public T remove(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        Node<T> node = tail.pre;
        node.pre.next = node.next;
        tail.pre = node.pre;
        T val = node.val;
        return val;
    }

    private boolean isEmpty(){
        if (header.next == tail){
            return true;
        }
        return false;
    }

    private static class  Node<T>{

        Node<T>  pre;
        Node<T> next;
        T val;

        public Node(Node<T> p,Node<T> n,T val){
            this.pre = p;
            this.next = n;
        }

    }
}