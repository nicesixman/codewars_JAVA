package codewars_6Kyu_TheSupermarketQueue;

import java.io.IOException;
import java.util.Scanner;

public class TheSupermarketQueue {
	public static void main(String[] args) throws IOException {
		// Try Sample Test #1
		int customer[] = new int[3];
		int queue;
		
		// 배열 입력.
		System.out.println("customer 수를 하나씩 입력하세요.");
		Scanner customerInput = new Scanner(System.in);
		for (int i=0; i<3; i++)
			customer[i] = customerInput.nextInt();
		
		// queue 개수 입력.
		System.out.println("몇 개의 queue가 있는지 입력하세요.");
		Scanner queueInput = new Scanner(System.in);
		queue = queueInput.nextInt();
		
		queueInput.close();
		customerInput.close();
		
		// debugging
		for (int i=0; i<3; i++)
			System.out.println(customer[i]);
		System.out.println(queue);
	}
}
