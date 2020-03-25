
public class Auto extends Veicolo{
    protected String tipo;
    public Auto(int nMatricola, int nProprietario, String t){

        super(nMatricola, nProprietario);
        tipo = t;
    }
    public String dammiTipo()
    {
        return tipo;
    }
    public String assegnaTipo(String x)
    {
        tipo=x;
        return tipo;
    }


}
