package ar.edu.unqsarmiento.ingsw.prevencionacoso.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ar.edu.unqsarmiento.ingsw.prevencionacoso.hibernate.TelefonoHome;
import ar.edu.unqsarmiento.ingsw.prevencionacoso.modelo.Telefono;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Transactional
public class InformacionController {
	@Autowired
	TelefonoHome home;
	
	public List<Telefono> getTelefonos() {
		return home.all();
	}
}
