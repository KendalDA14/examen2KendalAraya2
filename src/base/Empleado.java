
package base;

import java.time.LocalDate;


public class Empleado {
    private int cedula ;
    private String nombre;
    private String apellido;
    private char genero;
    private String fecaNacimiento;
    private String email;
    private double salario;
    private double porcComision;

    
    public Empleado(int cedula, String nombre, String apellido, char genero, String fecaNacimiento, String email, Double salario, Double porcComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fecaNacimiento = fecaNacimiento;
        this.email = email;
        this.salario = salario;
        this.porcComision = porcComision;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFecaNacimiento() {
        return fecaNacimiento;
    }

    public void setFecaNacimiento(String fecaNacimiento) {
        this.fecaNacimiento = fecaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(Double porcComision) {
        this.porcComision = porcComision;
    }
    
    
}
