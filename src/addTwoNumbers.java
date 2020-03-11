public class addTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] arrgs){
        ListNode listNode=new ListNode(0);


        ListNode listNode1=new ListNode(0);
        listNode1.next=new ListNode(0);
        listNode1.next.next=new ListNode(9);
        ListNode node=TwoNumbers(listNode,listNode1);
        for(int i=0;;i++){
            if(node!=null) {
                System.out.println(node.val + "->");
                node=node.next;
            }

            else
                break;
        }

    }
    private static ListNode TwoNumbers(ListNode l1, ListNode l2){
        int numL1=1;
        int numL2=1;
        int sum=0;
        ListNode listNode=new ListNode(0);
        ListNode Node=listNode;


        for(int i=0;;i++) {
            if (l1!=null) {
                sum = sum + l1.val;
                l1=l1.next;
            }
            if (l2!=null) {
                sum = sum + l2.val;
                l2=l2.next;
            }

            if(sum%10!=0||sum/10!=0||l1!=null||l2!=null){
                if(i==0)
                    listNode.val=sum%10;
                else {
                    listNode.next = new ListNode(0);
                    listNode = listNode.next;
                    listNode.val = sum % 10;
                }

                sum=sum/10;
            }
            else
                    break;

        }
        return  Node;
    }
}
