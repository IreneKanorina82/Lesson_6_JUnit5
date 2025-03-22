public class counterNumbers {
    //арифметическое действие с двумя целыми числами (сложение, вычитание, деление и умножение):
    public static void counterNumberss(int a, int b, String sign) {
        switch (sign) {
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "+":
                System.out.println(a + b);
                break;
        }
    }
}
