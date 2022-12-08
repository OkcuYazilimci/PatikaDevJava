import java.util.Arrays;

public class Main {
    static boolean isDup (int[] arr, int x){
        for( int i : arr){
            if ( i == x ) {
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] list = {1,1,1,3,4,4,9,9,5,6,6,6};
        int[] duplicate = new int[list.length];
        int indexs = 0;
        for(int i = 0; i < list.length ;  i++){
            for(int j = 0; j <list.length ; j++){
                if((i!=j) && (list[i] == list[j])){
                    if(list[i] % 2 == 0){
                    if(!isDup(duplicate, list[i])) {duplicate[indexs++] = list[i];
                    }}
                    break;
                }
            }
        }
    System.out.println(Arrays.toString(duplicate));
    for(int value : duplicate)  {
        if (value != 0) {
        System.out.println(" Even numbers that duplicates is: "+ value);}
       }
    }
}