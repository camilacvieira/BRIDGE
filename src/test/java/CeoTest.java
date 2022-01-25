
import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class CeoTest {


    @Test
    void deveRetornarSalarioCeoJunior() {
        Habilidade habilidade = new Junior();
        Ceo ceo = new Ceo(50.0f);
        ceo.setHabilidade(habilidade);
        ceo.setNumFuncionarios(2);
        assertEquals(100.0f, ceo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCeoPleno() {
        Habilidade habilidade = new Pleno();
        Ceo ceo = new Ceo(50.0f);
        ceo.setHabilidade(habilidade);
        ceo.setNumFuncionarios(2);
        assertEquals(110.0f, ceo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCeoSenior() {
        Habilidade habilidade = new Senior();
        Ceo ceo = new Ceo(50.0f);
        ceo.setHabilidade(habilidade);
        ceo.setNumFuncionarios(2);
        assertEquals(140.0f, ceo.calcularSalario(), 0.01f);
    }

}