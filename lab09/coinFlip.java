import java.util.Scanner;
import java.util.Random;

public class coinFlip{
    public static int flip(int a){
        Random rand = new Random();
        int tailSum = 0;
        int headSum = 0;
        for(int i=1; i<=a; i++){
            int random = rand.nextInt(2);
            if(random == 0){
                tailSum++;
            }else if(random == 1){
                headSum++;
            }
            
        }
        System.out.println("The amount of tails was " + tailSum + ".");
        System.out.println("The amount of heads was " + headSum + ".");
        return 1;
    }
     public static void flip2(){
         Random rand = new Random();
         int random = rand.nextInt(2);
         if(random == 0){
                System.out.println("Tail " + random + ".");
            }else if(random == 1){
                System.out.println("Head " + random + ".");
            }
         
       
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int z = 1;
        int k = 1;
        while(z == k){
        System.out.println("Enter a number between 0 and 100");
        int q = scan.nextInt();
        if(q == 0){
            flip2();
        }else if(q > 100){
            System.exit(-1);
        }else{
            flip(q);
        }
        }
    }
}
