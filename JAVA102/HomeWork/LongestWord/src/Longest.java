public class Longest {


    public String run(String[] arr) {
        int word = 0;
        String value = "";
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++)
            {
                count++;
            }
            if (count > word)
            {
             word = count;
             value = arr[i];
            }
        }
        return value;
    }
}
