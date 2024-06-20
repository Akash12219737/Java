public class BitManipulation {

    public static void main(String[] args) {
        int a = 0b1101; // 13 in binary
        int b = 0b1011; // 11 in binary

        // Bitwise AND
        int andResult = a & b; // result is 0b1001 (9 in decimal)
        System.out.println("Bitwise AND result: " + andResult);

        // Bitwise OR
        int orResult = a | b; // result is 0b1111 (15 in decimal)
        System.out.println("Bitwise OR result: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // result is 0b0110 (6 in decimal)
        System.out.println("Bitwise XOR result: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // result is 0b...11110010 (-14 in decimal, considering 32-bit signed integer)
        System.out.println("Bitwise NOT result: " + notResult);

        // Left Shift
        int leftShiftResult = a << 2; // result is 0b110100 (52 in decimal)
        System.out.println("Left Shift result: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 2; // result is 0b11 (3 in decimal)
        System.out.println("Right Shift result: " + rightShiftResult);

        // Unsigned Right Shift
        int unsignedRightShiftResult = a >>> 2; // result is 0b11 (3 in decimal)
        System.out.println("Unsigned Right Shift result: " + unsignedRightShiftResult);

        // Check if a bit is set (e.g., checking if the 3rd bit is set in `a`)
        boolean isBitSet = (a & (1 << 2)) != 0;
        System.out.println("Is 3rd bit set in 'a': " + isBitSet);

        // Set a bit (e.g., setting the 1st bit in `a`)
        int setBitResult = a | (1 << 1);
        System.out.println("Result after setting 1st bit in 'a': " + setBitResult);

        // Clear a bit (e.g., clearing the 3rd bit in `a`)
        int clearBitResult = a & ~(1 << 2);
        System.out.println("Result after clearing 3rd bit in 'a': " + clearBitResult);

        // Toggle a bit (e.g., toggling the 1st bit in `a`)
        int toggleBitResult = a ^ (1 << 1);
        System.out.println("Result after toggling 1st bit in 'a': " + toggleBitResult);

        // Counting set bits (Hamming weight)
        int countSetBits = countBits(a);
        System.out.println("Number of set bits in 'a': " + countSetBits);
    }

    // Helper method to count set bits (Hamming weight)
    public static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
