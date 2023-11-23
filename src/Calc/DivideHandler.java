package Calc;

class DivideHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("divide");
    }

    @Override
    protected float performCalculation(float firstNum, float secondNum) {
        if (secondNum != 0) {
            return firstNum / secondNum;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
