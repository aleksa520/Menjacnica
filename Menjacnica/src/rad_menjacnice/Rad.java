package rad_menjacnice;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnicaIS.MenjacnicaInterfejs;

public class Rad implements MenjacnicaInterfejs {

	LinkedList <Kurs> valute = new LinkedList<Kurs>();

	public void dodajKursValute(String ime, double prodajni, double srednji, double kupovni, 
			GregorianCalendar datum) {
		
		Kurs k = new Kurs();
		k.setNaziv(ime);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		k.setKupovni(kupovni);
		
		valute.add(k);
	}

	@Override
	public void obrisiKursValute(Kurs k) {
		
		for(int i = 0; i < valute.size();i++) {
			if(valute.get(i).equals(k))
				valute.remove(valute.get(i));
		}
	}

	@Override
	public String vratiKurs(String ime, GregorianCalendar datum) {
		Kurs k = new Kurs();
		
		k.setDatum(datum);
		k.setNaziv(ime);
		
		if(valute.contains(k)) {
			return k.toString();
		}		
		else return "Nema takvog kursa";
	}
}