package easy;
import java.util.*;
public class HasCircle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            Set set = new HashSet();
            int i = 0;
            while(head!=null){
                set.add(head);
                i++;
                if(set.size()!=i){
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }
}
