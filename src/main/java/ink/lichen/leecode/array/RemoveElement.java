package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class RemoveElement {


    public int removeElement(int[] nums, int val) {

        int j = -1,n = nums.length;

        for (int i = 0 ; i < n; i++)
        {
            if (nums[i] != val){
                nums[++j] = nums[i];
            }

        }
        return j+1;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }
}
