package net.exam.testpress;

public class OrderOfOccurance {
    public static void main(String[] args) {
        String s = "aabbbcccd";
        char[] c = s.toCharArray();
        int i = 0, count;
        char ch;
        String temp="";

        while (i < c.length)
        {
            ch=c[i];
            count=1;
            while(i<c.length-1 && c[i+1]==ch)
            {
                count++;
                i++;
            }
            temp=temp+count+ch;
            i++;
        }
        System.out.println("after getting the occurance "+temp);


    }
}
