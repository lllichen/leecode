package ink.lichen.leecode.array;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        int lo = 0, hi = n-1;
        while (lo <= hi){
            Character b = s.charAt(lo);
            Character e = s.charAt(hi);
            if (!Character.isLetterOrDigit(b)){
                lo++;
            }else if (!Character.isLetterOrDigit(e)){
                hi--;
            }else {
                if (b != e){
                    return false;
                }
                lo++;
                hi--;
            }

        }
        return true;
    }
}
