import java.util.Scanner;
public class Veicolo {
Scanner sc = new Scanner (System.in);
    int numeroMatricola;
    int nomeProprietario;

    public Veicolo(int nMatricola, int nProprietario) {
        nomeProprietario = nProprietario;
        numeroMatricola = nMatricola;
    }

    public void assegnaProprietario() {

    System.out.println ("come si chiama il proprietario:");
    nomeProprietario = sc.next();

    }

    public String dammiProprietario() {

    }

    public void assegnaMatricola() {
        System.out.println ("Matricola:");
       numeroMatricola = sc.nextInt();

    }

    public int dammiMatricola() {

    }
}
