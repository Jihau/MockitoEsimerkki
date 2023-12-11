
public interface IHinnoittelija {

	float getAlennusProsentti(Asiakas asiakas, Tuote tuote);

	void setAlennusProsentti(Asiakas asiakas, float alennusProsentti);

	void lopeta();

	void aloita();
}
