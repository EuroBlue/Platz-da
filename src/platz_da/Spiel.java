package platz_da;

import platz_da.Warteschlange.WarteElement;

public class Spiel {
    public int breite;
    public Warteschlange<Person> stamm;
    public Spiel(int kinderanzahl)
    {
        this.breite=kinderanzahl;
        this.stamm=new Warteschlange<Person>();
    }
    public String leseString()
    {
        return new java.util.Scanner(System.in).nextLine();
    }
    public void startBelegungEingeben()
    {
        for (int i=0;i<this.breite;i++)
        {
            stamm.hinzufuegen(new WarteElement<Person>(new Person(leseString())));
        }
    }
    public void startBelegungEingeben(String[] namen)
    {
        for (int i=0;i<namen.length;i++)
        {
            stamm.hinzufuegen(new WarteElement<Person>(new Person(namen[i])));
        }
    }
    public boolean tippIstRictung(String tipp)
    {
        if(stamm.erste.getValue().name.equals(tipp))
        {
            return true;
        }
        return false;
    }
    public void spielen()
    {
        boolean richtigGeraten=true;
        while(richtigGeraten)
        {
            System.out.flush();
            if(tippIstRictung(leseString()))
            {
                System.out.println("Super.Richtig gemerkt");
                stamm.hinzufuegen(new WarteElement<Person>(new Person(leseString())));
                stamm.entfernen();
            }
            else
            {
                System.out.println("Leider falsch.");
                System.out.println("Rictig waere gewesen: "+stamm.erste.getValue().name);
                richtigGeraten=false;
            }
        }
    }
}
