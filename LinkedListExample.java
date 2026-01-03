public class LinkedListExample {
    
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head;

    //Add - first,last
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    //Print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //Deletion methods - first,last
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    //Reverse the linked list
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //Update pointers
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
        
    }

    //Delete Nth node from end 
    public Node deleteNthFromEnd(Node head,int n){
        if(head == null){
            return null;
        }
        //Size calculation
        int size = 0;
        Node currNode = head;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }
        if(n == size){
            return head.next;
        }
        int indexToSearch = size - n;
        Node prevNode = head;
        int i = 1;
        while(i<indexToSearch){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    //Palindrome check
    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node middle = findMiddle(head);
        Node secondHalfStart =reverseRecursive(middle.next);

        Node firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public Node findMiddle(Node head){
        
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }

    //Detecting Cycle in Linked List
    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    

    public static void main(String args[]){
        LinkedListExample list = new LinkedListExample();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        list.printList();
        // list.reverseIterate();
        // list.printList();
        // list.head = list.reverseRecursive(list.head);
        // list.printList();
        // list.head = list.deleteNthFromEnd(list.head,2);
        // list.printList();
        System.out.println("Is Palindrome: " + list.isPalindrome(list.head));
    
    }
}
