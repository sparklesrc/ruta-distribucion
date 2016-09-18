package pe.com.ruta.distribucion.model;

public class DistribuidoRq {

	private String numero;
	private String apellido;
	private String nombre;
	private String sede;
	private String cantNuevo;
	private String catDevolucion;
	private String dia;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCantNuevo() {
		return cantNuevo;
	}

	public void setCantNuevo(String cantNuevo) {
		this.cantNuevo = cantNuevo;
	}

	public String getCatDevolucion() {
		return catDevolucion;
	}

	public void setCatDevolucion(String catDevolucion) {
		this.catDevolucion = catDevolucion;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
