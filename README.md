> Incluir aquí las medallas de Waffle y Travis.

[![Waffle.io - Columns and their card count](https://waffle.io/vgrana/prevencion-acoso.svg?columns=backlog)](https://waffle.io/vgrana/prevencion-acoso)

[![Build Status](https://travis-ci.org/vgrana/prevencion-acoso.svg?branch=master)](https://travis-ci.org/vgrana/prevencion-acoso)


# Prevención acoso

## Software necesario

Explicar aquí cómo instalar lo siguiente:
* JDK 1.8
* Maven
* MySQL
* Eclipse

## Configuración del entorno

Explicar aquí cómo hacer lo siguiente:
* Crear la base de datos.
* Cargar los datos iniciales.
* Importar el proyecto en Eclipse.


## Instalar JDK 1.8:

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

## Instalar MAVEN:
- Para instalar Maven escriba el siguiente comando en consola:
	```
	sudo apt-get install maven
	```
- Para verificar la versión:
	```
	mvn -version 
	```
	
## Instalar Mysql:
- Actualice  el índice de paquetes:
	```
	sudo apt update
	```
- Instale el mysql:
	```
	sudo apt install mysql-server
	```

## Instalar Eclipse:
Vaya al siguiente link [Descargar Eclipse](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2018-09/R/eclipse-jee-2018-09-linux-gtk-x86_64.tar.gz)
 y haga clic en el boton descargar, el cúal descargará un archivo zip.
- Descomprima el archivo Zip
- Entre en la carpeta descomprimida y haga doble clic en archivo eclipse
- Si quiere tener un acceso directo a Eclipse desde el Escritorio o cualquier lugar vaya [Cree acceso directo] (https://computerhoy.com/paso-a-paso/software/como-crear-accesos-directos-escritorio-ubuntu-46982) 


## Crear una base de datos:
Para crear una base de datos, abra una terminal  ctrl+alt+t 
- ejecute el siguiente comando para acceder a mysql:
	```
	mysql -u root -proot
	```
- Escriba el siguiente comando:
	```
	create database prevencionAcoso
	```
	
## Cargar datos iniciales a la base de datos:
- Primero debe abrir la base de datos que ha creado, para ello ejecuta el comando:
	 ```
	  use prevencionAcoso;
	  ```
		  
- Vaya a la clase DataGenerator botón derecho RunAs, opción JavaApplication
- Si quiere verificar que las tablas se han cargado correctamente ejecute:
	```
	show tables;
	```
	si quiere visualizar los datos contenidos en las mismas 
	```
	select * from nombreTabla;
	```
	y mostrará los datos que se encuentren cargados en el DataGenerator.


## Importar el proyecto en Eclipse:

- Lo primero que debe hacer es descargar git, para ello ejecute el siguiente comando:

```
sudo apt-get install git
```
- Una vez instalado, clone el repositorio que se encuentra en el siguiente [link] (https://github.com/vgrana/prevencion-acoso-callejero)

- Abra Eclipse vaya a File
- Elija la opción Import Projects from files System or Archive

- En la ventana que se despliega vaya al botón Directory y ahí elija la ruta en donde se encuentra el proyecto que desea importar.

- Por último haga clic en el botón Finish 

### Pasos para levantar el proyecto con Jetty desde desde consola:

- Abra una terminal en la ubicación de su proyecto,luego ejecute el comando `mvn jetty:run`.

- Luego, abra un navegador y escriba `localhost:8080`.
