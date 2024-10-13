public class Calculator {
    // Polja za dva operanda
    private double operand1;
    private double operand2;

    // Konstruktor koji prima dva operanda
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Metod za sabiranje dva broja
    public double add() {
        return operand1 + operand2;
    }

    // Metod za oduzimanje dva broja
    public double sub() {
        return operand1 - operand2;
}

    // Metod za množenje dva broja
    public double mul() {
        return operand1 * operand2;
    }

    // Metod za deljenje dva broja
    public double div() {
        return operand1 / operand2;
        }
    }



