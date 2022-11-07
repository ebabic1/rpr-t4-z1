package ba.unsa.etf.rpr.PDao;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao{
    private ArrayList<Laptop> lista;
    private File file;
    private ObjectOutputStream out;

    public LaptopDaoSerializableFile(ArrayList<Laptop> lista, File file) throws IOException{
        this.lista = lista;
        this.file = file;
        this.out = new ObjectOutputStream(new FileOutputStream(file));
   }

    public LaptopDaoSerializableFile() throws IOException, ClassNotFoundException {
            lista=new ArrayList<>();
            this.file = new File("mojilaptopi.txt");
            out = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.file));

    }
    public void spasiStanjeListe() throws IOException{

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.file));
            out.writeObject(this.lista);
            out.close();

    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) throws IOException {
        lista.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        lista.add(laptop);
        spasiStanjeListe();
        out.writeObject(laptop);
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


}
