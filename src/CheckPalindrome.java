public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 151;
        int originalNum = num;
        int reversedNum = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome");
        }
    }
}
