package ba.unsa.etf.rpr.PDao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoXMLFile implements LaptopDao{

    File file;
    ArrayList<Laptop> lista ;
    XmlMapper mapper ;

    public LaptopDaoXMLFile()  {
        this.file = new File("mojilaptopi.xml");
        this.lista = new ArrayList<Laptop>();
        this.mapper = new XmlMapper();
    }

    @Override
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

    @Override
    public void spasiStanjeListe() throws IOException {
        this.mapper.writeValue(file,lista);
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {
        ArrayList<Laptop> listaIzDatoteke;
        try {
            listaIzDatoteke = mapper.readValue(file, new TypeReference<ArrayList<Laptop>>() {});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaIzDatoteke;
    }
}
