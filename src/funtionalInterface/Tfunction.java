package funtionalInterface;

import java.util.function.Function;

public class Tfunction {

 static  Function<Integer,Integer> incrementByOneFunction = number ->
         number * 54 - 17;

    public static void main(String[] args) {


        System.out.println(incrementByOneFunction.apply(4));

    }

}
