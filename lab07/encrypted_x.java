import java.util.Scanner;
public class encrypted_x
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How big?");
        int size = scan.nextInt();
        
        if(size > 0 && size < 100)
        {
            for(int i = 0; i < size + 1; i++)
            {
                for(int j = 0; j < size + 1; j++)
                {
                    if(i == j || j == size - i){
                    System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                    
                }
                System.out.println("");
            }
        
        }
        
        else
        {
            System.exit(-1);
        }
    }
}
