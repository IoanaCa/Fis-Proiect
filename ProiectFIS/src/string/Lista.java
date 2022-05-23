package string;

import java.util.List;

class Persoana{
	String nume;
	int varsta;
	public Persoana(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		return nume + " " + varsta ;
	}
	
	
}

public class Lista {
	
	public int listInteger(List<Integer> nums, int poz) {
		return nums.get(poz);
	}
	
	public double listDouble(List<Double> nums, int poz) {
		return nums.get(poz);
	}
	
	public String listString(List<String> num, int poz) {
		return num.get(poz);
	}
	
	public Persoana listPersoana(List<Persoana> num, int poz) {
		return num.get(poz);
	}
}
