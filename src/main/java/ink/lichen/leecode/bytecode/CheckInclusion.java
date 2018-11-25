package ink.lichen.leecode.bytecode;


public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length() || s2.length() == 0) {
            return false;
        }

        int[] chars = new int[26];
        char offset = 'a';
        int sum = 0;
        for (int i = 0 ; i < s1.length(); i++){
            chars[s1.charAt(i) - offset] ++;
            chars[s2.charAt(i) - offset] --;
            sum += s1.charAt(i);
            sum -= s2.charAt(i);
        }
        if (sum == 0 && isZero(chars)){
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++){
            chars[s2.charAt(i)-offset] --;
            chars[s2.charAt(i-s1.length())-offset]++;
            sum -= s2.charAt(i);
            sum += s2.charAt(i-s1.length());
            if (sum == 0 && isZero(chars)){
                return true;
            }
        }
        return false;
    }


    private static final boolean isZero(int[] chars){
        for (int val : chars){
            if (val != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckInclusion checkInclusion = new CheckInclusion();
        checkInclusion.checkInclusion("ab",
                "eidbaooo");
    }
}
