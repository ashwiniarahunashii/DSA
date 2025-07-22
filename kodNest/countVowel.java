package kodNest;
import java.util.*;
public class countVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count vowels and Consonents in string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word:");
		String str = sc.next();
		int vowels=0,consonents=0;
		for(char ch:str.toCharArray()) {
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels ++;
			}else {
				consonents++;
			}
		}
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of Consonents: "+consonents);

	}

}
