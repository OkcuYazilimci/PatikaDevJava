public class ArraysHelp {
      void meanArray(int[] l1){
        double sum = 0;
        for(int i = 0; i < l1.length;i++){
            sum += l1[i];
        }
        System.out.println("the  sum of the list is: " + sum);
        System.out.println("The mean of the list is: " + (sum/l1.length));
      }
}
