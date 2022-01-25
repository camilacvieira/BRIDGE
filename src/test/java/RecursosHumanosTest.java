import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursosHumanosTest {

    @Test
    void deveRetornarSalarioRecursosHumanosComJunior() {
        Habilidade habilidade = new Junior();
        RecursosHumanos rh = new RecursosHumanos(1000.0f);
        rh.setHabilidade(habilidade);
        assertEquals(1000.0f, rh.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRecursosHumanosComPleno() {
        Habilidade habilidade = new Pleno();
        RecursosHumanos rh = new RecursosHumanos(1000.0f);
        rh.setHabilidade(habilidade);
        assertEquals(1000.0f, rh.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRecursosHumanosComSenior() {
        Habilidade habilidade = new Senior();
        RecursosHumanos rh = new RecursosHumanos(1000.0f);
        rh.setHabilidade(habilidade);
        assertEquals(1000.0f, rh.calcularSalario(), 0.01f);
    }

}