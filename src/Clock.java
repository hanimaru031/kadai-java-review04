
public class Clock {

    public static void main(String[] args) {

     int seconds = getseconds(16,27,30);
     System.out.println(seconds);
}

    public static int getseconds(int h, int m, int s) {
        int result =  h * 3600 + m * 60 + s;
        return result;
    }
    }