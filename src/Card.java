public class Card {


    // Polje balance
    int balance;

    public Card(int initialBalance) {
        this.balance = initialBalance;
    }

    // Metod charge sa if
    public void charge(int amount) {
        if (balance >= amount) {
            // Ukoliko ima dovoljno sredstava, izvrši naplatu
            balance -= amount;
            System.out.println("Naplata kartice je uspešna. Novi saldo: " + balance);
        } else {
            // Ukoliko nema dovoljno sredstava, ispiši poruku o grešci
            System.out.println("Naplata kartice nije moguća. Nedovoljno sredstava na računu.");
        }
    }
}



