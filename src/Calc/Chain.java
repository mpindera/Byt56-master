package Calc;

interface Chain {
    void setNext(Chain next);

    void calculate(float firstNum, float secondNum, String operation);
}