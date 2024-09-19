package Leetcode;

public class Index_Of_FirstOccurence {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        String haystack="sadbutsad";
        String needle= "sad";
        int asn=Strstr(haystack,needle);
        System.out.print(asn);
	}
	static int Strstr(String haystack, String needle)
	{
		return haystack.indexOf(needle);
		
	}

}
