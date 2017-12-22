package ru.itpark;

import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader("names.txt");
        DataReader numbersReader = new DataReader("names.txt");
        List<String> names = new ArrayList<>();

        String word = reader.readString();
        int number = numbersReader.readInteger();
        String result = word + " " + number;
        names.add(result);

        while (number != 0) {
            word = reader.readString();
            number = numbersReader.readInteger();
            result = word + " " + number;
            if (number != 0)
                names.add(result);
        }
        System.out.println(names);

        names.stream()
                .map((elements) -> elements.replaceAll("\\D", ""))
                .forEach(System.out::println);

        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            String input = names.get(i).replaceAll("\\D", "");
            if (hashMap.get(input) != null) {
                Integer count = hashMap.get(input) + 1;
                hashMap.put(input, count);
            } else {
                hashMap.put(input, 1);
            }
        }
        int max = Collections.max(hashMap.values());

        for (String key : hashMap.keySet()) {
            if (hashMap.get(key).equals(max)) {
                result = key;
            }
        }
        System.out.println( result + " years is most common age in the file ");
    }
}



