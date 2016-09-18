package pe.com.ruta.distribucion.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionRs<T> {

	@JsonProperty("codRpta")
	private String codigoError = "0000";

	@JsonProperty("desRpta")
	private String descripcion = "Respuesta Exitosa";

	@JsonProperty("detRpta")
	@JsonInclude(Include.NON_NULL)
	private T respuesta;

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public T getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(T respuesta) {
		this.respuesta = respuesta;
	}
}
