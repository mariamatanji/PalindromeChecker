import java.util.Stack;
public class OurStack<T> implements StackInterface<T>{
    
    private Stack<T> thestack;
    
    public OurStack(){
        
        thestack = new Stack<T>();
    }
    
    public void push(T newEntry){
        
        thestack.push(newEntry);
    }
    public T peek(){
        
        return thestack.peek();
    }
    public T pop(){
        
        return thestack.pop();
    }
    public boolean isEmpty(){
        
        return thestack.isEmpty();
    }
    public void clear(){
        
        thestack.clear();
        
    }
    
}
