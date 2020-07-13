package cl.awakelab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.beans.PedirAsesoria;

public class EmpresaDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertarAsesoria(PedirAsesoria asesoria) {
		String query = "insert into asesoria(tipo_asesoria, nombre_empresa, detalle_asesoria, fecha_asesoria, id_cliente) values('" + asesoria.getTipo_asesoria() +"','" +
						asesoria.getNombre_empresa() + "','" + asesoria.getDetalle_asesoria() + "','" + asesoria.getFecha_asesoria() + "','" + 
						asesoria.getId_cliente() + "')";
		
		return template.update(query);
	}
	
	public PedirAsesoria buscarAsesoria(int id) {
		String sql = "SELECT * FROM ASESORIA WHERE id_asesoria=?";
		
		return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<PedirAsesoria>(PedirAsesoria.class));
		
	}
	
	public List<PedirAsesoria> mostrarAsesoria(){
		
		return template.query("SELECT * FROM ASESORIA", new RowMapper<PedirAsesoria>(){
			public PedirAsesoria mapRow(ResultSet sentencia, int fila) throws SQLException {
				PedirAsesoria listaAsesoria = new PedirAsesoria();
				
				listaAsesoria.setId_asesoria(sentencia.getInt(1));
				listaAsesoria.setTipo_asesoria(sentencia.getString(2));
				listaAsesoria.setNombre_empresa(sentencia.getString(3));
				listaAsesoria.setDetalle_asesoria(sentencia.getString(4));
				listaAsesoria.setFecha_asesoria(sentencia.getString(5));
				listaAsesoria.setId_cliente(sentencia.getInt(6));
				listaAsesoria.setId_profesional(sentencia.getInt(7));
				listaAsesoria.setEstado_asesoria(sentencia.getString(8));
				
				return listaAsesoria;
			}
		});
		
	}	

}
