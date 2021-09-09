package cl.bcointer.consultasaldo.objetos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class DataInput {

	@NotNull(message = "NotNull canal")
	@Size(min=1, max=8, message = "Largo caracteres canal")
	private String canal;
	
	@NotNull(message = "NotNull numCta")
	@Size(min=01, max=19, message = "Largo caracteres numCta")
	private String num_cta_tar;
	
	@NotNull(message = "NotNull secuenciaTarjeta")
	@Size(min=4, max=4, message = "Largo caracteres secuenciaTarjeta")
	private String secuencia_tarjeta;

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getNum_cta_tar() {
		return num_cta_tar;
	}

	public void setNum_cta_tar(String num_cta_tar) {
		this.num_cta_tar = num_cta_tar;
	}

	public String getSecuencia_tarjeta() {
		return secuencia_tarjeta;
	}

	public void setSecuencia_tarjeta(String secuencia_tarjeta) {
		this.secuencia_tarjeta = secuencia_tarjeta;
	}

	public DataInput(String canal, String id_emisor_servicio, String idRequerimiento, String num_cta_tar,
			String secuencia_tarjeta) {
		super();
		this.canal = canal;
		this.num_cta_tar = num_cta_tar;
		this.secuencia_tarjeta = secuencia_tarjeta;
	}

	public DataInput() {
		super();
	}
	
	
	
	
	
	
}