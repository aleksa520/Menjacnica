package menjacnicaIS;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKursValute(String ime, double prodajni, double srednji, double kupovni, 
			GregorianCalendar datum);
	public void obrisiKursValute(Kurs k);
	public String vratiKurs(String ime, GregorianCalendar datum);
}