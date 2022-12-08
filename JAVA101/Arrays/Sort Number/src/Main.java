import java.util.Arrays;
import java.util.Scanner;
public class Main {
 /*   static void sort(int[] arr) {
        int[] sorts = new int[arr.length];
        int index= 0;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            sorts[index++] = arr[i];
            for (int j = i+1; j < arr.length-1 ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = sorts[i];
                    sorts[i] = sorts[j];
                   sorts[j] = temp ;
                }
            } ### Sort metodunu kendim yazmaya çalıştım ama olmadı yardımcı olabilcek biri varsa çok mutlu olurum
        }System.out.println(Arrays.toString(sorts));
    } */

        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("The range of the array: ");
            int array = input.nextInt();
            int[] list = new int[array];
            int index = 0;
            for (int i = 0; i < array; i++) {
                System.out.print((i + 1) + ". eleman: ");
                int number = input.nextInt();
                list[index++] = number;
            }
            Arrays.sort(list);
            System.out.println("the sorted list: "+ Arrays.toString(list));
        }
    }

