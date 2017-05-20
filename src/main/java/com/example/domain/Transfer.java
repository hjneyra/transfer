package com.example.domain;

import java.util.Date;

public class Transfer {
	private Double monto;
	private Account origen;
	private Account destino;
	private Date fecha;

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Account getOrigen() {
		return origen;
	}

	public void setOrigen(Account origen) {
		this.origen = origen;
	}

	public Account getDestino() {
		return destino;
	}

	public void setDestino(Account destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
