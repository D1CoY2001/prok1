package org.example;

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_676;
        int rublesPerMile = 20;

        int bonusMiles = ticketPrice / rublesPerMile;

        System.out.println(bonusMiles);
    }
}