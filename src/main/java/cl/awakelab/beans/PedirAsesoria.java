package cl.awakelab.beans;

public class PedirAsesoria {
	
	private int id_asesoria;
	private String tipo_asesoria;
	private String nombre_empresa;
	private String detalle_asesoria;
	private String fecha_asesoria;
	private int id_cliente;
	private int id_profesional;
	private String estado_asesoria;
	
	
	public PedirAsesoria() {
		
	}
	
	public PedirAsesoria(int id_asesoria, String tipo_asesoria, String nombre_empresa,
						 String detalle_asesoria, String fecha_asesoria, 
						 int id_cliente) {
		
		this.id_asesoria = id_asesoria;
		this.tipo_asesoria = tipo_asesoria;
		this.nombre_empresa = nombre_empresa;
		this.detalle_asesoria = detalle_asesoria;
		this.fecha_asesoria = fecha_asesoria;
		this.id_cliente = id_cliente;		
	}
	
	public PedirAsesoria(int id_asesoria, String tipo_asesoria, String nombre_empresa,
			 String detalle_asesoria, String fecha_asesoria, 
			 int id_cliente, int id_profesional, String estado_asesoria) {

		this.id_asesoria = id_asesoria;
		this.tipo_asesoria = tipo_asesoria;
		this.nombre_empresa = nombre_empresa;
		this.detalle_asesoria = detalle_asesoria;
		this.fecha_asesoria = fecha_asesoria;
		this.id_cliente = id_cliente;
		this.id_profesional = id_profesional;
		this.estado_asesoria = estado_asesoria;
	}

	public int getId_asesoria() {
		return id_asesoria;
	}

	public void setId_asesoria(int id_asesoria) {
		this.id_asesoria = id_asesoria;
	}

	public String getTipo_asesoria() {
		return tipo_asesoria;
	}

	public void setTipo_asesoria(String tipo_asesoria) {
		this.tipo_asesoria = tipo_asesoria;
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public String getDetalle_asesoria() {
		return detalle_asesoria;
	}

	public void setDetalle_asesoria(String detalle_asesoria) {
		this.detalle_asesoria = detalle_asesoria;
	}

	public String getFecha_asesoria() {
		return fecha_asesoria;
	}

	public void setFecha_asesoria(String fecha_asesoria) {
		this.fecha_asesoria = fecha_asesoria;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_profesional() {
		return id_profesional;
	}

	public void setId_profesional(int id_profesional) {
		this.id_profesional = id_profesional;
	}

	public String getEstado_asesoria() {
		return estado_asesoria;
	}

	public void setEstado_asesoria(String estado_asesoria) {
		this.estado_asesoria = estado_asesoria;
	}
	
	
	
}	
