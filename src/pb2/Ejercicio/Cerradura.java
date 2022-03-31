package pb2.Ejercicio;

public class Cerradura {

	private Integer clave;
	private Boolean estadoApertura;
	private Integer codigoApertura;
	
	
	public Cerradura() {
		estadoApertura=Boolean.FALSE;
		codigoApertura=0000;
	}
	
	public Boolean getEstadoApertura() {
		return estadoApertura;
	}

	public void setEstadoApertura(Boolean estadoApertura) {
		this.estadoApertura = estadoApertura;
	}
	
	public void setCodigoApertura(Integer codigoApertura) {
		this.codigoApertura = codigoApertura;
	}
	
	
	public void cerrar() {
		estadoApertura=Boolean.FALSE;
	}

	public void cerrar(Integer codigoApertura) {
		estadoApertura=Boolean.FALSE;
		this.codigoApertura=codigoApertura;
	}

	/*
	public boolean abrir(Integer codigoIngresado) {
		if (this.codigoApertura==codigoApertura) {
			estadoApertura=Boolean.TRUE;
		}
		
	}
	*/

}
