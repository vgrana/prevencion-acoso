package ar.edu.unqsarmiento.ingsw.prevencionacoso.wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;

import ar.edu.unqsarmiento.ingsw.prevencionacoso.controllers.InformacionController;
import ar.edu.unqsarmiento.ingsw.prevencionacoso.modelo.Telefono;

public class InformacionPage extends LayoutPage {
	InformacionController controller;
	
	public InformacionPage() {
		this.controller = new InformacionController();
		this.listadoTelefonos();
	}
	
	public void listadoTelefonos() {
		this.add(new ListView<Telefono>("telefonos", new PropertyModel<>(this.controller, "telefonos")) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<Telefono> item) {
				Telefono numeroTelefono = item.getModelObject();
				CompoundPropertyModel<Telefono> telefono = new CompoundPropertyModel<>(numeroTelefono);
				item.add(new Label("nombre", telefono.bind("nombre")));
				item.add(new Label("descripcion", telefono.bind("descripcion")));
				item.add(new ExternalLink("numero", numeroTelefono.getLink(), numeroTelefono.getNumero()));
			}
		});
	}
}
