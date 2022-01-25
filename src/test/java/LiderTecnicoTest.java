import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiderTecnicoTest {

    @Test
    void deveRetornarSalarioLiderJunior() {
        Habilidade habilidade = new Junior();
        LiderTecnico lt = new LiderTecnico(2000.0f);
        lt.setHabilidade(habilidade);
        assertEquals(2000.0f, lt.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLiderPleno() {
        Habilidade habilidade = new Pleno();
        LiderTecnico lt = new LiderTecnico(2000.0f);
        lt.setHabilidade(habilidade);
        assertEquals(2200.0f, lt.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioLiderSenior() {
        Habilidade habilidade = new Senior();
        LiderTecnico lt = new LiderTecnico(1000.0f);
        lt.setHabilidade(habilidade);
        assertEquals(1400.0f, lt.calcularSalario(), 0.01f);
    }

}