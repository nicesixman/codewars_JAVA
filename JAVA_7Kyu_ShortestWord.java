package codewars_7Kyu_ShortestWord;

import java.util.Scanner;

public class ShortestWord {
	public static void main(String[] args) {
		System.out.println("영문자 입력: ");
		
		// Scanner를 통해 입력받은 strInput을 객체로 만들어서 변수 s에 넣어줘야 한다.
		Scanner strInput = new Scanner(System.in);
		String s = strInput.nextLine();
		strInput.close();
				
		// 함수 호출
		findShort(s);
	}
	
	public static int findShort(String s) {
		String[] splited = s.split(" ");
		String bubble;
		
		// 버블 정렬 이용. (O(n^2))
		for (int i=0; i<splited.length; i++)
		{
			for (int j=0; j<splited.length-1; j++)
			{
				if (splited[j].length() > splited[j+1].length())
				{
					bubble = splited[j];
					splited[j] = splited[j+1];
					splited[j+1] = bubble;
				}
			}
		}
		// debug
		/*
		for (int k=0; k<splited.length; k++)
			System.out.println(splited[k] + " " + splited[k].length());
		*/
		return splited[0].length();
    }
}
