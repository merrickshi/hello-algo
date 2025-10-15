package leetcode;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 *
 *
 * @author merrick
 * @date 2025/9/7 00:12:27
 */
public class TwoSumP1 {

    private Integer[] twoSum(Integer[] arr, Integer target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value, index
        Integer complement = 0;
        for (int i = 0; i < arr.length; i++) {
            complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new Integer[]{map.get(complement), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return null;
    }
}