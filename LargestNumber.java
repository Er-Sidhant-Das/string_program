package net.exam.testpress;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {54, 546, 548, 60};
        String largest = largest(nums);
        System.out.println("Largest number: " + largest);
    }

    public static String largest(int[] nums) {
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrings, new NewNumber());

        StringBuilder sb = new StringBuilder();
        for (String numString : numStrings) {
            sb.append(numString);
        }

        return sb.toString();
    }

    static class NewNumber implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);         }
    }
}