public class Div5 {

    public static int div5(int num) {
        return num / 5;
    }

    public static void calculate(int num1, int num2, int num3) {
        System.out.println(div5(num1) + " " + div5(num2) + " " + div5(num3));
    }

    public static void main(String[] args) {
        calculate(24, 17, 177);
    }
}
