package ALGORITHMS.BIT_Magic_or_Manipulation;

public class generateGrayArray_Imp_Question {
    public static void main(String[] args) {

        //Given a number N, generate bit patterns from 0 to 2^N-1 such that successive patterns differ by one bit.
        //
        //Example 1:
        //Input:
        //N = 2
        //Output:
        //00 01 11 10
        //Explanation:
        //00 and 01 differ by one bit.
        //01 and 11 differ by one bit.
        //11 and 10 also differ by one bit.



        //Example 2:
        //Input:
        //N=3
        //Output:
        //000 001 011 010 110 111 101 100
        //Explanation:
        //000 and 001 differ by one bit.
        //001 and 011 differ by one bit.
        //011 and 010 differ by one bit.
        //Similarly, every successive pattern
        //differs by one bit.

        decimalToBinaryNumber(2,3);
        System.out.println();
        generateGrayArray(2);
        System.out.println();
        generateGrayArray(3);

    }
    // Function to generate
    // gray code
    static void generateGrayArray(int n) {
        int N = 1 << n;

        for (int i = 0; i < N; i++) {

            // generate gray code of
            // corresponding binary
            // number of integer i.
            int x = i ^ (i >> 1);

            // printing gray code
            decimalToBinaryNumber(x, n);

            System.out.print(" ");
        }
    }

    // Function to convert
    // decimal to binary
    static void decimalToBinaryNumber(int x, int n) {
        int[] binaryNumber = new int[x];
        int i = 0;
        while (x > 0) {
            binaryNumber[i] = x % 2;
            x = x / 2;
            i++;
        }

        // leftmost digits are
        // filled with 0
        for (int j = 0; j < n - i; j++)
            System.out.print('0');

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNumber[j]);
    }

}
