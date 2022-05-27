package ejercicio1;
public class Estudiante {
    private String nombre;
    private int dni;
    private int codigo;
    private Curso[] curso;
    private int contador;

   public Estudiante(String nombre, int dni, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.dni= dni;
        this.curso = new Curso[3];
        this.contador = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    int getDni() {
        return dni;
    }
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    int getCodigo(){
        return codigo;
    }
    public void setCurso(Curso curso) {

        this.curso[this.contador++] = curso;
    }

    public Curso[] getCurso() {
        return curso;
    }
}