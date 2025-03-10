public class CalculatorClass {
    public static void main(String[] args) {
        CalculatorClass a = new CalculatorClass();
        System.out.println(a.add(2,3));
        CalculatorClass b = new CalculatorClass();
        System.out.println(b.multiply(3,4));
        CalculatorClass c = new CalculatorClass();
        System.out.println(c.divide(3,4));
        CalculatorClass d = new CalculatorClass();
        System.out.println(d.subtract(3,4));



    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int subtract(int a, int b){
        return a - b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
