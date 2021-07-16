package com.roses.backend.models.entities;

import javax.persistence.*;
@Entity
@Table(name="variedades")
public class Variedad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false) 
	@Column(name="id_variedad")
	private Integer idVariedad; //Atributo que se mapea con la Primary Key
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="tamanio_boton")
	private int tamanioBoton;
	
	@Column(name="dias_florero")
	private int diasFlorero;
	
	@Column(name="numero_petalos")
	private int numeroPetalos;
	
	@Column(name="color_1")
	private String color1;
	
	@Column(name="color_2")
	private String color2;
	
	@Column(name="longitud_min")
	private int longitudMin;
	
	@Column(name="longitad_max")
	private int longitudMax;
	
	
	//Tipos de datos primitivos de Java
	//int, byte, short, long, float, double, char, boolean
	//Integer, Byte, Short, Long, Float, Double, Character, Boolean
	
	public Variedad() {
		super();
	}
	
	public Variedad(int id) {
		super();
		this.idVariedad = id;
	}

	public Integer getIdVariedad() {
		return idVariedad;
	}

	public void setIdVariedad(Integer idVariedad) {
		this.idVariedad = idVariedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanioBoton() {
		return tamanioBoton;
	}

	public void setTamanioBoton(int tamanioBoton) {
		this.tamanioBoton = tamanioBoton;
	}

	public int getDiasFlorero() {
		return diasFlorero;
	}

	public void setDiasFlorero(int diasFlorero) {
		this.diasFlorero = diasFlorero;
	}

	public int getNumeroPetalos() {
		return numeroPetalos;
	}

	public void setNumeroPetalos(int numeroPetalos) {
		this.numeroPetalos = numeroPetalos;
	}

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public int getLongitudMin() {
		return longitudMin;
	}

	public void setLongitudMin(int longitudMin) {
		this.longitudMin = longitudMin;
	}

	public int getLongitudMax() {
		return longitudMax;
	}

	public void setLongitudMax(int longitudMax) {
		this.longitudMax = longitudMax;
	}
	
	
	
}
