public class numberFactorial {
    public static void numberFactorial(int Number) {
        int newNumber = Number;
        for (int i = 1; i < Number; i++) {
            newNumber = newNumber * (Number - i);
        }
        System.out.println(newNumber);
    }
}
