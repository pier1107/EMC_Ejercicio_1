package Colegio;

public class Main {
    public static void main(String args[]) {
        Docente luisa = new Docente("LUISA");
        Docente wali = new Docente("WALI");

        Docente elvira = new Docente("ELVIRA");
        Docente graciela = new Docente("GRACIELA");

        Docente pedro = new Docente("PEDRO");
        Docente luis = new Docente("LUIS");

        Curso cursoMatematica = new Curso("MATEMATICA");
        cursoMatematica.setDocente(luisa);
        cursoMatematica.setDocente(wali);

        Curso cursoLenguaje = new Curso("LENGUAJE");
        cursoLenguaje.setDocente(elvira);
        cursoLenguaje.setDocente(graciela);

        Curso cursoarte = new Curso("ARTE");
        cursoarte.setDocente(pedro);
        cursoarte.setDocente(luis);

        Estudiante estudiante = new Estudiante("ISABELLA", 14);

        estudiante.setCurso(cursoMatematica);
        estudiante.setCurso(cursoLenguaje);
        estudiante.setCurso(cursoarte);

        Matricula matricula = new Matricula("2022-I", 2344);
        matricula.setEstudiante(estudiante);

        for (Estudiante e : matricula.getEstudiante()) {
            System.out.println("nombre:" + e.getNombre());
            System.out.println("edad:" + e.getEdad());
            System.out.println("semestre: " + matricula.getSemestre());

            for (Curso c : e.getCurso()) {
                System.out.println("Curso: " + c.getNombre());

                for (Docente d : c.getDocente()) {
                    System.out.println("Docente: " + d.getNombre());
                }
            }
        }
        /*
         * Docente elena = new Docente("ELENA");
         * Docente rosa = new Docente("ROSA");
         * 
         * Curso cursoInformatica = new Curso("INFORMATICA");
         * cursoInformatica.setDocente(elena);
         * 
         * Curso cursoCiencias = new Curso("CIENCIAS");
         * cursoCiencias.setDocente(rosa);
         * 
         * Estudiante estudiante2 = new Estudiante("GUADALUPE", 15);
         * System.out.println("Estudiante: " + estudiante.getNombre());
         * System.out.println("Codigo de estudiante: " + estudiante.getEdad());
         * estudiante2.setCurso(cursoInformatica);
         * estudiante2.setCurso(cursoCiencias);
         */

    }

}
