package ba.unsa.etf.rpr;
import ba.unsa.etf.rpr.PDao.Laptop;
import ba.unsa.etf.rpr.PDao.LaptopDao;
import ba.unsa.etf.rpr.PDao.LaptopDaoSerializableFile;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AppTest {
    private LaptopDaoSerializableFile lapTxtDao;
    @BeforeEach
    public void setup(){
        lapTxtDao = mock(LaptopDaoSerializableFile.class);

    }
    @Test
    public void testVratiPodatkeIzDatoteke(){
        ArrayList<Laptop> lista = new ArrayList<>(Arrays.asList(new Laptop("Toshiba",null,null,null,null,
                null,null,null,null)));
        when(lapTxtDao.vratiPodatkeIzDatoteke()).thenReturn(lista);
        assertEquals("Laptop{brend='Toshiba', model='null', cijena=null, ram=null, hdd=null, ssd=null, procesor='null', grafickaKartica='null', velicinaEkrana=null}",
                lapTxtDao.vratiPodatkeIzDatoteke().get(0).toString());
    }

}