
    import java.io.*;
import java.util.*;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    class DayTwentyFour
    {

        public static Node removeDuplicates(Node head) {
            //Write your code here
            if (head == null || head.next == null) {
                return head;
            }

            Node prev = head;
            Node curr = head.next;
            Set<Integer> set = new HashSet<Integer>();
            set.add(head.data);

            while (curr != null) {
                if (set.contains(curr.data)) {
                    prev.next = curr.next;
                    curr = prev.next;
                } else {
                    set.add(curr.data);
                    prev = curr;
                    curr = curr.next;
                }
            }

            return head;
        }

        public static  Node insert(Node head,int data)
        {
            Node p=new Node(data);
            if(head==null)
                head=p;
            else if(head.next==null)
                head.next=p;
            else
            {
                Node start=head;
                while(start.next!=null)
                    start=start.next;
                start.next=p;

            }
            return head;
        }
        public static void display(Node head)
        {
            Node start=head;
            while(start!=null)
            {
                System.out.print(start.data+" ");
                start=start.next;
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            Node head=null;
            int T=sc.nextInt();
            while(T-->0){
                int ele=sc.nextInt();
                head=insert(head,ele);
            }
            head=removeDuplicates(head);
            display(head);

        }
    }

