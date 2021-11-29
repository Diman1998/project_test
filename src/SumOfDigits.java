public class SumOfDigits {
    public static long sumOfDigits(long number) {
        if (number == 0){
            return 0;
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(922545454));
    }
}
