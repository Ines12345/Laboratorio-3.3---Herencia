/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Alumno extends Persona {
    protected String CarnetUniversitario;
    protected int Semestre;
    protected String Asignatura;

    public Alumno(String carnetUniversitario, int semestre, String asignatura, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.Asignatura = asignatura;
    }

    public Alumno(String carnetUniversitario, int semestre, String asignatura) {
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.Asignatura = asignatura;
    } 

    public String getCarnetUniversitario() {
        return CarnetUniversitario;
    }

    public void setCarnetUniversitario(String CarnetUniversitario) {
        this.CarnetUniversitario = CarnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
   
    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", CarnetUniversitario=" + this.CarnetUniversitario 
                + ", Semestre=" + this.Semestre
                + ",Asignatura=" +this.Asignatura+'}';
    }
}
