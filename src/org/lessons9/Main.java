package org.lessons9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(123);
        list.add("List");
        list.add(true);
        System.out.println(list);

        //Принимает только строковое значение
        List<String> onlyStrings = new ArrayList<>();
        onlyStrings.add("STRING1");
        onlyStrings.add("String2");
        System.out.println(onlyStrings);

        //Linked and ArrayList// В эрэй листе согласоно инжесу по которому добавяли,
        // а в линкедлисте храняться сслыки на следющий и предыдущий элемент
        List<Integer> intArray = new ArrayList<>();
        List<Integer> intLinked = new LinkedList<>();







    }
}
