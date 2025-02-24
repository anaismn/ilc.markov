package cfranc.com;

//Cr�ation d'un codage unique permettant de s�lectionner le point de d�part totalement al�atoiremment sans respect� l'ordre alphab�tique
public class Couple {
	
	private String first;
	private String second;
	
	public Couple(String w1, String w2) {
		this.first = w1;
		this.second = w2;
	}
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	@Override
	public int hashCode() {
		//return hashCodeEclipse();
		return this.first.hashCode() + this.second.hashCode(); //l'addition de 2 codages diff�rents = un codage unique
	}

        //D�termine le codage des entr�es pour avoir un hashage uniforme num�rique et non pas alphanum�rique (ne d�pend pas des lettres)
	int hashCodeEclipse() {
		final int prime = 31;   //nb al�atoire
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Couple other = (Couple) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

}
