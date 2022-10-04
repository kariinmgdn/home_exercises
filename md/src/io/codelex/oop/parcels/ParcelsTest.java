package io.codelex.oop.parcels;

public class ParcelsTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(20,20,20, 20, false);
        System.out.println(parcel1.validate());
        Parcel parcel2 = new Parcel(20,20,20, 35, false);
        System.out.println(parcel2.validate());
        Parcel parcel3 = new Parcel(20,40,20, 20, false);
        System.out.println(parcel3.validate());
        Parcel parcel4 = new Parcel(20,20,20, 10, true);
        System.out.println(parcel4.validate());
    }
}
