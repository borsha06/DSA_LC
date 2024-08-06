class Solution {
    public boolean isPalindrome(String s) {
    s = s.toLowerCase();
		String s1= "";
		for(int i =0;i<s.length(); i++){
			if(s.charAt(i) >='a' && s.charAt(i) <='z' || s.charAt(i) >='0' && s.charAt(i)<='9')
			{
				s1+=(s.charAt(i));
			}
		}
		String s2 = "";
		for(int i =s1.length()-1;i>=0;i--){
			s2+=(s1.charAt(i));
		}

		if(s2.equals(s1)){
			return true;
		}
		else{
			return false;
		}
		
    }
}