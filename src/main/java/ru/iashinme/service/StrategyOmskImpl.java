package ru.iashinme.service;
import org.springframework.stereotype.Component;

@Component
public class StrategyOmskImpl implements Strategy {
    @Override
    public void save(String message) {
        System.out.println("Strategy Omsk print: " + message);
    }

    @Override
    public int getType() {
        return 55;
    }
}