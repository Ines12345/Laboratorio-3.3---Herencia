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
public class DocenteTitular  extends Docente{
    protected String ExamenCompetencia;

    public DocenteTitular(String examenCompetencia, int añosExperiencia, String asignaturas, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(añosExperiencia, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia = examenCompetencia;
    }

    public DocenteTitular(String examenCompetencia, int añosExperiencia, String asignaturas, String titulo) {
        super(añosExperiencia, asignaturas, titulo);
        this.ExamenCompetencia = examenCompetencia;
    }

    public DocenteTitular(String examenCompetencia) {
        this.ExamenCompetencia = examenCompetencia;
    }

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
    }
        @Override
    public String toString() {
        return "DocenteTitular{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", AñosExperiencia=" +AñosExperiencia 
                + ",Asignatura=" +Asignaturas 
                +", Titulo= " + Titulo 
                +"ExamenCompetencia=" +ExamenCompetencia+'}';
    }   
}
