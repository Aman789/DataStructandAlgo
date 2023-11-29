public class Exercise {

    // check if string only contains unique char

    public boolean uniqueCheck(String s) {

        int[] charLen = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            if (charLen[c] > 0) {
                return false;
            }
            charLen[c]++;
        }

        return true;
    }

    public String replaceWhiteSpace(String s, int length) {
        String temp = "";
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                temp = temp + "%20";
            } else {
                temp = temp + s.charAt(i);
            }
        }
        return temp;
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int out = nums[0];
        int cnt =0;
        for (int i = 0; i < nums.length; i++) {
            if (out + nums[i] > out && nums[i+1]> out){
                out+=nums[i];
            }
            else{
                out=nums[i];
            }

        }

        return out;
    }

    public int removeDuplicates(int[] nums) {
        int cnt =1;
        int un=1;
        for (int i=1;i<nums.length;i++){
            int curr = nums[i];
            int prev = nums[i-1];
            if (curr == prev){
                un++;
                if (un <3){
                    cnt++;
                }
            }
            else{
                nums[cnt] = nums[i];
                un=2;
                cnt+=2;
            }
        }
        return cnt;
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode curr = new ListNode(0);
    
            int i=1;
            int fl =0;
            int sl=0;
            while (l1 != null){
                fl =fl + l1.val*i;
                i=i*10;
                l1=l1.next;
            }
            i=1;
            while (l2 != null){
                sl =sl + l2.val*i;
                i=i*10;
                l2=l2.next;
            }
            int res = fl+sl;
            i=10;
            while (res/i != 0){
                ListNode li = new ListNode(res/i % 10);
                curr =li;
                curr=curr.next;
                i=i*10;
            }
    
            System.out.println(res);
            System.out.println(res%10);
            System.out.println(res/10);
            System.out.println(res/10 %10);
            System.out.println(res/100);
            System.out.println(res/100 %10);
            System.out.println(res/1000);
    
    
    
            return curr;
        }
    }

}


