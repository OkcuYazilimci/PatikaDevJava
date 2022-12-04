public class ArraysHelp {
      void meanArray(double[] l1){
        double sum = 0;
        for(int i = 0; i < l1.length;i++){
            sum += l1[i];
        }
          System.out.println("the number of the elements in the list is: " + l1.length);
          System.out.println("the sum of the list is: " + sum);
          System.out.println("The mean of the list is: " + (sum/l1.length));
          System.out.println("---------------------");
      }

      void HarmonicMean(double[] l2){
          double harmonicSeries = 0.0;
          for (int i = 0; i < l2.length; i++) {
              harmonicSeries += (1 / l2[i]);
          }
          System.out.println("the sum of harmonic series is: " + harmonicSeries);
          System.out.println("the sum of harmonic mean is: " + (l2.length/harmonicSeries));
      }
}
