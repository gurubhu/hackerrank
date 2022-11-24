package hackerrank;

import java.util.Scanner;

public class FlippingBits {
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        long number;
        long unsignedNumber;
        
        for (int i = 0; i < testCases; i++) {
            number = input.nextLong();
            number = ~number;
            System.out.println(number);
            unsignedNumber = number & 0xffffffffL;
            System.out.println(unsignedNumber);
        }
        
    }
}
