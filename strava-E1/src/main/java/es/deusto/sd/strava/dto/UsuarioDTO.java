package es.deusto.sd.strava.dto;

import es.deusto.sd.strava.entity.ServidorAuth;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UsuarioDTO {
    @NotBlank(message = "El correo es obligatorio")
    private String email;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private long fechaNacimiento;
    
    @NotNull(message = "El servidor de autenticación es obligatorio")
    private ServidorAuth servidorAuth;
    
    // Campos opcionales
    private double peso;
    private int altura;
    private int frecuenciaCardiacaMax;
    private int frecuenciaCardiacaReposo;

    // Constructor sin argumentos
	public UsuarioDTO() {}
    
    //Constructor con argumentos
	public UsuarioDTO(String email, String nombre, long fechaNacimiento, double peso, int altura,
			int frecuenciaCardiacaMax, int frecuenciaCardiacaReposo, ServidorAuth servidorAuth) {
		this.email = email;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.altura = altura;
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
		this.frecuenciaCardiacaReposo = frecuenciaCardiacaReposo;
		this.servidorAuth = servidorAuth;
	}    
	
    // Getters y setters
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
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
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
	public void setFrecuenciaCardiacaMax(int frecuenciaCardiacaMaxima) {
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMaxima;
	}
	public int getFrecuenciaCardiacaReposo() {
		return frecuenciaCardiacaReposo;
	}
	public void setFrecuenciaCardiacaReposo(int frecuenciaCardiacaReposo) {
		this.frecuenciaCardiacaReposo = frecuenciaCardiacaReposo;
	}
	public ServidorAuth getServidorAuth() {
		return servidorAuth;
	}
	public void setServidorAuth(ServidorAuth servidorAuth) {
		this.servidorAuth = servidorAuth;
	}
    
}
