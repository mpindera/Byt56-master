package Calc;

public class Calculator {
    private Chain handlerChain;

    public Calculator() {
        handlerChain = new AddHandler();
        Chain subtractHandler = new SubtractHandler();
        Chain multiplyHandler = new MultiplyHandler();
        Chain divideHandler = new DivideHandler();

        handlerChain.setNext(subtractHandler);
        subtractHandler.setNext(multiplyHandler);
        multiplyHandler.setNext(divideHandler);
    }

    public void performOperation(float firstNum, float secondNum, String operation) {
        handlerChain.calculate(firstNum, secondNum, operation);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.performOperation(1, 0, "add");
        calculator.performOperation(3, 1, "subtract");
        calculator.performOperation(9, 3, "divide");
        calculator.performOperation(2, 2, "multiply");
    }
}