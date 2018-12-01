package ar.edu.unqsarmiento.ingsw.prevencionacoso.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unqsarmiento.ingsw.prevencionacoso.modelo.Telefono;

@Component
@Transactional
public class DataGenerator {
	@Autowired
	private TelefonoHome telefonosHome;
	@Autowired
	private SessionFactory sessionFactory;
	
	protected void generate() {
		Telefono telefono = new Telefono();
		telefono.setNombre("Atención para mujeres en situación de violencia");
		telefono.setDescripcion("Si vos o alguien que conocés vive alguna situación de violencia, llamá gratis al 144 o buscá algún centro de atención cercano.");
		telefono.setNumero("144");

		Telefono telefono2 = new Telefono();
		telefono2.setNombre("Defensoría de la Provincia de Buenos Aires");
		telefono2.setDescripcion("El Defensor del Pueblo es un organismo constitucional, unipersonal, autónomo e independiente que garantiza el ejercicio de los derechos de los y las habitantes de la Provincia de Buenos Aires, así como de quienes estén en tránsito por su territorio, incluyendo los de carácter cívico, político, social, económico y cultural. ");
		telefono2.setNumero("0800-222-5262");
		
		Transaction ts = sessionFactory.getCurrentSession().beginTransaction();
		telefonosHome.saveOrUpdate(telefono);
		telefonosHome.saveOrUpdate(telefono2);
		ts.commit();
	}
	
	public static void main(String[] args) {
		HibernateConfiguration.crearDB = true;
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("ar.edu.unqsarmiento.ingsw.prevencionacoso", "ar.edu.unqsarmiento.ingsw.prevencionacoso.hibernate");
		ctx.refresh();
		DataGenerator dg = (DataGenerator) ctx.getBean("dataGenerator");
		dg.generate();
		
		ctx.close();
	}
}
