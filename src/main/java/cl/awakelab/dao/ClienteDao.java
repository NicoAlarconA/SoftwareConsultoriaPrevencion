package cl.awakelab.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.beans.Cliente;

public class ClienteDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertar(Cliente cliente) {
		String sql ="INSERT INTO CLIENTE (nombre_cliente, rut_cliente, rubro_cliente, direccion_cliente, fono_cliente, email_cliente) values('" 
				+cliente.getNombre_cliente() + "', '" + cliente.getRut_cliente() + "','" + 
				cliente.getRubro_cliente() + "','" + cliente.getDireccion_cliente() + "','" + 
				cliente.getFono_cliente() + "','" + cliente.getEmail_cliente() + "')";
		
		return template.update(sql);
	}
	
	public int actualizar(Cliente cliente) {
		String sql = "UPDATE CLIENTE SET nombre_cliente='"+ cliente.getNombre_cliente() + 
				  "', rut_cliente='" + cliente.getRut_cliente() + 
				  "', rubro_cliente='" + cliente.getRubro_cliente() + 
				  "', direccion_cliente='" + cliente.getDireccion_cliente() + 
				  "', fono_cliente='" + cliente.getFono_cliente() + 
				  "', email_cliente='" + cliente.getEmail_cliente() +
				  "' WHERE id_cliente='" + cliente.getId_cliente()+"'";
		
		return template.update(sql);
		
	}
	
	public int borrar (int id) {
		String sql = "DELETE from CLIENTE WHERE id_cliente='" + id + "'";
		
		return template.update(sql);
	} 
	
	public Cliente buscarCliente(int id) {
		String sql = "SELECT * FROM CLIENTE WHERE id_cliente=?";
		
		return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Cliente>(Cliente.class));
		
	}
	
	public List<Cliente> mostrarCliente(){
		
		return template.query("SELECT * FROM CLIENTE", new RowMapper<Cliente>(){
			public Cliente mapRow(ResultSet sentencia, int fila) throws SQLException {
				Cliente listaCliente = new Cliente();
				
				listaCliente.setId_cliente(sentencia.getInt(1));
				listaCliente.setNombre_cliente(sentencia.getString(2));
				listaCliente.setRut_cliente(sentencia.getString(3));
				listaCliente.setRubro_cliente(sentencia.getString(4));
				listaCliente.setDireccion_cliente(sentencia.getString(5));
				listaCliente.setFono_cliente(sentencia.getInt(6));
				listaCliente.setEmail_cliente(sentencia.getString(7));
				
				return listaCliente;
			}
		});
		
	}	

}
