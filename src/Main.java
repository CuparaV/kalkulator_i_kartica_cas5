public class Main {
    public static void main(String[] args) {

//       Primer za zadatka za  kreditnu karticu

        Card card = new Card(100);
        // Pokušaj da se naplati iznos koji je u okviru raspoloživog stanja na karticu
        card.charge(50);

        // Pokušaj naplate iznosa koji je veći od raspoloživog stanja na kartici
        card.charge(250); // Naplata nije moguća, nedovoljno sredstava

//       Primer zadatka za kalkulator
        Calculator calc = new Calculator(10, 5);

        // Ispisi rezultate osnovnih operacija
        // Koristi različite metode kalkulatora
        System.out.println("Zbir: " + calc.add());
        System.out.println("Razlika: " + calc.sub());
        System.out.println("Proizvod: " + calc.mul());
        System.out.println("Količnik: " + calc.div());


    }
}
