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

}
