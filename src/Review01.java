
public class Review01 {

    public static void main(String[] args) {
        //○○の商品の税込価格は○○（消費税○○円）です。
       int review1 = 1300;
       int tax = tax(review1);
       int review2 = review1 + tax;

        System.out.println(review1 + "円の商品の税込価格は" + review2 + "円 （消費税は" + tax + "円です）") ;
    }

    public static int tax(int review1) {
        return (int) ((double) review1 * 0.1) ;

    }
}