/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Docente extends Persona {
       protected int AñosExperiencia;
       protected String Asignaturas;
       protected String Titulo;
   
  

    public Docente(int añosExperiencia, String asignaturas, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.AñosExperiencia = añosExperiencia;
        this.Asignaturas = asignaturas;
        this.Titulo = titulo;
    }

    public Docente(int añosExperiencia, String asignaturas, String titulo) {
        this.AñosExperiencia = añosExperiencia;
        this.Asignaturas = asignaturas;
        this.Titulo = titulo;
    }

    public Docente() {
        
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
   
    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", AñosExperiencia=" +AñosExperiencia 
                + ",Asignatura=" +Asignaturas 
                +", Titulo= " + Titulo +'}';
    }   
}
