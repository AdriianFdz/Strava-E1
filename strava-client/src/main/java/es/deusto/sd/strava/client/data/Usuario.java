/**
 * This code is based on solutions provided by Claude Sonnet 3.5 and 
 * adapted using GitHub Copilot. It has been thoroughly reviewed 
 * and validated to ensure correctness and that it is free of errors.
 */
package es.deusto.sd.strava.client.data;

public record Usuario(
	    String email,
	    String nombre,
	    long fechaNacimiento,
	    String servidorAuth,
	    double peso,
	    int altura,
	    int frecuenciaCardiacaMax,
	    int frecuenciaCardiacaReposo
	) {}