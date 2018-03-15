package menjacnicaIS;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKursValute(Kurs k);
	public void obrisiKursValute(String ime, GregorianCalendar datum);
	public String vratiKurs(String ime, GregorianCalendar datum);
}