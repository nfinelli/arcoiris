package bo;

public class Entrega extends PersistentObject {
	
	private String estado; 	// ENTREGADA / PENDIENTE DE ENTREGA
	
	private Venta venta; 
	 
	private Double costo; 
	
	private String fletero;
	
	private String contacto;
	
	private String telefono;
	
	private String direccion;
	
	private MovimientoStock movimientoStock;
	
}
