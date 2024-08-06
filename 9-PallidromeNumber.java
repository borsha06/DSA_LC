class Solution {
	public boolean isPalindrome(int x) {
		int num = x;
		int mult = 0;
		if (num < 0) {
			return false;
		} else {
			while (x != 0) {
				int new_num = x % 10;
				x = x / 10;
				mult = mult * 10 + new_num;
			}
		}

		if (num == mult) {
			return true;
		} else {
			return false;
		}
	}
}