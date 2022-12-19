import java.util.*;
import java.io.*;

class Main {
    public static void main (String[] args) {
        String toBeCapped = "i want this sentence capitalized";
        String[] tokens = toBeCapped.split("\\s");
        toBeCapped = "";

        for(int i = 0; i < tokens.length; i++){
            char capLetter = Character.toUpperCase(tokens[i].charAt(0));
            toBeCapped +=  " " + capLetter + tokens[i].substring(1);
        }
        toBeCapped = toBeCapped.trim();
        System.out.println(toBeCapped);
    }
}