package org.example.ejercicios

/*
* Instalación, configuración y conexión con H2.

Instala la base de datos en tu IDE.
Configura la base de datos para que funcione en modo fichero.
Cambia el PATH de la base de datos. Pista: usa ./Directorio para guardarlo en tu proyecto.
Crea un programa en Kotlin para establecer conexión con H2, manejando excepciones.
*
* */

import java.sql.DriverManager
import java.sql.SQLException

class Conexion {

    fun conecta() {

        val url = "jdbc:h2:./DataBase/mydb"
        val user = "user"
        val password = "password"

        try
        {
            Class.forName("org.h2.Driver")
            val conexion = DriverManager.getConnection(url, user, password)
            println("Conexión exitosa")
            conexion.close()
        } catch (e: SQLException)
        {
            println("Error en la conexión: ${e.message}")
        } catch (e: ClassNotFoundException)
        {
            println("No se encontró el driver de JDBC: ${e.message}")
        }
    }
}