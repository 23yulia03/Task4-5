package com.example.task45;

// Интерфейс для коллекции (агрегата)
public interface Aggregate {
    Iterator getIterator();  // Метод для получения итератора
    int getImageCount();  // Метод для получения количества изображений
}
