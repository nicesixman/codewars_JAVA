package codewars_6Kyu_TheSupermarketQueue;

import java.io.IOException;
import java.util.*;

public class TheSupermarketQueue {
	public static void main(String[] args) throws IOException {
		// Try Sample Test #1
		ArrayList<Integer> CustomerList = new ArrayList<Integer>();
		int ArraySize, queue;
		
		// List 생성.
		System.out.println("Array의 크기를 지정하세요.");
		Scanner ArraySizeInput = new Scanner(System.in);
		ArraySize = ArraySizeInput.nextInt();
		System.out.println("customer 수를 하나씩 입력하세요.");
		Scanner customerInput = new Scanner(System.in);
		for (int i=0; i<ArraySize; i++)
			CustomerList.add(customerInput.nextInt());
		
		// queue 개수 입력.
		System.out.println("queue 수를 입력하세요.");
		Scanner queueInput = new Scanner(System.in);
		queue = queueInput.nextInt();
		
		queueInput.close();
		customerInput.close();
		ArraySizeInput.close();
		
		queueTime(CustomerList, queue);
	}
	
	public static int queueTime(ArrayList<Integer> CustomerList, int queue) {
		// 배열을 queue 크기로 만든 다음, 각 칸마다 List를 기입.
		int makeArray[] = new int[queue];
		int output = 0;
		
		// queue가 1 이라면 단순하게 모든 Array값을 더하면 되므로 예외처리.
		if (queue == 1)
		{
			for (int i=0; i<CustomerList.size(); i++)
				output += CustomerList.get(i);
		}
		
		// queue가 2 이상일 때는 queue만큼 배열 생성하여 CustomerList로부터 값을 불러오면 된다.
		else if (queue > 1)
		{
			
		}
		
		// debugging
		System.out.println(CustomerList.toString());
		System.out.println(queue);
		System.out.println(output);
		return output;
	}
}
