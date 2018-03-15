package menjacnica;

import java.util.GregorianCalendar;

public class Kurs extends Valuta{

	GregorianCalendar datum;
	
	double prodajni,kupovni,srednji;

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum != null)
			this.datum = datum;
		else
			throw new RuntimeException("Greska");
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if(prodajni > 0)
			this.prodajni = prodajni;
		else
			throw new RuntimeException("Greska");
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if(kupovni > 0)
			this.kupovni = kupovni;
		else
			throw new RuntimeException("Greska");
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if(srednji > 0)
			this.srednji = srednji;
		else
			throw new RuntimeException("Greska");
	}

	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", prodajni=" + prodajni + ", kupovni=" + kupovni + ", srednji=" + srednji
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	
	
	
}
