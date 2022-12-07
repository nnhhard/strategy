package ru.iashinme.service;

public interface Strategy {
    void save(String message);
    int getType();
}
