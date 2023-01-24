/*JLQ3: Find out how many "CJSS" words can be formed  with the letter from the given
        input 1    : CATS ARE SO BEAUTIFUL. I AM JOYFUL.
        Output 1 : 1
        input 2    : HEY CHOLE, CJSS IS AWESOME. JAUNTY TO BE PART OF IT.
        Output 2 : 2*/
package JAVA_LOGICAL;
import java.util.Scanner;
public class JLQ3
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=scan.nextLine();
        char []ch=s.toCharArray();
        int countc=0;
        int countj=0;
        int counts=0;
        for(int i=0;i<=ch.length-1;i++)
        {
            if (ch[i] == 'c')
            {
                countc++;
            }
            else if (ch[i] == 'j')
            {
                countj++;
            }
            else if (ch[i] == 's')
            {
                counts++;
            }
        }
        int divide=counts/2;
        if(countc<countj && countc<divide)
        {
            System.out.println("Words can be formed with this sentence is: "+countc);
        }
        else if (countj<countc&&countj<divide)
        {
            System.out.println("Words can be formed with this sentence is: "+countj);
        }
        else
        {
            System.out.println("Words can be formed with this sentence is: "+divide);
        }
    }
}