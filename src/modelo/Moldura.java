package modelo;

public class Moldura {

	private Retangulo retanguloInterno;
	private Retangulo retanguloExterno;

	public Moldura() {}

	public Moldura(Retangulo retanguloInterno, Retangulo retanguloExterno) {
		this.retanguloInterno = retanguloInterno;
		this.retanguloExterno = retanguloExterno;
	}

	public Retangulo getRetanguloInterno(){
		return retanguloInterno;
	}

	public void setRetanguloInterno(Retangulo retanguloInterno) {
		this.retanguloInterno = retanguloInterno;
	}

	public Retangulo getRetanguloExterno() {
		return retanguloExterno;
	}

	public void setRetanguloExterno(Retangulo retanguloExterno ) {
		this.retanguloExterno = retanguloExterno;
	}

	public float calcularAreaMoldura() {
		return this.retanguloExterno.calcularArea() - this.retanguloInterno.calcularArea();
	}
}