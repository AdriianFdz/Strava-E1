/**
 * This code is based on solutions provided by ChatGPT 4o and 
 * adapted using GitHub Copilot. It has been thoroughly reviewed 
 * and validated to ensure correctness and that it is free of errors.
 */
package es.deusto.sd.strava.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
	private int id;
	private String email;
	private String nombre;
	private long fechaNacimiento;
	private double peso;
	private int altura;
	private int frecuenciaCardiacaMax;
	private int frecuenciaCardiacaReposo;
	private ServidorAuth servidorAuth;
	
	private List<Entrenamiento> entrenamientos = new ArrayList<>();
	private List<Reto> retosAceptados = new ArrayList<>();
	
	// Constructor without parameters
	public Usuario() { }
	
	public Usuario(int id, String email, String nombre, long fechaNacimiento, double peso, int altura, int frecuenciaCardiacaMax, int frecuenciaCardiacaReposo, ServidorAuth servidorAuth) {
		this.id = id;
		this.email = email;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.altura = altura;
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
		this.frecuenciaCardiacaReposo = frecuenciaCardiacaReposo;
		this.servidorAuth = servidorAuth;
	}

	
	// Getters and Setters
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(long fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getFrecuenciaCardiacaMax() {
		return frecuenciaCardiacaMax;
	}

	public void setFrecuenciaCardiacaMax(int frecuenciaCardiacaMax) {
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
	}

	public int getFrecuenciaCardiacaReposo() {
		return frecuenciaCardiacaReposo;
	}

	public void setFrecuenciaCardiacaReposo(int frecuenciaCardiacaReposo) {
		this.frecuenciaCardiacaReposo = frecuenciaCardiacaReposo;
	}

	public List<Entrenamiento> getEntrenamientos() {
		return entrenamientos;
	}
	
	public void addEntrenamiento(Entrenamiento entrenamiento) {
		this.entrenamientos.add(entrenamiento);
	}
	
	public List<Reto> getRetosAceptados() {
		return retosAceptados;
	}
	
	public void addRetosAceptados(Reto retoAceptado) {
		this.retosAceptados.add(retoAceptado);
	}
	
	public ServidorAuth getServidorAuth() {
		return servidorAuth;
	}
	
	public void setServidorAuth(ServidorAuth servidorAuth) {
		this.servidorAuth = servidorAuth;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(altura, email, entrenamientos, fechaNacimiento, frecuenciaCardiacaMax,
				frecuenciaCardiacaReposo, id, nombre, peso, retosAceptados, servidorAuth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(email, other.email) && Objects.equals(entrenamientos, other.entrenamientos)
				&& fechaNacimiento == other.fechaNacimiento && frecuenciaCardiacaMax == other.frecuenciaCardiacaMax
				&& frecuenciaCardiacaReposo == other.frecuenciaCardiacaReposo && id == other.id
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Objects.equals(retosAceptados, other.retosAceptados) && servidorAuth == other.servidorAuth;
	}	
	
	
}