package ar.edu.unqsarmiento.ingsw.prevencionacoso.controllers;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unqsarmiento.ingsw.prevencionacoso.modelo.Telefono;

public class InformacionController {
	List<Telefono> telefonos;
	
	public InformacionController() {
		Telefono telefono = new Telefono();
		telefono.setNombre("Atención para mujeres en situación de violencia");
		telefono.setDescripcion("Si vos o alguien que conocés vive alguna situación de violencia, llamá gratis al 144 o buscá algún centro de atención cercano.");
		telefono.setNumero("144");

		Telefono telefono2 = new Telefono();
		telefono2.setNombre("Defensoría de la Provincia de Buenos Aires");
		telefono2.setDescripcion("El Defensor del Pueblo es un organismo constitucional, unipersonal, autónomo e independiente que garantiza el ejercicio de los derechos de los y las habitantes de la Provincia de Buenos Aires, así como de quienes estén en tránsito por su territorio, incluyendo los de carácter cívico, político, social, económico y cultural. ");
		telefono2.setNumero("0800-222-5262");
		
		telefonos = new ArrayList<Telefono>();
		telefonos.add(telefono);
		telefonos.add(telefono2);
	}
}
