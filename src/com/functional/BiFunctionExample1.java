package com.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiFunctionExample1 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);

        BiConsumer<List<Integer>, List<Integer>> biConsumer = (lista, listb) -> {
          if (lista.size() != listb.size()){
              System.out.println("List size does not match");
          }else {
              for (int i = 0; i< lista.size(); i++){
                  if (lista.get(i) != listb.get(i)){
                      System.out.println("False");
                      return;
                  }
              }
              System.out.println("true");
          }
        };
       // biConsumer.accept(list1,list2);

        System.out.println("********");
        BiConsumer<List<Integer>, List<Integer>> display = (lista, listb)  -> {
          lista.stream().forEach(a -> System.out.print(a+" "));
          System.out.println();
          listb.stream().forEach(a -> System.out.print(a+" "));
          System.out.println();
        };
        try {
            display.andThen(biConsumer).accept(list1,list2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
