package bo;

import java.util.Date;

public class MovimientoStock extends PersistentObject {

	private Date fecha;
	
	private Integer cantidad;
	
	private Producto producto;
	
	private Entrega entrega;
	
}
