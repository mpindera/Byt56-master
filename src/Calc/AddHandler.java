package Calc;

class AddHandler extends OperationHandler {
    @Override
    protected boolean canHandle(String operation) {
        return operation.equals("add");
    }

    @Override
    protected float performCalculation(float firstNum, float secondNum) {
        return firstNum + secondNum;
    }
}