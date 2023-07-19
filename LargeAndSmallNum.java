package net.exam.testpress;

public class LargeAndSmallNum {
	public static void main(String[] args) {
	        int[] array = {54, 546, 548, 60};

	        int min = array[0];  
	        int max = array[0];  

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];  
	            }
	            if (array[i] > max) {
	                max = array[i];  
	            }
	        }

	        System.out.println("Maximum element: " + max);
	        System.out.println("Minimum element: " + min);
	    }
	}

