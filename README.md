# Proyecto_Veterinaria
Proyecto de veterinaria desarrollado por Edwin Jovanny Martinez Rodriguez y Juan Francisco Mendoza Duran

## Descripcion
Este sistema fue desarrollado para facilitar el agendado de citas en una veterinaria. El sistema es capaz de agregar nuevos empleados y de igual manera asignarles un rol a cada uno, tambien cuenta con la funcion de guardar los datos de los clientes asi como los de las mascotas para futuras consultas


## Instalacion

Para el proceso de Instalacion del sistema, debera tener instalado el programa MySQL para la base de datos que ocupara, la version recomendada es la mas reciente que este disponible
Tambien 









## Estructura del codigo

### 1.Importaciones 
Nuestro codigo empieza con nuestras importaciones necesarias. Para la realizacion de este programa se utilizaron las sigientes librerias:

Para la conexion de la base de datos:
  ```java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
```

Importaciones reutilizables (para mejor imformacion bajar a la seccion de clases en Utils:
   
```java
package com.mycompany.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.AuthenticationFailedException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

```


Librerias para las interfaces:
```java

package com.mycompany.utils.pagination.style;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
```

### 2.Clases Principales

A continuacion esta un breve resumen y explicacion de las clases principales con las cuales el sistema opera, esta vendria a ser la base del proyecto por la cual hemos empezado


### Clase Database
Aqui se realiza la conexion con la base de datos.
Para poder usar el sistema es necesario que ingrese la contraseña de su MySQL para que de esta forma el programa pueda conectarse a su base de datos, de lo contrario, el sistema al no poder conectarse a su BD, no funcionara.
Encontrara ese apartado dentro del paquete com.mycompany.bd en la clase Database

```java
    private final String USER = "root";
    private final String PASS = "contraseña";   /* <-- Escriba la contraseña root de su MySQL dentro de las comillas
```


Las siguientes clases se encuentran dentro del paquete com.mycompany.models

### Clase cita
Esta clase nos permite hacer las citas para las mascotas
Para eso utilizamos variables tipo Integer para identificar el ID de la cita y de la mascota.
Tambien usamos variables Date para definir la fecha en la que se agenda la cita, ademas usamos los String para los nombres del veterinario y el estado de la cita


### Clase Cliente
En esta clase definimos los datos que nos interesa saber del cliente, como lo es su nombre, su correo electronico y su ID unico de cliente
Tambien se definen sus sets y gets para poder modificar sus datos


```java
public String nombre;
    public int id_usuario;
    public String correo;

    public Cliente(String nombre, int id_usuario, String correo) {
        this.nombre = nombre;
        this.id_usuario = id_usuario;
        this.correo = correo;
    }

```

### Clase Empleado
Esta clase nos permite definir los datos de los empleados, desde su nombre completo y su correo. Ademas tambien se definen sus datos que tendra dentro del sistema, desde su nombre de usuario, rol, y su contraseña para ingresar al sistema

Tambien contiene sus sets y gets para poder modificar sus datos desde el perfil de administrador


### Clase Mascota
Dentro de esta clase definimos los datos que nos interesa saber de la mascota, desde su nombre, sexo, color y detalles (Revisar codigo para mas informacion)
La clase contiene sets y gets para cada uno de los atributos en caso de querer modificar algun dato

```java
public int id_mascota;
    public String nombre;
    public int id_usuario;
    public String especie;
    public int edad;
    public String color_primario;
    public String detalles;
    public String genero;

```

### Clase Receta
Con esta clase podemos hacer las recetas para las mascotas.
En ella definomos los datos ID receta, detalles y el ID de la mascota a la que se le recetan los medicamentos y recomendaciones

```java
public int idReceta;
    public String detalles;
    public int idMascota;
```

### Clase Veterinario
En esta clase se definen los datos del veterinario que atiende en la veterinaria.
Solo contienen 4 atributos que son su nombre, correo, nombre de usuario y contraseña para ingresar al sistema

Contiene sets y gets para modificar sus datos en caso de ser necesario
```java
public String nombre_usuario;
    public String nombre;
    public String correo;    
    public String contraseña;
```

### Clase Utils
En esta clase se encuentran las importaciones que se mencionan anteriormente
Asi mismo contiene diversos metodos con los que nosotros podemos realizar funciones extras de nuestro sistema, desde crear el pdf que nos ayudara para crear la receta de la mascota y el metodo para poder enviar la receta al dueño por medio de correo electronico


### 3. Funcionamiento General del sistema de veterinaria

Al ejecutar el programa, le aparecera una ventana en la cual debe registrarse con su nombre de usuario y contraseña. Al accesar al sistema, parecera el menu principal desde el cual vera distintos botones que lo llevaran a distintas ventanas donde usted puede administrar la veterinaria, ya sea ver los datos de las mascotas, clientes y empleados, asi como poder ver las citas agendadas, eso en el caso de ser administrador.

En caso de ser un empleado de la veterinaria, este podra ver los datos de las mascotas y de los clientes, pudiendo agregar nuevas mascotas o clientes. De igual forma el empleado puede agendar citas en el sistema el cual sera atendido por el veterinario

En caso de ser veterinario, el sistema le mostrara de igual manera las mismas opciones que las que se le muestran al empleado comun, solo que a diferencia del empleado comun, el veterinario tiene la opcion de crear recetas para las mascotas dentro del apartado de mascotas, ademas de poder cambiar el estado de la cita, desde atendido o cancelado


## 4. Estructura de la Base de Datos

La base de datos esta hecha en MySQL, por lo que debera tener el programa instalado para no tener ningun inconveniente con el programa o el sistema. Si quiere conocer los datos de las tablas con las que funciona el sistema mas a fondo, debera conocer los comandos basicos de MySQL.
La base de datos se compone de 5 tablas:

* Cita
* Cliente
* Mascota
* Empleado
* Veterinario



  En la tabla Cita se almacenan los datos de la citas que se van agendando, esta funciona mediante el id de la mascota, el usuario y el id de la cita
  Si quiere ver todos los datos de la tabla cita, ejecute la siguiente consulta:

  ```java
  use veterinaria;  --Para usar el esquema de la veterinaria
  select * from cita;

  ```


  En la tabla Cliente se almacenan los datos de los clientes que se han registrado de la veterinaria, esta tabla contiene los atributos de nombre, ID y el correo.
  Si quiere ver todos los datos de la tabla Cliente, ejecute la siguiente consulta:

  ```java
  use veterinaria;  --Para usar el esquema de la veterinaria
  select * from cliente;

  ```


























`
