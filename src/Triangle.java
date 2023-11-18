public class Triangle {

    public static void main(String[] args) {
        // 代入する数値は自由に変更してください
        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && a == c && b == c) {
            System.out.println("三角形は正三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("三角形は二等辺三角形");
        } else {
            System.out.println("三角形は不等辺三角形");
        }
    }
}
