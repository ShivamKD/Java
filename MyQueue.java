
/**
 * Code to implement Queue Using Two Stacks.
 * @author shivamkd
 */

import java.util.*;
public class MyQueue<T> {
    private Stack<T> one, two;

    public MyQueue() {
        one  = new Stack<>();
        two = new Stack<>();
    }
    
    void push(T item){
        one.push(item);
    }
    
    void shift(){
        while(!one.isEmpty()){
            T item = one.peek();
            one.pop();
            two.push(item);
        }
    }
    
    T pop(){
        if( one.isEmpty()  && two.isEmpty()){
            return null;
        }
        
        if(two.isEmpty()){
            shift();
        }
        
        T item = two.peek();
        two.pop();
        return item;
    }
    
    T front(){
        if( one.isEmpty()  && two.isEmpty()){
            throw new EmptyStackException();
        }
        
        if(two.isEmpty()){
            shift();
        }
        
        T item = two.peek();
        return item;
    }
    boolean isEmpty(){
        return (one.size() + two.size()) == 0;
    }
    
    int size(){
        return one.size() + two.size();
    }
    
}
