
package EMC;

public class Main 
{
        public static void main(String args[])
        {
            Curso curso = new Curso("1h 15min",75.6,"colegio Max Plack");
    
            System.out.println(curso.getHoras());
            System.out.println(curso.getCosto());
            System.out.println(curso.getInstitucion());
           
    
            curso.setDocente(new Docente("Mario", "Castañeda"));
            System.out.println("nombre del docente: "+curso.getDocente().getNomb());
            System.out.println("apellido del docente; "+curso.getDocente().getAp());

            curso.setEstudiante(new Estudiante("Paquito", 756984268));
            System.out.println("nombre del alumno: "+curso.getEstudiante().getNomb());
            System.out.println("codigo del alumno: "+curso.getEstudiante().getCodigo());
           
        }
        
}
