> Incluir aquí las medallas de Waffle y Travis.

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
	```sudo apt update
	```
- Instale el paquete java requerido:
	```sudo apt install  openjdk-8-jdk
	```
- Verifique la correcta instalación de la versión ejecutando el comando:
	```java -version
	``` 

## Instalar MAVEN:
- Para instalar Maven escribimos el siguiente comando en consola:
	sudo apt-get install maven
- Para verificar la versión:
	mvn -version 

## Instalar Mysql:
- Actualice  el índice de paquetes:
	sudo apt update
- Instale el mysql:
	sudo apt install mysql-server


## Instalar Eclipse:
Ir al siguiente link: https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2018-09/R/eclipse-jee-2018-09-linux-gtk-x86_64.tar.gz
 y hacer clic en el boton descargar, el cúal nos descargará un archivo zip.
- Descomprimir el archivo Zip
- Entramos en la carpeta descomprimida y hacemos doble clic en archivo eclipse
- Si queremos tener un acceso directo a Eclipse desde el Escritorio o cualquier lugar vamos a: https://computerhoy.com/paso-a-paso/software/como-crear-accesos-directos-escritorio-ubuntu-46982 


## Crear una base de datos:
Para crear una base de datos, abrimos una terminal  ctrl+alt+t 
- ejecutamos el siguiente comando para acceder a mysql:
	```	mysql -u root -proot
	```
- Escribimos el siguiente comando:
	create database prevencionAcoso

###Cargar datos iniciales a la base de datos:
- Primero debemos abrir la base de datos que hemos creado, para ello ejecutamos el comando use prevencionAcoso;

- Vamos a la clase DataGenerator botón derecho RunAs, opción JavaApplication
- Si queremos verificar que los datos se han cargado correctamente ejecutamos:
	show tables; para ver las tablas que tiene el proyecto.
	Y luego 
	```select * from Telefono;
	```
	y nos mostrará los datos que se encuentran cargados en el DataGenerator.


## Importar el proyecto en Eclipse:
- Abrimos Eclipse vamos a File
- Elegimos la opción Import Projects from files System or Archive
- En la ventana que se despliega vamos al botón Directory y ahí elegimos la ruta en donde se encuentra el proyecto que deseamos importar.
- Por último hacemos clic en el botón Finish 



