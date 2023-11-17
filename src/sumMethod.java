
public class sumMethod {

    public static void main(String[] args) {
        // ;;
        int num1 = 100;
        int num2 = 10;
        int result;
        int result2;
        //int result3;

        result = sumMethod2(num1, num2);
        System.out.println("num1 + num2 = " + result);
        //System.out.println(result + "method2");
        
        result2 = sumMethod2(99, 999);
        System.out.println("99 + 999 = " + result2);

    }
    
    public static int sumMethod2(int a, int b) {
        int r = a + b;
        return r;
    }

}

