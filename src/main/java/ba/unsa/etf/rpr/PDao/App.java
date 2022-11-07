package ba.unsa.etf.rpr.PDao;

import ba.unsa.etf.rpr.PDao.Laptop;
import ba.unsa.etf.rpr.PDao.LaptopDaoSerializableFile;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException {
        Laptop l = new Laptop();
        l.setBrend("aaaa");
        LaptopDao test = new LaptopDaoSerializableFile();
        test.dodajLaptopUFile(l);
        test.dodajLaptopUFile(l);
        for(Laptop ll : test.vratiPodatkeIzDatoteke()) System.out.println(ll);
    }
}
