package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips = "CURVY";
    private String drink = "COKE";

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
