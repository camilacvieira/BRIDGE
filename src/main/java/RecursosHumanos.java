public class RecursosHumanos extends Cargo {

    public RecursosHumanos(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
