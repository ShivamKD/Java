

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivamkd
 */
public class Main {
    public static void main(String[] args) {
        
        MyQueue<Integer> myqueue = new MyQueue<>();
        myqueue.push(1);
        myqueue.push(2);
        System.out.println(myqueue.front());
        myqueue.push(10);
        myqueue.push(11);
        while(!myqueue.isEmpty()){
            System.out.println(myqueue.front());
            myqueue.pop();
        }
    }
}
