package ru.iashinme.service;
import org.springframework.stereotype.Component;

@Component
public class StrategyKrasnodarImpl implements Strategy {
    @Override
    public void save(String message) {
        System.out.println("Strategy Krasnodar print: " + message);
    }

    @Override
    public int getType() {
        return 23;
    }
}
