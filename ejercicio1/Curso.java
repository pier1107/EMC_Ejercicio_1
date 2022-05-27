package ejercicio1;
public class Curso {
  private String nombre;
  private String horas;
  private Docente[] docente;
  private int contador;

  public Curso(String nombre, String horas) {

      this.nombre = nombre;
      this.horas = horas;
      this.docente = new Docente[2];
      this.contador = 0;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  String getNombre() {
      return nombre;
  }
  public void setHoras(String horas){
    this.horas = horas;
  }
  String getHoras(){
    return horas;
  }
  public void setDocente(Docente docente) {

      this.docente[this.contador] = docente;

      this.contador++;
  }

  public Docente[] getDocente() {
      return docente;
  }

}
