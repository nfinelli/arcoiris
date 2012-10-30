package bo;

import java.io.Serializable;
import java.util.Date;

public class PersistentObject implements Serializable {

	// TODO hacer que ID se genere automaticamente y tenga un prefijo segun el local
	private Long id;
	
	private Date timestamp;

	private Long idEmpleado;
	
	// Test commit
}
