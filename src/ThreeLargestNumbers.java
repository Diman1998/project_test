import java.util.Arrays;

public class ThreeLargestNumbers {
    public static double[] threeLargestNumbers(double[] array){
        double min = -Double.MAX_VALUE;
        double[] arrayMaxValue = new double[]{min, min, min};
        for (double value : array) {
            if (value > arrayMaxValue[0]) {
                if (value >= arrayMaxValue[1]) {
                    if (value >= arrayMaxValue[2]) {
                        arrayMaxValue[0] = arrayMaxValue[1];
                        arrayMaxValue[1] = arrayMaxValue[2];
                        arrayMaxValue[2] = value;
                    } else {
                        arrayMaxValue[0] = arrayMaxValue[1];
                        arrayMaxValue[1] = value;
                    }
                } else {
                    arrayMaxValue[0] = value;
                }
            }
        }
        return arrayMaxValue;

    }
    public static void main(String[] args) {
        double[] arrayMaxValue = threeLargestNumbers(new double[]{5,-4,1,1});
        System.out.println(Arrays.toString(arrayMaxValue));

    }
}
