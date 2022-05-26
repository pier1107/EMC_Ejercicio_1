package EMC;

public class Estudiante 
{
    private String nomb;

    private int codigo;



    Estudiante(String nomb, int cod)
{
    setNombre(nomb);
    setCodigo(cod);
    
}
    void setNombre(String nomb)
    {
        this.nomb= nomb;
    }

    String getNombres()
    {
      return nomb;
    }

    void setCodigo(int cod)
    {
        codigo=cod;
    }
    int getCodigo()
    {
        return codigo;
    }
    
}
