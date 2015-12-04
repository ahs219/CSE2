import java.util.Arrays;
public class sortingArrays{
    public void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(array);
    }
    
    
    public static void main(String[] args){
        int arraySize = 20;
        int[] array1;
        array1 = new int[arraySize];
        int arraySize3 = 30;
        int[] array3;
        array3 = new int[arraySize3];
        int arraySize2 = 10;
        int[] array2;
        array2 = new int[arraySize2];
        for(int i = 0; i<arraySize; i++){
            array1[i] = (int)(Math.random()*100);
            array3[i] = array1[i];
            //System.out.println("Array at "+i+" = " + array1[i]);
        }
        Arrays.sort(array3);
        for(int i = 0; i<arraySize2; i++){
            array2[i] = (int)(Math.random()*100);
            array3[i] = array2[i];
            //System.out.println("Array at "+i+" = " + array1[i]);
        }
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
        
    }
}
