/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Marcelo
 */
public class Administrativo  extends Persona{
  protected String Cargo;
  protected String LugarTraba;
  protected Calendar FechaIngreso;

    public Administrativo(String cargo, String lugarTraba, Calendar fechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.LugarTraba = lugarTraba;
        this.FechaIngreso = fechaIngreso;
    }

    public Administrativo(String cargo, String lugarTraba, Calendar fechaIngreso) {
        this.Cargo = cargo;
        this.LugarTraba = lugarTraba;
        this.FechaIngreso = fechaIngreso;
        
    }
    public Administrativo() {
        this("0", "Sin Nombre", new GregorianCalendar(2000, 1,1));
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugarTraba() {
        return LugarTraba;
    }

    public void setLugarTraba(String LugarTraba) {
        this.LugarTraba = LugarTraba;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.FechaIngreso = fechaIngreso;
    }
   @Override
    public String toString() {
        return "Administrativo{" + ",Cargo=" + Cargo + ",LugarTraba=" + LugarTraba + ", FechaIngreso=" + FechaIngreso + '}';
    }
  
  
}
