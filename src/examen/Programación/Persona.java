package examen.Programación;

public abstract class Persona {

    protected int dni;
    protected String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public static class Medico extends Persona{

        private int matricula;
        private String especialidad;

        public Medico(int dni, String nombre, int matricula, String especialidad) {
            super(dni, nombre);
            this.matricula = matricula;
            this.especialidad = especialidad;
        }

        public int getMatricula() {

            return matricula;

        }

        public String getEspecialidad() {

            return especialidad;

        }

    }

    public static class Paciente extends Persona {

        private int numeroAfiliado;
        private String obraSocial;
        private  Medico medicoCabecera;

        public Paciente(int dni, String nombre, int numeroAfiliado, String obraSocial) {
            super(dni, nombre);
            this.numeroAfiliado = numeroAfiliado;
            this.obraSocial = obraSocial;
        }

        public Medico getMedicoCabecera() {

            return medicoCabecera;

        }

        public void setMedicoCabecera(Medico medicoCabecera) throws Excepcion {

            if(medicoCabecera.getEspecialidad().equalsIgnoreCase("clinica")){
                this.medicoCabecera = medicoCabecera;
                System.out.println("\n La especialidad del medico es correcto ");
                return;
            }

            throw new Excepcion(" La especialidad del medico es incorrecto ");
        }

    }

    public static void main(String[] args) {

        Medico clinica  = new Medico(11223344,"Anastacio",11111,"clinica");

        Paciente paciente = new Paciente(11223345,"Almanzo",921,"una tal obra social");

        try{

            paciente.setMedicoCabecera(clinica);

        }catch (Exception error) {

            System.out.println(error.getMessage());

        }

    }

}