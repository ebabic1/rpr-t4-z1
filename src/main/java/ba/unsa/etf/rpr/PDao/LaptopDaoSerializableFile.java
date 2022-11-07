package ba.unsa.etf.rpr.PDao;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile extends LaptopDaoFile{
    private ArrayList<Laptop> lista;
    private File file;
    private ObjectOutputStream out;

    public LaptopDaoSerializableFile() throws IOException, ClassNotFoundException {
        lista=new ArrayList<>();
        this.file = new File("mojilaptopi.txt");
        out = new ObjectOutputStream(new FileOutputStream(file));
    }
    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke(){
        ArrayList<Laptop> listaIzDatoteke = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.file));
            listaIzDatoteke = (ArrayList)in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaIzDatoteke;
    }

    @Override
    public void spasiStanjeListe() throws IOException {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.file));
            out.writeObject(this.lista);
            out.close();
    }
}