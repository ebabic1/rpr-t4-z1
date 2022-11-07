package ba.unsa.etf.rpr.PDao;

import java.io.Serializable;

public class Laptop implements Serializable {
    private String brend;
    private String model;
    private Double cijena;

    public Laptop(String brend, String model, Double cijena, Integer ram, Integer hdd, Integer ssd, String procesor, String grafickaKartica, Double velicinaEkrana) {
        this.brend = brend;
        this.model = model;
        this.cijena = cijena;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.procesor = procesor;
        this.grafickaKartica = grafickaKartica;
        this.velicinaEkrana = velicinaEkrana;
    }

    private Integer ram;
    private Integer hdd;
    private Integer ssd;
    private String procesor;
    private String grafickaKartica;
    private Double velicinaEkrana;

    public Laptop() {
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public Double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(Double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", cijena=" + cijena +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                ", procesor='" + procesor + '\'' +
                ", grafickaKartica='" + grafickaKartica + '\'' +
                ", velicinaEkrana=" + velicinaEkrana +
                '}';
    }
}
