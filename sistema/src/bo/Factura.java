package bo;

import java.util.Date;
import java.util.List;

public class Factura extends PersistentObject {

	private String estado;		 // PAGADA / SALDO PEND.
	
	private Date fecha; 
	
	private Long numero;
	
	private String tipo;
	
	private Double monto;
	
	private String medioDePago;
	
	private List<Producto> productos;
	
}
