package Model;

public class SLL_Node <T> {
    T info;
    SLL_Node<T> next; 
     
    public SLL_Node() { next = null;}
    
    public SLL_Node(T el) { info = el; next = null; }
    
    public SLL_Node(T el, SLL_Node<T> afterEle) {
        info = el ;
        next = afterEle;
    }
    
    
    
    
}
