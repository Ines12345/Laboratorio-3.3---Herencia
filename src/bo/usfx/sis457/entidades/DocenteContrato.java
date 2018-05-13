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
 * @author Ines Gonzales
 */
public class DocenteContrato extends Docente {
   protected String NContrato;

    public DocenteContrato(String nContrato, int añosExperiencia, String asignaturas, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(añosExperiencia, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.NContrato = nContrato;
    }

    public DocenteContrato(String nContrato, int añosExperiencia, String asignaturas, String titulo) {
        super(añosExperiencia, asignaturas, titulo);
        this.NContrato = nContrato;
    }

    public DocenteContrato(String nContrato) {
        this.NContrato = nContrato;
    }

    public String getNContrato() {
        return NContrato;
    }

    public void setNContrato(String NContrato) {
        this.NContrato = NContrato;
    }
      @Override
    public String toString() {
        return "DocenteContrato{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", AñosExperiencia=" +AñosExperiencia 
                + ",Asignatura=" +Asignaturas 
                + ", Titulo= " + Titulo 
                + ",NContrato=" +NContrato+'}';
    }  
}
