public class Ceo extends Cargo {

    private int numFuncionarios;

    public Ceo(float salarioBase) {
        super(salarioBase);
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numFuncionarios * (1 + this.habilidade.percentualAumento());
    }
}