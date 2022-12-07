package ru.iashinme.service;

public class StrategyDefaultImpl implements Strategy {
    @Override
    public void save(String message) {
        System.out.println("Strategy Default print: " + message);
    }

    @Override
    public int getType() {
        return 0;
    }
}
