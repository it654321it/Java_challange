package com.alex.jdeveloper;

public class SomeOperation implements OperationInterface {
    @Override
    public int calcOperation(int a, int b) {
        return a + b;
    }
}