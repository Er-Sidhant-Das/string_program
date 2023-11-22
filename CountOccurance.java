package net.exam.testpress;

public class CountOccurance {
    public static void main(String[] args) {
        String s="aabbbcccdd";

        while(s.length()>0)
        {
            char c=s.charAt(0);
            String s1=s.replace(c+"","");
            int len=s.length()-s1.length();
            System.out.println(c+" "+len);
            s=s1;
        }
    }
}
