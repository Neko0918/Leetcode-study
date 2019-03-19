/**
 * Copyright (C), 2015-2019
 * FileName: HuiWenList
 * Author:   kritio
 * Date:     2019/3/10 17:05
 * Description: 判断是否是回温链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈判断是否是回温链表〉
 *
 * @author kritio
 * @create 2019/3/10
 * @since 1.0.0
 */
public class HuiWenList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //用快慢指针找到中点，然后反转后半段的链表，在进行比较
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseHead = ReverseList.reverseList(slow.next);

        while (head != null && reverseHead.next != null) {
            if (head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

}