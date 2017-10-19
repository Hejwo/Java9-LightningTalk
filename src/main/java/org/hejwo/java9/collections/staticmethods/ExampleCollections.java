package org.hejwo.java9.collections.staticmethods;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ExampleCollections {

    public static void main(String[] args) {

//        String _ = "not valid";
        String __ = "valid";
        String STILL_OK = "valid";


//        System.out.println(_ + __ + STILL_OK);


        // Immutable collection !!!
        List<Integer> list = List.of(1, 2, 3, 4);

        String str = "Hello !!!";
        Integer stringLength = Optional.ofNullable(str)
            .map(String::length).orElse(0);
        System.out.println(stringLength);
    }


}
