package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-2.
 */
public class SortColors {



    public void sortColors(int[] nums) {

        int red = 0,n = nums.length;
        int blue = n-1;
        for (int i = 0 ; i < blue; i++)
        {
            if (nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[red];
                nums[red++] = temp;
            }else if (nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[blue];
                nums[blue--] = temp;
            }
        }

    }

}
