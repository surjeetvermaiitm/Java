package com.kunal.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal Kushwaha");
//        Human twin = new Human(kunal);

        Human twin = (Human)kunal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(MyArray.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(MyArray.toString(twin.arr));
        System.out.println(MyArray.toString(kunal.arr));
    }
}
