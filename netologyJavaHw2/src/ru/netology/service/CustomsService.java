package ru.netology.service;

public class CustomsService {
    public static int calculateCustoms(int price, int weight){
        price = price / 100;
        weight = weight * 100;
        int tollage = price + weight;
        return tollage;
    }
}
