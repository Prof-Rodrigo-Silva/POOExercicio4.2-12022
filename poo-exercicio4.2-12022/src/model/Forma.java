package model;

public abstract class Forma {
	
	protected float area;
	protected float perimetro;
	
	public Forma() {}
	
	public abstract float calcArea();
	public abstract float calcPerimetro();

}
