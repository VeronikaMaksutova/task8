package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();
        hashMap.put("Кот", new Cat("Барсик"));
hashMap.put("Собака", new Dog("Шарик"));
hashMap.put("Сова", new Owl("Филин"));
// Получаем набор элементов
Set<Map.Entry<String, Pet>> set = hashMap.entrySet();
// Отобразим набор
for (Map.Entry<String, Pet> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        //добавляем значение
        hashMap.put("Кот", new Cat("Кузя"));
        System.out.println("Теперь кот стал " + hashMap.get("Кот"));

}
}