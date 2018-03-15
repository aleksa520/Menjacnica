package rad_menjacnice;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnicaIS.MenjacnicaInterfejs;

public class Rad implements MenjacnicaInterfejs {

	LinkedList<Kurs> valute = new LinkedList<Kurs>();
	@Override
	public void dodajKursValute(Kurs k) {
		// TODO Auto-generated method stub
		valute.add(k);
	}

	@Override
	public void obrisiKursValute(String ime, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public String vratiKurs(String ime, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
