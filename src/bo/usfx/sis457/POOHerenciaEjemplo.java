/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
        personas.add(new Alumno("35-1334", 1 ,"Computacion"));
        personas.add(new Docente( 5, "Computacion","Licenciado en Informática", "222222", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-23346", 1, "Computacion"));
        personas.add(new Alumno("35-3568", 1,"Computacion"));
        personas.add(new Docente(5,"Computacion", "Ingeniero de Sistemas"));
        personas.add(new Alumno("35-4898", 1,"Computacion"));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 5) Gestión de Alumnos                            |");
        System.out.println("| 5) Gestión de Administrativos                    |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAministrativos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Docentes Titular                              |");
        System.out.println("| 2) Docentes Contrato                             |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuDocenteTitular();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                menuDocenteContrato();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
       public static void menuAministrativos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Aministrativos                         |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Aministrativos                                |");
        System.out.println("| 2) Añadir Aministrativos                         |");
        System.out.println("| 3) Modificar Aministrativos                      |");
        System.out.println("| 4) Borrar Aministrativos                         |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAministrativos();
                volverMenu();
                menuAministrativos();
                break;
            case "2":
                anadirAministrativos();
                volverMenu();
                menuAministrativos();
                break;
            case "3":
                modificarAministrativos();
                volverMenu();
                menuAministrativos();
                break;
            case "4":
                borrarAministrativos();
                volverMenu();
                menuAministrativos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    
     public static void menuDocenteTitular() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docente Titular                       |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docente Titular                        |");
        System.out.println("| 2) Añadir Docente Titular                        |");
        System.out.println("| 3) Modificar Docente Titular                     |");
        System.out.println("| 4) Borrar Docente Titular                        |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "2":
                anadirDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "3":
                modificarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "4":
                borrarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            default:
                menuPrincipal();
        }
    }
     
     public static void menuDocenteContrato() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docente a Contrato                      |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docente Contrato                       |");
        System.out.println("| 2) Añadir Docente Contrato                       |");
        System.out.println("| 3) Modificar Docente Contrato                    |");
        System.out.println("| 4) Borrar Docente Contrato                       |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "2":
                anadirDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "3":
                modificarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "4":
                borrarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            default:
                menuPrincipal();
        }
    }
     
     
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
  
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                            |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof Docente) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocentes() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int añosExperiencia;
        String asignaturas;
        String titulo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docentes                                 |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca los AñosExperiencia: ");
            añosExperiencia =  Integer.parseInt (entradaTeclado.readLine());
            System.out.print("Introduzca las Asignaturas: ");
            asignaturas = entradaTeclado.readLine();
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente( añosExperiencia ,asignaturas, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
            }  catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocentes() {
        int id;
        Docente docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docentes                               |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docente = (Docente)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docente .getCarnetIdentidad()+ "': ");
                docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docente .getNombre() + "': ");
                docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docente .getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docente .setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el AñosExperiencia'"+ docente.getAñosExperiencia()+ "': ") ;
                docente.setAñosExperiencia (Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar el Asignaturas' " + docente .getAsignaturas()+ "': ");
                docente .setAsignaturas(entradaTeclado.readLine());
                System.out.print("Introduzca el Título Universitario: ");
                docente .setTitulo(entradaTeclado.readLine());
                personas.set(id, docente );
                System.out.println("Registro de Docente modificado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocentes() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente                                  |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    
    
    public static void listarAministrativos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Administrativos                            |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona administrativo: personas) {
            if (administrativo instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + administrativo);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAministrativos() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String cargo;
        String lugarTraba;
        String fechaIngreso;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Administrativos                                |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca los Cargo: ");
            cargo =entradaTeclado.readLine();
            System.out.print("Introduzca Lugar de Trabajo: ");
            lugarTraba = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Ingreso (ejemplo: 1980-01-01): ");
            fechaIngreso = entradaTeclado.readLine();
            Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaIngreso);
            Calendar fechaIngresoCalendario = Calendar.getInstance();
            fechaIngresoCalendario.setTime(fechaIngresoDate);
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Administrativo(cargo ,lugarTraba, fechaIngresoCalendario, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
            }  catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void  modificarAministrativos(){
        int id;
        Administrativo administrativo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrativos                          |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                administrativo = (Administrativo)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" +  administrativo.getCarnetIdentidad()+ "': ");
                 administrativo.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" +  administrativo .getNombre() + "': ");
                 administrativo.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario( administrativo .getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                administrativo .setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Cargo'"+  administrativo.getCargo()+ "': ") ;
                administrativo.setCargo (entradaTeclado.readLine());
                System.out.print("Modificar el Lugar de su trabajo' " +administrativo.getLugarTraba()+ "': ");
                 administrativo .setLugarTraba(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Ingreso '" + Utilitarios.getFechaCalendario( administrativo .getFechaIngreso()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
               Calendar fechaIngresoCalendario = Calendar.getInstance();
               fechaIngresoCalendario.setTime(fechaIngresoDate);
                personas.set(id,  administrativo );
                System.out.println("Registro de Docente modificado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAministrativos() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Aministrativos                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Aministrativos a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Aministrativos borrado!");
            } else {
                System.out.println("El Registro de Aministrativos no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        String asignatura;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Asignatura: ");
            asignatura = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(carnetUniversitario, semestre, asignatura , carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Asignatura '" + alumno.getAsignatura() + "': ");
                alumno.setAsignatura(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
     public static void listarDocenteTitular() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes Titulares                    |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docenteTitular: personas) {
            if (docenteTitular instanceof DocenteTitular) {
                i++;
                System.out.println(i + ": " + docenteTitular);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
     
     public static void anadirDocenteTitular() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosExperiencia;
        String asignaturas;
        String examenCompetencia;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente Titular                           |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca años de experiencia: ");
            añosExperiencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca asignatura: ");
            asignaturas = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Examen Competencia: ");
            examenCompetencia = entradaTeclado.readLine();
            personas.add(new DocenteTitular(examenCompetencia,añosExperiencia,asignaturas, titulo, carnetIdentidad, nombre,fechaNacimientoCalendario));
            System.out.println("Registro de Docentes Titulares completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
     public static void modificarDocenteTitular() {
        int id;
        DocenteTitular docenteTitular;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente Titular                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente Titular a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteTitular = (DocenteTitular)personas.get(id);
                System.out.print("Modificar el Titulo '" + docenteTitular.getTitulo()+ "': ");
                docenteTitular.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar años de esperiecia '" + docenteTitular.getAñosExperiencia()+ "': ");
                docenteTitular.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar asignatura '" + docenteTitular.getAsignaturas()+ "': ");
                docenteTitular.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + docenteTitular.getCarnetIdentidad()+ "': ");
                docenteTitular.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteTitular.getNombre() + "': ");
                docenteTitular.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteTitular.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteTitular.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Examen de Competencia '" + docenteTitular.getExamenCompetencia()+ "': ");
                docenteTitular.setExamenCompetencia(entradaTeclado.readLine());
                personas.set(id, docenteTitular);
                System.out.println("Registro de Docente Titular modificado!");
            } else {
                System.out.println("El Registro de Docente Titular no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
     public static void borrarDocenteTitular() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente Titular                           |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente Titular a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente Titular borrado!");
            } else {
                System.out.println("El Registro de Docente Titular no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
     public static void listarDocenteContrato() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes a Contrato                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docenteContrato: personas) {
            if (docenteContrato instanceof DocenteContrato) {
                i++;
                System.out.println(i + ": " + docenteContrato);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
     
     public static void anadirDocenteContrato() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosExperiencia;
        String asignaturas;
        String nContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente a Contrato                          |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca años de experiencia: ");
            añosExperiencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca asignatura: ");
            asignaturas = entradaTeclado.readLine();
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Numero de Contrato: ");
            nContrato = entradaTeclado.readLine();
            personas.add(new DocenteContrato(nContrato, añosExperiencia, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docentes a Contrato completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
     public static void modificarDocenteContrato() {
        int id;
        DocenteContrato docenteContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente a Contrato                     |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente Titular a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteContrato = (DocenteContrato)personas.get(id);
                System.out.print("Modificar el Titulo '" + docenteContrato.getTitulo()+ "': ");
                docenteContrato.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar años de esperiecia '" + docenteContrato.getAñosExperiencia()+ "': ");
                docenteContrato.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar asignatura '" + docenteContrato.getAsignaturas()+ "': ");
                docenteContrato.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar el Carnet de Identidad '" + docenteContrato.getCarnetIdentidad()+ "': ");
                docenteContrato.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteContrato.getNombre() + "': ");
                docenteContrato.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteContrato.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteContrato.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Numero de Contrato '" + docenteContrato.getNContrato()+ "': ");
                docenteContrato.setNContrato(entradaTeclado.readLine());
                personas.set(id, docenteContrato);
                System.out.println("Registro de Docente a Contrato modificado!");
            } else {
                System.out.println("El Registro de Docente a Contrato no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
     public static void borrarDocenteContrato() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente a Contraro                         |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Contrato a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente a Contrato borrado!");
            } else {
                System.out.println("El Registro de Docente a Contrato no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}