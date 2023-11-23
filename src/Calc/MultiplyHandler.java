package Calc;

class MultiplyHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("multiply");
    }

    @Override
    protected float performCalculation(float firstNum, float secondNum) {
        return firstNum * secondNum;
    }
}
