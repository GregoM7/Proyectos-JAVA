public class Main {
    public static void main(String[] args) {
        Consulta consulta1 = new Consulta(19,"cardiologia",19.30);
        Consulta consulta2 = new Consulta(15,"endocrinologia",18.45);
        PacienteObraSocial paciente1 = new PacienteObraSocial(1988,"Pablo","Cristaldo",true,consulta1,"obrasocial sarasa",111);
        PacienteObraSocial paciente2 = new PacienteObraSocial(1960,"asldkj","asldk", false, consulta2, "asdkj",222);

        System.out.println("comparacion");
        System.out.println(paciente2.compareTo(paciente1));

        System.out.println("¿Paciente 1 necesita evaluacion?");
        System.out.println(paciente1.necesitaEvaluacionInicial());

        System.out.println("¿Paciente 2 necesita evaluacion?");
        System.out.println(paciente2.necesitaEvaluacionInicial());
    }


}
