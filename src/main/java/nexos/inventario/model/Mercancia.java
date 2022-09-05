package nexos.inventario.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mercancia")
public class Mercancia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String nombre;
    private String porducto;
    private Integer cantidad;
    
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario_creacion")
    private Usuario usuarioCreacion;
    
    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario_actualizacion")
    private Usuario usuarioActualizacion;

	public Mercancia() {
	}
	
	
	

	public Mercancia(String nombre, String porducto, Integer cantidad, Date fechaIngreso, Usuario usuarioCreacion,
			Date fechaActualizacion, Usuario usuarioActualizacion) {
		super();
		this.nombre = nombre;
		this.porducto = porducto;
		this.cantidad = cantidad;
		this.fechaIngreso = fechaIngreso;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPorducto() {
		return porducto;
	}

	public void setPorducto(String porducto) {
		this.porducto = porducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Usuario getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(Usuario usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Usuario getUsuarioActualizacion() {
		return usuarioActualizacion;
	}

	public void setUsuarioActualizacion(Usuario usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	
	
	
    
    

}
