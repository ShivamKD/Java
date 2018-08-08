
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shivamkd
 */
public class StackSort {

    static Stack<Integer> stackSort(Stack<Integer> stack) {
        Stack<Integer> anotherStack = new Stack<>();
        while (!stack.isEmpty()) {
            Integer item = stack.peek();
            stack.pop();

            while (!anotherStack.isEmpty() && anotherStack.peek() < item) {
                stack.push(anotherStack.peek());
                anotherStack.pop();

            }

            anotherStack.push(item);
        }
        return anotherStack;

    }

    static void display(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(0);
        stack.push(8);
        stack.push(12);
        stack.push(8);
        Stack<Integer> sortedStack = StackSort.stackSort(stack);
        StackSort.display(sortedStack);
    }
}
