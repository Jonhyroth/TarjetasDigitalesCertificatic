package Y.model;

public class Tarjeta {
	private String nombreEntidad;
	private String numeroTrajeta;
	private  String fechaCaducidad;
	private String nombreTitular;
	private String cvv;
	private MarcaEnum  marca;
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public String getNumeroTrajeta() {
		return numeroTrajeta;
	}
	public void setNumeroTrajeta(String numeroTrajeta) {
		this.numeroTrajeta = numeroTrajeta;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public MarcaEnum getMarca() {
		return marca;
	}
	public void setMarca(MarcaEnum marca) {
		this.marca = marca;
	}
	
}
