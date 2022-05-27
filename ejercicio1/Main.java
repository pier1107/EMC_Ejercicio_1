package ejercicio1;
public class Main {
    public static void main(String args[]) {
        Docente paquito = new Docente("Paquito");
        Docente juanita = new Docente("Juanita");

        Docente pancracio = new Docente("Pancracio");
        Docente petronila = new Docente("Petronila");

        Docente macedonio = new Docente("Macedonio");
        Docente anita = new Docente("Anita");

        Curso cursoProgramacion = new Curso("Programacion","2 horas");
        cursoProgramacion.setDocente(paquito);
        cursoProgramacion.setDocente(juanita);

        Curso cursoBaseDatos = new Curso("Base de Datos","1 hora 45 minutos");
        cursoBaseDatos.setDocente(pancracio);
        cursoBaseDatos.setDocente(petronila);

        Curso cursoServidores = new Curso("Servidores","1 hora 15 minutos");
        cursoServidores.setDocente(macedonio);
        cursoServidores.setDocente(anita);

        Estudiante estudiante = new Estudiante("Pier Garcia", 191568, 516981);

        estudiante.setCurso(cursoProgramacion);
        estudiante.setCurso(cursoBaseDatos);
        estudiante.setCurso(cursoServidores);

        Matricula matricula = new Matricula("2022-I", 51619);
        matricula.setEstudiante(estudiante);

        for (Estudiante e : matricula.getEstudiante()) {
            System.out.println("semestre: " + matricula.getSemestre());
            System.out.println("nombre:" + e.getNombre());
            System.out.println("DNI:" + e.getDni());
            System.out.println("Codigo:"+ e.getCodigo());


            for (Curso c : e.getCurso()) {
                System.out.println("Curso: " + c.getNombre());

                for (Docente d : c.getDocente()) {
                    System.out.println("Docente: " + d.getNombre());
                }
            }
        }
    }

}