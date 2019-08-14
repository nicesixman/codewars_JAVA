package codewars_6Kyu_TheSupermarketQueue;

import java.io.IOException;
import java.util.*;

public class TheSupermarketQueue {
	public static void main(String[] args) throws IOException {
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
		ArrayList<Integer> CustomerList_Moved = new ArrayList<Integer>();
		int makeArray[] = new int[queue];
		int CustomerList_Moved_Min;
		int CustomerList_Moved_Min_Index;
		int CustomerList_AddingValue;
		int output = 0;
		
		// queue가 1 이라면 단순하게 모든 Array값을 더하면 되므로 예외처리.
		if (queue == 1)
		{
			for (int i=0; i<CustomerList.size(); i++)
				output += CustomerList.get(i);
			// debugging
			System.out.println(CustomerList.toString());
			System.out.println(output);
			return output;
		}
		
		// queue가 2 이상일 때는 queue만큼 배열 생성하여 CustomerList로부터 값을 불러오면 된다.
		else if (queue > 1)
		{
			// 1차적으로 queue가 비어있으면 customer를 무조건 배치.
			for (int i = 0; i < queue; i++)
			{
				if (CustomerList.size() <= i)
					break;
				output += CustomerList.get(i);
				makeArray[i] = CustomerList.get(i);
				CustomerList_Moved.add(makeArray[i]);
			}
			// customer 1차 배치 완료 후  남은 customer는 매번 가장 작은 value에 붙어서 마지막까지 값을 추가.
			for (int j = queue; j < CustomerList.size(); j++)
			{
				// 배치 완료된 customer 수(Moved_Min) 중 최소값 및 최소값의 index를 구하는 메소드.
				// for문 바깥에 아래 코드 두 줄을 배치하려면 set 명령어 대신 remove와 add를 반복적으로 해줘야 함.
				CustomerList_Moved_Min = Collections.min(CustomerList_Moved);
				CustomerList_Moved_Min_Index = CustomerList_Moved.indexOf(CustomerList_Moved_Min);
				// 배열 안 최솟값에 더해질 수(CustomerList_AddingValue)를 반복적으로 set. 
				CustomerList_AddingValue = CustomerList.get(j);
				CustomerList_Moved.set(CustomerList_Moved_Min_Index,
						CustomerList_Moved_Min + CustomerList_AddingValue);
			}
			output = Collections.max(CustomerList_Moved);
			// debugging
			System.out.println(CustomerList_Moved.toString());
			System.out.println(output);
			return output;
		}
		return 0;
	}
}
