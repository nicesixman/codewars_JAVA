package codewars_6Kyu_FindTheParityOutlier;

import java.util.Scanner;

public class FindTheParityOutlier {

	public static void main(String[] args) {
		// 테스트로 5개의 수만 입력.
		int test[] = new int[5];
		
		// Scanner를 통해 입력받은 intInput을 객체로 만들어서 변수 test[i]에 넣어줘야 한다.
		Scanner intInput = new Scanner(System.in);
		for (int i=0; i<5; i++)
			test[i] = intInput.nextInt();
		intInput.close();
		
		// 함수 호출
		find(test);
	}
	
	static int find(int[] integers) {
		int odd = 0, even = 0, outlier = 0;
		
		for (int i=0; i<integers.length; i++)
		{
			if (integers[i] % 2 == 0 || integers[i] == 0)
			{
				even++;
				if (even == 1 && odd >= 2)
				{
					outlier = integers[i];
					System.out.println(outlier);
					return outlier;
				}
			}
			else if (integers[i] % 2 != 0)
			{
				odd++;
				if (odd == 1 && even >= 2)
				{
					outlier = integers[i];
					System.out.println(outlier);
					return outlier;
				}
			}
		}
		return 0;
	}
}
