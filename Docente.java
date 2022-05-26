package EMC;

public class Docente {

    private String nom;

    private String ap;

    Docente(String nom, String ap)
{
    setNombre(nom);
    setApellido(ap);
  
    
    
}
    void setNombre(String nom)
    {
        this.nom= nom;
    }

    String getNombres()
    {
      return nom;
    }

    void setApellido(String ap)
    {
        ap = ap;
    }
    String getApellido()
    {
        return ap;
    }
   
    
}
