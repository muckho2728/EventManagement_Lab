//class for singly linked list of genertic elements
package Model;

public class SLL <T> {
    protected SLL_Node<T> head, tail;
    
    //Initialize an empty list
    public SLL() {
        head = tail = null;
    }
    
    //getter and setter
    public SLL_Node<T> getHead() {
        return head;
    }

    public void setHead(SLL_Node<T> head) {
        this.head = head;
    }

    public SLL_Node<T> getTail() {
        return tail;
    }

    public void setTail(SLL_Node<T> tail) {
        this.tail = tail;
    }
    
    //check whether the list is empty
    public boolean isEmpty() {return head == null;}
    
    //add an element to the head of the list
    public void addToHead(T el) {
        head = new SLL_Node<T>(el, head);
        if (tail == null) tail = head;
    }

    //delete the node containing info = el
    public void delete (T el) {
        if (!isEmpty()) 
            if (head == tail && el.equals(head.info)) //if only one
                head = tail = null;  //node of the list;
            else if (el.equals(head.info)) //if more than one node of the list;
                head = head.next; //and el is in the head node;
            else {              //if more than one node in the list
                    SLL_Node<T> pred, tmp = null;//and el is in a nonhead node;
                    for (pred = head, tmp = head.next; 
                         tmp != null && !(tmp.info.equals(el));
                         pred = pred.next, tmp = tmp.next);
                    if (tmp != null) {  //if el was found;
                        pred.next = tmp.next;
                        if (tmp == tail) //if el is in the last node;
                            tail= pred;
                    }
                }
    }
     // print the list
    
    public void printAll(){
        for (SLL_Node<T> tmp = head; tmp != null; tmp = tmp = tmp.next)
            System.out.println(tmp.info);
    }
    
    //checking whether the el element is the list
    public boolean isInList( T el ) {
        SLL_Node<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        return tmp != null;
    }
}
