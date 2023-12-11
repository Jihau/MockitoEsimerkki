import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HinnoittelijaTest {

    @Test
    public void testaaAlennusProsentti() {
        float alkuSaldo = 100.0f;
        float listaHinta = 30.0f;
        float alennus = 15.0f; // Alennusprosentti on kovakoodattu
        float odotettuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));
        Asiakas asiakas = new Asiakas(alkuSaldo);
        Tuote tuote = new Tuote("TDD in Action", listaHinta);
        IHinnoittelija hinnoittelija = new KovakoodattuHinnoittelija();

        // Toiminta
        TilaustenKäsittely käsittelijä = new TilaustenKäsittely();
        käsittelijä.setHinnoittelija(hinnoittelija);
        käsittelijä.käsittele(new Tilaus(asiakas, tuote));

        // Väite
        assertEquals(odotettuSaldo, asiakas.getSaldo(), 0.001);
    }
}
