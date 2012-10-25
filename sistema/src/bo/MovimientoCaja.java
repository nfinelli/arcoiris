package bo;

import java.util.Date;

public class MovimientoCaja extends PersistentObject {

	private Date fecha;
	
	private String origen;	// EFECTIVO / CHEQUE / TARJETA / FINANCIERA / AJUSTE / ARQUEO / VENTA
	
	private String monto;
	
	private Venta venta;
	
	private Entrega entrega;
	
}
