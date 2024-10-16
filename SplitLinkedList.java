public class SplitLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
        public ListNode[] splitListToParts(ListNode root, int k) {
            int length = 0;
            ListNode current = root;
          
            // Calculate the total length of the linked list.
            while (current != null) {
                ++length;
                current = current.next;
            }
          
            // Calculate the minimum number of nodes each part should have.
            int minPartSize = length / k;
            // Calculate how many parts should have an extra node.
            int extraNodes = length % k;
          
            ListNode[] result = new ListNode[k];
            current = root;
          
            // Divide the list into parts.
            for (int i = 0; i < k; ++i) {
                ListNode partHead = current;
                // Determine the size of the current part,
                // which is minPartSize plus one if this part is supposed to have an extra node.
                int currentPartSize = minPartSize + (i < extraNodes ? 1 : 0);
              
                // Traverse to the end of the current part.
                for (int j = 0; j < currentPartSize - 1; ++j) {
                    if (current != null) {
                        current = current.next;
                    }
                }
              
                // Detach the current part from the remainder of the list.
                if (current != null) {
                    ListNode nextPartHead = current.next;
                    current.next = null;
                    current = nextPartHead;
                }
              
                // Add the head of the current part to the result array.
                result[i] = partHead;
            }
          
            return result;
        }

        
    }
    
