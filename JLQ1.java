/*JLQ1. JAF, JEF, JIF, JOF, ? , KAG, KEG, ?, ?, ?....., LUH
        a. Print the above series completely for the letter starting from 'J' to 'L'
        explanation: The middle letters which are vowels have an increasing trend of A, E, I, O,U
        b. Now for the above series print the output should be 17, 21, ....
        explanation: (10+1+6), (10+5+6),*/
package JAVA_LOGICAL;
import java.util.Scanner;
public class JLQ1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter the firstletter");
       char first_letter=scan.next().charAt(0);
       System.out.println("Enter the lastletter");
       char lastletter=scan.next().charAt(0);
       char[]vowels={'A','E','I','O','U'};
       int sum=0;
       for(int j=first_letter;j<=lastletter;j++)
       {
           int last2=(int)first_letter-4;
           char last3=(char)last2;
           for(int i=0;i<=vowels.length-1;i++)
           {
               System.out.print("" + first_letter + "" + vowels[i] + "" + last3 + " ");
           }
           System.out.println();
           first_letter++;
       }

    }
}

