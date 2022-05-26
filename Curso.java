package EMC;

public class Curso 
{
    private String horas;
    private double costo;
    private Docente docente;
    private Estudiante estudiante;
    private String institucion;
    
    Curso(String horas, double costo, String inst)
    {
      setHoras(horas);
      setCosto(costo);
      setInstitución(inst);
    }

    void setHoras(String horas)
    {
        this.horas= horas;
    }

    String getHoras()
    {
      return horas;
    }
    void setCosto(double costo)
    {
        this.costo= costo;
    }

    double getCosto()
    {
      return costo;
    }
    void setDocente(Docente docente)
    {
        this.docente= docente;
    }

    Docente getDocente()
    {
      return docente;
    }
    
    void setEstudiante(Estudiante estudiante)
    {
        this.estudiante= estudiante;
    }

    Estudiante getEstudiante()
    {
      return estudiante;
    }
    void setInstitución(String inst)
    {
        institucion=inst;
    }

    String getInstitucion()
    {
        return institucion;
    }



}
