package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="analisissalida")
public class AnalisisSalida {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="cantidadbebidas")
	private int cantidadbebidas;
	@Column(name="porcentajetotal")
	private int porcentajetotal;	//va a ser el porcentaje de la bebida
	@Column(name="total")
	private int total;  //esto lo borraremos por lo que conversamos el martes
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idpersona")
	private Persona persona;
	
	//PROBLEMA DE NO SABER COMO PONER MAS DE UNA BEBIDA EN EL ANALISIS
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idbebida")
	private Bebida bebida;

	public AnalisisSalida() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadbebidas() {
		return cantidadbebidas;
	}

	public void setCantidadbebidas(int cantidadbebidas) {
		this.cantidadbebidas = cantidadbebidas;
	}

	public int getPorcentajetotal() {
		return porcentajetotal;
	}

	public void setPorcentajetotal(int porcentajetotal) {
		this.porcentajetotal = porcentajetotal;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	
}
