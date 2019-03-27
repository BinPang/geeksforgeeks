package finding_middle_element_in_a_linked_list;

import java.util.Scanner;

public class FindMiddle {
    Node head;  // head of list


    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {


        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            FindMiddle llist = new FindMiddle();
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            GFG gfgobj = new GFG();
            //llist.head = new GFG().Middle(llist.head);
            System.out.println(gfgobj.getMiddle(llist.head));

            //llist.printList();

            t--;
        }
    }
}
