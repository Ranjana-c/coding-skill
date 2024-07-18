import java.util.*;
class DLLNode {
    char data;
    DLLNode prev, next;

    DLLNode(char d) {
        data = d;
        prev = next = null;
    }
}

class DoublyLinkedList {
    DLLNode head, tail;
  
    DoublyLinkedList() {
        head = tail = null;
    }

    void add(char data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    boolean isPalindrome() {
        if (head == null) {
            return true; 
        }

        DLLNode left = head;
        DLLNode right = tail;

        while (left != null && right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
    }
}

public class PalindromeUsingDLL {

    public static void main(String[] args) {
        String str = "madam";
        
        DoublyLinkedList dll = new DoublyLinkedList();
        
        for (int i = 0; i < str.length(); i++) {
            dll.add(str.charAt(i));
        }
        
        if (dll.isPalindrome()) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
