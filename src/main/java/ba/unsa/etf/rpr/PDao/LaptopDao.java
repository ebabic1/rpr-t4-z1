package ba.unsa.etf.rpr.PDao;

import java.io.IOException;
import java.util.ArrayList;

public interface LaptopDao {
    public void dodajLaptopUListu(Laptop laptop) throws IOException;
    public void dodajLaptopUFile(Laptop laptop) throws IOException;
    public Laptop getLaptop(String procesor);
    public void napuniListu(ArrayList<Laptop> laptopi);
    public ArrayList<Laptop> vratiPodatkeIzDatoteke();
}
