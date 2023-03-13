public class Polindrom {

    void isPolindrom (String a)
    {
        char ch;
        String nstr = "";
        for (int i = 0; i < a.length(); i++)
        {
           ch = a.charAt(i);
           nstr = ch + nstr;
        }
        if (a.equals(nstr))
        {
            System.out.println(" this is a polindrom number");
        }
        else
            System.out.println(" this is not a polindrom number");
    }
}
