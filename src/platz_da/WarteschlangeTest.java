package platz_da;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import platz_da.Warteschlange.WarteElement;
/**
 * Die Test-Klasse WarteschlangeTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WarteschlangeTest
{
    /**
     * Konstruktor fuer die Test-Klasse KarteTest
     */
    public WarteschlangeTest()
    {
    }
    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     * @throws InterruptedException
     */
    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testHinzufuegen()
    {
        Warteschlange warte1=new Warteschlange();
        assertNull(warte1.erste);
        WarteElement elem1=new WarteElement<>();
        warte1.hinzufuegen(elem1);
        assertEquals(elem1, warte1.erste);
    }
    @Test
    public void testEntfernen()
    {
        Warteschlange warte1=new Warteschlange();
        WarteElement elem1=new WarteElement<>();
        WarteElement elem2=new WarteElement<>();
        warte1.hinzufuegen(elem1);
        warte1.hinzufuegen(elem2);
        assertEquals(elem1, warte1.erste);
        warte1.entfernen();
        assertEquals(elem2, warte1.erste);
        warte1.entfernen();
        assertNull(warte1.erste);
    }
    @Test
    public void testGibErstenElement()
    {
        Warteschlange warte1=new Warteschlange();
        WarteElement elem1=new WarteElement<>();
        assertNull(warte1.gibErstenElement());
        warte1.hinzufuegen(elem1);
        assertEquals(elem1, warte1.gibErstenElement());
    }
    public static class WarteElementTest
    {
        /**
         * Konstruktor fuer die Test-Klasse KarteTest
         */
        public WarteElementTest()
        {
        }
        /**
         *  Setzt das Testgerüst fuer den Test.
         *
         * Wird vor jeder Testfall-Methode aufgerufen.
         * @throws InterruptedException
         */
        /**
         *  Setzt das Testgerüst fuer den Test.
         *
         * Wird vor jeder Testfall-Methode aufgerufen.
         */
        @Before
        public void setUp()
        {
        }

        /**
         * Gibt das Testgerüst wieder frei.
         *
         * Wird nach jeder Testfall-Methode aufgerufen.
         */
        @After
        public void tearDown()
        {
        }
        @Test
        public void getValue()
        {
            String string1="Dies ist ein Stest string um nachzupruefen ob der Return und die Refferenzen bei dem StapelElement funtionieren";
            WarteElement<String> stapelElement1=new WarteElement<String>(string1);
            assertEquals(string1,stapelElement1.value, stapelElement1.getValue());
        }
    }
}
