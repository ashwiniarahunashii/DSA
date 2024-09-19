package Leetcode;

//    https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=programming-skills
public class Merge_string_alternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="abcd";
		String word2="pqrs";
		String ans=merge(word1,word2);
		System.out.println(ans);
		

	}
	static String merge(String word1,String word2) {
		StringBuilder result=new StringBuilder();
		int i=0;
		while(i<word1.length()||i<word2.length()) {
			if(i<word1.length()) {
				result.append(word1.charAt(i));
			}
			if(i<word2.length()) {
				result.append(word2.charAt(i));
			}
			i++;
		}
		return result.toString();
	}

}
