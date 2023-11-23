package Calc;

abstract class OperationHandler implements Chain {
    private Chain next;

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }

    @Override
    public void calculate(float firstNum, float secondNum, String operation) {
        if (canHandle(operation)) {
            float result = performCalculation(firstNum, secondNum);
            System.out.println("Result: " + result);
        } else if (next != null) {
            next.calculate(firstNum, secondNum, operation);
        } else {
            System.out.println("Unsupported operation");
        }
    }

    protected abstract boolean canHandle(String operation);

    protected abstract float performCalculation(float firstNum, float secondNum);
}
