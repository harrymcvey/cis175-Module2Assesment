package model;

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }
    
    // Getter method for dollars
    public int getDollars() {
        return dollars;
    }

    // Getter method for cents
    public int getCents() {
        return cents;
    }

    // Method to add two Money objects
    public Money add(Money other) {
        int newDollars = this.dollars + other.dollars;
        int newCents = this.cents + other.cents;
        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents %= 100;
        }
        return new Money(newDollars, newCents);
    }

    // Method to subtract two Money objects
    public Money subtract(Money other) {
        int newDollars = this.dollars - other.dollars;
        int newCents = this.cents - other.cents;
        if (newCents < 0) {
            newDollars--;
            newCents += 100;
        }
        return new Money(newDollars, newCents);
    }

    // Method to compare Money objects for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money other = (Money) obj;
        return dollars == other.dollars && cents == other.cents;
    }
}
