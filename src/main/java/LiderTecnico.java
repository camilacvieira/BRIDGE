public class LiderTecnico extends Cargo {

    public LiderTecnico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.habilidade.percentualAumento());
    }

}
