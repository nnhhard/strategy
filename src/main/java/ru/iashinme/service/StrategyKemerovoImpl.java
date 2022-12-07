package ru.iashinme.service;
import org.springframework.stereotype.Component;

@Component
public class StrategyKemerovoImpl implements Strategy {
    @Override
    public void save(String message) {
        System.out.println("Strategy Kemerovo print: " + message);
    }

    @Override
    public int getType() {
        return 42;
    }
}
