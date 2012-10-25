package bo;

import java.util.Date;

public class Venta extends PersistentObject {

	private Date fecha;
	
	private Cliente cliente;
	
	private Factura factura;
	
	private Entrega entrega;
	
	private String retiro; 	 // INMEDIATO / PACTADO
	
	private String estado;	 // ACTIVA / TERMINADA
	
	private MovimientoCaja movimientoCaja;
	
}
