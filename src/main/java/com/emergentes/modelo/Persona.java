
package com.emergentes.modelo;


public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    
public Persona(){
    this.id = 0;
    this.nombre= "";
    this.apellidos="";
    this.edad = 0;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
