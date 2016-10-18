public class Persona {
    private String dni;
    private String numSS;
    private String nombre;
    private String apellidos;
    private int edad;
    private Double salario;

    public Persona(String dni, String numSS, String nombre, String apellidos, int edad, Double salario) {
        this.dni = dni;
        this.numSS = numSS;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {return dni;}

    public void setDni(String dni) {this.dni = dni;}

    public String getNumSS() {return numSS;}

    public void setNumSS(String numSS) {this.numSS = numSS;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public Double getSalario() {return salario;}

    public void setSalario(Double salario) {this.salario = salario;}

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", numSS='" + numSS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
