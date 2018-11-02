package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-2.
 */
public class SortColors {



    public void sortColors(int[] nums) {

      int red_idx = 0;
      int blue_idx = nums.length -1;
      for (int i = 0 ; i <= blue_idx;i++ )
      {
          if (nums[i] == 0)
          {
              int temp = nums[i];
              nums[i] = nums[red_idx];
              nums[red_idx++] = temp;
          }else if (nums [i] == 2)
          {
              int temp = nums[i];
              nums[i--] = nums[blue_idx];
              nums[blue_idx--] = temp;
          }
      }

    }

}
