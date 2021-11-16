 

public abstract class BasicCalculator implements Calculation {

    double value1;
    double value2;

    BasicCalculator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public abstract double add();

    @Override
    public abstract double subtract();

    @Override
    public abstract double multiply();

    @Override
    public abstract double divide();
}
 