package modelo;

public class Retangulo {
	
	private float base;
	private float altura;
	
	public Retangulo() {}
	
	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public float getBase() {
		return this.base;
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public float calcularArea() {
		return this.base * this.altura;
	}
	
}
