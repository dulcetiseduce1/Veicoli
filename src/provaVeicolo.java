//main

public class provaVeicolo {
    public static void main(String[] arg) {


        auto a = new auto();
        a.assegnaProprietario("Luca");
        a.assegnaMatricola(1234);
        a.assegnaTipo("Sport");


        camion c = new camion();
        c.assegnaProprietario("Anna");
        c.assegnaMatricola(34231);
        c.assegnaAssi(3);


        moto m = new moto();
        m.assegnaProprietario("Valentino");
        m.assegnaMatricola(8765);
        m.assegnaNumPosti(2);

        System.out.println("Auto di: " + a.dammiProprietario() + "tipo dell'auto: " + a.dammiTipo());

        System.out.println("Camion di: " + c.dammiProprietario() + "numero Matricola: " + c.dammiMatricola() + "numero assi: " + c.dammiAssi());

        System.out.println("Moto di: " + m.dammiProprietario() + "numero Matricola: " + m.dammiMatricola() + "numero Posti: ") + m.dammiNumPosti());

        veicolo v = new veciolo();
        v = m;

        if (v instanceof moto)
            System.out.println("il veicolo è una moto");

        moto m2 = (moto)v;
        System.out.println(m2.dammiNumPosti())
    }
}
