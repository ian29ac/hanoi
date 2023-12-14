import org.example.Hanoi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HanoiTeste {

    @Test
    public void testCalcularMovimentos() {
        Hanoi torreHanoi = new Hanoi();

        // Teste para alguns casos de discos conhecidos
        Assertions.assertEquals(1, torreHanoi.calcularMovimentos(1));
        Assertions.assertEquals(3, torreHanoi.calcularMovimentos(2));
        Assertions.assertEquals(7, torreHanoi.calcularMovimentos(3));
        // Adicione mais casos de teste conforme necessário
        Assertions.assertEquals(15, torreHanoi.calcularMovimentos(4));
        Assertions.assertEquals(31, torreHanoi.calcularMovimentos(5));
        Assertions.assertEquals(7, torreHanoi.calcularMovimentos(4));
    }
}

