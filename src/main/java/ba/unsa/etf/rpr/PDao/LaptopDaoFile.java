package ba.unsa.etf.rpr.PDao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public abstract class LaptopDaoFile implements LaptopDao{
    ArrayList<Laptop> lista;
    File file;
    public void dodajLaptopUListu(Laptop laptop) throws IOException {
        lista.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        lista.add(laptop);
        spasiStanjeListe();
    }

    @Override
    public Laptop getLaptop(String procesor) {
        Laptop x  = null;
        for(Laptop l : lista) {
            if(l.getProcesor().equals(procesor)){
                x = l;
            }
        }
        return x;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.lista = laptopi;
    }
    public abstract ArrayList<Laptop> vratiPodatkeIzDatoteke();
    public abstract void spasiStanjeListe() throws IOException;
}
