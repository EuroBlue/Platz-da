package platz_da;
/**
 * Beschreiben Sie hier die Klasse Warteschlange.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Warteschlange<Type>
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public WarteElement<Type> erste;
    /**
     * Konstruktor für Objekte der Klasse Warteschlange
     */
    public Warteschlange()
    {
        erste=null;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void hinzufuegen(WarteElement<Type> wE)
    {
        WarteElement<Type> end=erste;
        if(end!=null)
        {
            while(end.next!=null)
            {
                end=end.next;
            }
            end.next=wE;
        }
        else
        {
            erste=wE;
        }
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void entfernen()
    {
        erste=erste.next;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public WarteElement<Type> gibErstenElement()
    {
        return erste;
    }
    public static class WarteElement<Type>
    {
        public WarteElement<Type> next;
        public Type value;
        public WarteElement(Type obj)
        {
            value=obj;
            next=null;
        }
        public Type getValue() 
        {
            return this.value;
        }
        public WarteElement() {
        }
    }
}
