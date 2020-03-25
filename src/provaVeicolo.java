//main

public class provaVeicolo {
    public static void main(String[] arg) {


        Auto a = new Auto();
        a.assegnaProprietario("Luca");
        a.assegnaMatricola(1234);
        a.assegnaTipo("Sport");


        Camion c = new Camion();
        c.assegnaProprietario("Anna");
        c.assegnaMatricola(34231);
        c.assegnaAssi(3);


        Moto m = new Moto();
        m.assegnaProprietario("Valentino");
        m.assegnaMatricola(8765);
        m.assegnaNumPosti(2);

        System.out.println("Auto di: " + a.dammiProprietario() + "tipo dell'auto: " + a.dammiTipo());

        System.out.println("Camion di: " + c.dammiProprietario() + "numero Matricola: " + c.dammiMatricola() + "numero assi: " + c.dammiAssi());

        System.out.println("Moto di: " + m.dammiProprietario() + "numero Matricola: " + m.dammiMatricola() + "numero Posti: " + m.dammiNumPosti());

        Veicolo v = new Veicolo();
        v = m;

        if (v instanceof Moto)
            System.out.println("il veicolo è una moto");

        Moto m2 = (Moto)v;
        System.out.println(m2.dammiNumPosti());
    }
}

