
public class Auto extends Veicolo{
    protected String tipo;
    public Auto(int nMatricola, int nProprietario, String t){

        super(nMatricola, nProprietario);
        tipo = t;
    }
    public void get dammiTipo()
    {
        return tipo;
    }
    public void set assegnaTipo(String x)
    {
        tipo=x;
        return tipo;
    }


}
