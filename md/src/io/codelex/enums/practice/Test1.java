package io.codelex.enums.practice;

public class Test1 {
    public static void main(String[] args) {
        directions(Exercise1.NORTH);
        directions(Exercise1.SOUTH);
        directions(Exercise1.EAST);
        directions(Exercise1.WEST);
    }

    private static void directions(Exercise1 dir) {
        switch (dir) {
            case EAST -> System.out.println(Exercise1.EAST);
            case WEST -> System.out.println(Exercise1.WEST);
            case NORTH -> System.out.println(Exercise1.NORTH);
            case SOUTH -> System.out.println(Exercise1.SOUTH);
        }
    }
}
