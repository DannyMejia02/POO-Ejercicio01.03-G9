/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

/**
 *
 * @author PC-10
 */
public class Principal {

    public static void main(String[] args) {
        
        var auto = new Auto();
        auto.marca = "Mitsubishi";
        auto.modelo ="Evolution";
        auto.precio = 15000;
        auto.recorrido = 250630;
        var autor = new Autor();
        autor.nombre = "Tomas";
        autor.edad = 25;
        autor.sueldo = 896147;
        var matricula = new Matricula();
        matricula.claseVehiculo = "Auto";
        matricula.color = "Verde";
        matricula.numeroMotor = 15879;
        matricula.placa = "ACGD1564";
        var pelicula = new Pelicula ();
        pelicula.duracion = "1 hora 55 minutos";
        pelicula.nombre = "Los Mafiosos";
        pelicula.tipoDePelicula = "Accion";
        var personaje = new Personaje();
        personaje.descripcion = "Mafioso";
        personaje.guion = "Matar a los malos";
        personaje.rol = "Asesino";
        var propietario = new Propietario ();
        propietario.cedula = 0103653413;
        propietario.direccion = "Manhattan";
        propietario.nombre = "Alberto";
        propietario.telefono = 4578365;
        
        System.out.println("La marca del auto es "+auto.marca+" su dueño es "+propietario.nombre+" se fue a ver una pelicula de "+pelicula.tipoDePelicula);
    }
}
