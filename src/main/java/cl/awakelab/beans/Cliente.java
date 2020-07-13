package cl.awakelab.beans;

public class Cliente {
	
	private int id_cliente;
	private String nombre_cliente;
	private String rut_cliente;
	private String rubro_cliente;
	private String direccion_cliente;
	private int fono_cliente;
	private String email_cliente;
	
	public Cliente() {
		
	}

	public Cliente(int id_cliente, String nombre_cliente, String rut_cliente, String rubro_cliente,
			String direccion_cliente, int fono_cliente, String email_cliente) {
		this.id_cliente = id_cliente;
		this.nombre_cliente = nombre_cliente;
		this.rut_cliente = rut_cliente;
		this.rubro_cliente = rubro_cliente;
		this.direccion_cliente = direccion_cliente;
		this.fono_cliente = fono_cliente;
		this.email_cliente = email_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getRut_cliente() {
		return rut_cliente;
	}

	public void setRut_cliente(String rut_cliente) {
		this.rut_cliente = rut_cliente;
	}

	public String getRubro_cliente() {
		return rubro_cliente;
	}

	public void setRubro_cliente(String rubro_cliente) {
		this.rubro_cliente = rubro_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public int getFono_cliente() {
		return fono_cliente;
	}

	public void setFono_cliente(int fono_cliente) {
		this.fono_cliente = fono_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", rut_cliente="
				+ rut_cliente + ", rubro_cliente=" + rubro_cliente + ", direccion_cliente=" + direccion_cliente
				+ ", fono_cliente=" + fono_cliente + ", email_cliente=" + email_cliente + "]";
	}
	
	

}
