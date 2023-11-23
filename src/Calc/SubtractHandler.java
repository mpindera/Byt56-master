package Calc;

class SubtractHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("subtract");
    }

    @Override
    protected float performCalculation(float firstNum, float secondNum) {
        return firstNum - secondNum;
    }
}
