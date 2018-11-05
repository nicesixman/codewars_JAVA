package codewars_7kyu_FixStringCase;

import java.util.Scanner;

public class FixStringCase {
	public static void main(String[] args) {
		System.out.print("대소문자 섞어서 영단어 입력: ");
		
		// Scanner를 통해 입력받은 strInput을 객체로 만들어서 변수 str에 넣어줘야 한다.
		Scanner strInput = new Scanner(System.in);
		String str = strInput.nextLine();
		strInput.close();
		
		// 함수 호출
		solve(str);
	}
	
	public static String solve(final String str) {
		int lower = 0, upper = 0;
		String lowerWord, upperWord;
		
		for (int i=0; i<str.length(); i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				lower++;
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				upper++;
		}
		
		if (lower > upper)
		{
			lowerWord = str.toLowerCase();
			System.out.println(lowerWord);
			return lowerWord;
		}
		else if (lower < upper)
		{
			upperWord = str.toUpperCase();
			System.out.println(upperWord);
			return upperWord;
		}
		else if (lower == upper)
		{
			lowerWord = str.toLowerCase();
			System.out.println(lowerWord);
			return lowerWord;
		}
		return str;
	}
}
