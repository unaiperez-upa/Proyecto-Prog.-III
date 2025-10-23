package domain;

import java.util.Date;

public class Admin {
	
	private String rol;
	private Date fechaContratacion;
	private boolean permisoTotal;
	
	
	public Admin() {
		super();
	}


	public Admin(String rol, Date fechaContratacion, boolean permisoTotal) {
		super();
		this.rol = rol;
		this.fechaContratacion = fechaContratacion;
		this.permisoTotal = permisoTotal;
	}
	
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public boolean isPermisoTotal() {
		return permisoTotal;
	}

	public void setPermisoTotal(boolean permisoTotal) {
		this.permisoTotal = permisoTotal;
	}


	@Override
	public String toString() {
		return "Admin [rol=" + rol + ", fechaContratacion=" + fechaContratacion + ", permisoTotal=" + permisoTotal
				+ "]";
	}

	
}
