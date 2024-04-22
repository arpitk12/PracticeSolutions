class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node = new ListNode();
    ListNode res = node; //Point the ListNode to the head of the result
    byte carry = 0;
    do {
      int sum = (l1 == null) ? l2.val + carry : ((l2 == null) ? l1.val + carry : l1.val + l2.val + carry); //Sum of the two digits with carry
      if (sum > 9) {
        sum = sum % 10;
        carry = 1;
      } else {
        carry = 0;
      }
      node.next = new ListNode(sum); //Add the sum to the result
      node = node.next;  //Move the pointer to the next node
      l1 = (l1 != null) ? l1.next : null; //Move to the next digit of l1
      l2 = (l2 != null) ? l2.next : null;  //Move to the next digit of l2
    } while (l1 != null || l2 != null); //Repeat until both l1 and l2 are proccessed
    if (carry == 1) { //If there is a carry left, add it to the result as new node
      node.next = new ListNode(1);
    }
    return res.next; //Return the head of the result
  }
}