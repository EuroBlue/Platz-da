package platz_da;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class SpielTest {
    public SpielTest()
    {
    }
    @Before
    public void setUp()
    {
    }
    @After
    public void tearDown()
    {
    }
    @Test
    public void testStartBelegungEingeben()
    {
        Spiel spiel1=new Spiel(6);
        String[] names={"Eitan", "Paul", "Adrian","Julian E","Yassin","Domminik", "Julian L"};
        spiel1.startBelegungEingeben(names);
        for (int i=0;i<names.length-1;i++)
        {
            assertTrue(spiel1.stamm.erste.getValue().name.equals(names[i]));
            assertFalse(spiel1.stamm.erste.getValue().name.equals(names[i+1]));
            spiel1.stamm.entfernen();
        }
    }
    @Test
    public void testTippIstRictung()
    {
        Spiel spiel1=new Spiel(7);
        String[] names={"Eitan", "Paul", "Adrian","Julian E","Yassin","Domminik", "Julian L"};
        spiel1.startBelegungEingeben(names);
        for (int i=0;i<names.length-1;i++)
        {
            assertTrue(spiel1.tippIstRictung(names[i]));
            spiel1.stamm.entfernen();
        }
    }
}
