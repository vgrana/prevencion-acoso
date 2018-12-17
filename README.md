[![Waffle.io - Columns and their card count](https://badge.waffle.io/vgrana/prevencion-acoso-callejero.svg?columns=backlog)](https://waffle.io/vgrana/prevencion-acoso-callejero)
[![Build Status](https://travis-ci.com/vgrana/prevencion-acoso-callejero.svg?branch=master)](https://travis-ci.com/vgrana/prevencion-acoso-callejero)


# Prevención acoso

## Software necesario

### Instalar JDK 1.8:

Siga los siguientes pasos para instalar Java OpenJDK en ubuntu:
- Actualice los índices de paquetes con :
	```
	sudo apt update
	```
- Instale el paquete java requerido:
	```
	sudo apt install  openjdk-8-jdk
	```
- Verifique la correcta instalación de la versión ejecutando el comando:
	```
	java -version
	```
- Al ejecutar el comando le aparacerá en pantalla lo siguiente: 
	```
	openjdk version "1.8.0_191"
	OpenJDK Runtime Environment (build 1.8.0_191-8u191-b12-0ubuntu0.18.04.1-b12)
	OpenJDK 64-Bit Server VM (build 25.191-b12, mixed mode)
	```

### Instalar MAVEN:
- Para instalar Maven escriba el siguiente comando en consola:
	```
	sudo apt-get install maven
	```
- Para verificar la versión:
	```
	mvn -version 
	```
- En pantalla podrá visualizar lo siguiente:
	```
	Apache Maven 3.5.2
	Maven home: /usr/share/maven
	Java version: 1.8.0_191, vendor: Oracle Corporation
	Java home: /usr/lib/jvm/java-8-openjdk-amd64/jre
	Default locale: es_AR, platform encoding: UTF-8
	OS name: "linux", version: "4.15.0-42-generic", arch: "amd64", family: "unix"
	```
	
### Instalar Mysql:
- Actualice  el índice de paquetes:
	```
	sudo apt update
	```
- Instale el mysql:
	```
	sudo apt install mysql-server
	```

### Instalar Eclipse:
Vaya al siguiente link [Descargar Eclipse](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2018-09/R/eclipse-jee-2018-09-linux-gtk-x86_64.tar.gz)
 y haga clic en el botón descargar, el cúal descargará un archivo zip.
- Descomprima el archivo Zip
- Entre en la carpeta descomprimida y haga doble clic en archivo eclipse
- Si quiere tener un acceso directo a Eclipse desde el Escritorio o cualquier lugar vaya [Cree acceso directo](https://computerhoy.com/paso-a-paso/software/como-crear-accesos-directos-escritorio-ubuntu-46982) 


## Configuración del entorno

### Crear una base de datos:

Para crear una base de datos, abra una terminal o  _ctrl+alt+t_
- ejecute el siguiente comando para acceder a mysql:
	```
	mysql -u root -proot
	```
- Escriba el siguiente comando para crear la base de datos:
	```
	create database prevencionAcoso
	```
	
### Cargar datos iniciales a la base de datos:
- Primero debe abrir la base de datos que ha creado, para ello ejecute el comando:
	 ```
	 use prevencionAcoso
	 ```
		  
- Vaya a la clase DataGenerator botón derecho RunAs, opción JavaApplication
- Si quiere verificar que las tablas se han cargado correctamente ejecute:
	```
	show tables;
	```
	y en la pantalla podrá visualizar:
	
	+---------------------------+
	| Tables_in_prevencionAcoso |
	+---------------------------+
	| Telefono                  |
	+---------------------------+
	1 row in set (0.00 sec)

	
-si quiere visualizar los datos contenidos en las mismas 
	```
	select * from nombreTabla;
	```
y mostrará los datos que se encuentren cargados en el DataGenerator.

+----+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+---------------------------------------------------+---------------+
| id | descripcion                                                                                                                                                                                                                                                                                                                                   | nombre                                            | numero        |
+----+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+---------------------------------------------------+---------------+
|  1 | Si vos o alguien que conocés vive alguna situación de violencia, llamá gratis al 144 o buscá algún centro de atención cercano.                                                                                                                                                                                                                | Atención para mujeres en situación de violencia   | 144           |
|  2 | El Defensor del Pueblo es un organismo constitucional, unipersonal, autónomo e independiente que garantiza el ejercicio de los derechos de los y las habitantes de la Provincia de Buenos Aires, así como de quienes estén en tránsito por su territorio, incluyendo los de carácter cívico, político, social, económico y cultural.          | Defensoría de la Provincia de Buenos Aires        | 0800-222-5262 |
+----+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+---------------------------------------------------+---------------+
2 rows in set (0.04 sec)


### Importar el proyecto en Eclipse:

- Lo primero que debe hacer es descargar git, para ello ejecute el siguiente comando:
	```
	sudo apt-get install git
	```
- Una vez instalado, clone el repositorio que se encuentra en el siguiente [link](https://github.com/vgrana/prevencion-acoso-callejero)

- Abra Eclipse vaya a _File_
- Elija la opción _Import Projects from files System or Archive_

- En la ventana que se despliega vaya al botón _Directory_ y ahí elija la ruta en donde se encuentra el proyecto que desea importar.

- Por último haga clic en el botón _Finish_ 

### Pasos para levantar un proyecto desde Eclipse o desde consola: 

	### Pasos para levantar el proyecto con Jetty desde desde consola:

- Abra una terminal en la ubicación de su proyecto,luego ejecute el comando `mvn jetty:run`.

### Para levantar el proyecto con jetty desde eclipse:
- elija RUN del menú de eclipse, luego  elija la opción RUN CONFIGURATIONS
- buscar MAVEN BUILD
- hacer clic con botón derecho sobre MAVEN BUILD y elegir new
- en la ventana que se despliega:
	- si quiere puede en Name escribir un nombre
	- en el botón WORKSPACE elija sú proyecto
	- en donde dice Goals: escribima _jetty:run_
	- por último haga clic en el boton  _RUN_


- Independientemente de la opción elegida para levantar el proyecto, abra un navegador y escriba `localhost:8080`.
