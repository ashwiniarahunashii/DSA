package kodNest;

import java.util.HashMap;

public class ibm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 3, 5};
        int target = 2;
        int count = NumPairs(arr, target);
        System.out.println("Count of pairs with difference " + target + " : " + count);
    }

    public static int NumPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            // Check if (num + target) or (num - target) exists in map
            if (map.containsKey(num + target)) {
                count += map.get(num + target); // Add the frequency of num + target
            }
            if (map.containsKey(num - target)) {
                count += map.get(num - target); // Add the frequency of num - target
            }
            
            // Update the frequency of the current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}

