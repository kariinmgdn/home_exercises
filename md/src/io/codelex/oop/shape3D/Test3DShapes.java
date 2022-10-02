package io.codelex.oop.shape3D;

public class Test3DShapes {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Cone cone = new Cone(4,5);

        System.out.println(cube);
        System.out.println(cone);
    }
}
