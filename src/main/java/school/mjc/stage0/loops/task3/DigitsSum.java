package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numberStr = number + "";
        
        int sum = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += digit;
        }

        System.out.println(sum);
    }
}
