class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < nums1List.size(); i++) {
            if (nums2List.contains(nums1List.get(i))) {
                c1++;
            }

        }
        for (int i = 0; i < nums2List.size(); i++) {
            if (nums1List.contains(nums2List.get(i))) {
                c2++;
            }

        }

        int[] result = { c1, c2 };

        return result;

    }
}