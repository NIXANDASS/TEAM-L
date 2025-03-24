import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findpos(nums, target, true);
        int last = findpos(nums, target, false);
        return new int[]{first, last};
    }

    private int findpos(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int pos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                pos = mid;
                if (findFirst) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target: ");
        int target = scanner.nextInt();
        
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and last position: " + Arrays.toString(result));
        
        scanner.close();
    }
}
