public class KovakoodattuHinnoittelija implements IHinnoittelija {

    @Override
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return 15.0f;
    }

    @Override
    public void setAlennusProsentti(Asiakas asiakas, float v) {

    }

    @Override
    public void lopeta() {

    }

    @Override
    public void aloita() {

    }
}
