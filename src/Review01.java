
public class Review01 {

    public static void main(String[] args) {
        //○○の商品の税込価格は○○（消費税○○円）です。
       int review1 = 1300;
       int review2 = (int) sumMethod1(review1);
       int sumMethod1 = (int) (review1 * 0.1);


        System.out.println(review1 + "円の商品の税込価格は");
        System.out.println(review2 + review1 + ("円です。"));
        System.out.println("（消費税は）");
        System.out.println(sumMethod1 + "円");
    }

    public static double sumMethod1(int review1) {
        return (review1 * 0.1 );
        //int result = review1;
        //System.out.println(result + "method1");
        //return double (sumMethod1);
    }
}