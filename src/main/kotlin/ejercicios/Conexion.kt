package org.example.ejercicios

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