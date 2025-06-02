/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author antoniosalinas
 */
public class Persona {
    
    private int id;
    private char genero;
    private String nombre;
    private int estado;
    private float estatura;
    private float peso;

    @Override
    public String toString() {
        return "Persona{" + '}';
    }

    
    public Persona() {
        
    }

    public Persona(int id, char genero, String nombre, int estado, float estatura, float peso) {
        this.id = id;
        this.genero = genero;
        this.nombre = nombre;
        this.estado = estado;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public char getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstado() {
        return estado;
    }

    public float getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }
    
    
}
