package calc;

public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation operation){
        if(operation == Operation.ADD){
            System.out.println(a + b);
        }else if (operation== Operation.SUBTRACT){
            System.out.println(a - b);
        }else if (operation == Operation.MULTIPLY){
            System.out.println(a * b);
        }else{
            System.out.println("Неизвестная команда");
        }
    }
}
