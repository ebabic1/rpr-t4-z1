package ba.unsa.etf.rpr.PDao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LaptopDaoJSONFile extends LaptopDaoFile{
    ObjectMapper mapper ;
    public LaptopDaoJSONFile()  {
        this.file = new File("mojilaptopi.json");
        this.lista = new ArrayList<Laptop>();
        this.mapper = new XmlMapper();
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
