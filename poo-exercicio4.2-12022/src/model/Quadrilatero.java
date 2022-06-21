package model;

public abstract class Quadrilatero extends Forma{

	protected float base;
	protected float altura;
	
	public Quadrilatero() {
		super();
	}
	public Quadrilatero(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float calcArea() {
		return area = base * altura;
	}
	
	@Override
	public float calcPerimetro() {
		return perimetro = 2 * (base + altura);
	}
	
	
}
