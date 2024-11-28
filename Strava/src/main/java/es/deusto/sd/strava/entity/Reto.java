package es.deusto.sd.strava.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Reto")
public class Reto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private long fechaInicio;
	
	@Column(nullable = false)
	private long fechaFin;
	
	@Column(nullable = false)
	private double objetivo;
	
	@Enumerated(EnumType.STRING)
	private TipoObjetivo tipoObjetivo;
	
	@Enumerated(EnumType.STRING)
	private TipoDeporte deporte;
	
    @ElementCollection
    @CollectionTable(name = "participantes_Reto", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "participante")
	private List<Integer> participantes = new ArrayList<>();
	
	// Constructor without parameters
	public Reto() { }

	// Constructor with parameters
	public Reto(int id, String nombre, long fechaInicio, long fechaFin, double objetivo, TipoObjetivo tipoObjetivo,
			TipoDeporte deporte) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.tipoObjetivo = tipoObjetivo;
		this.deporte = deporte;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(long fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public long getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(long fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public double getObjetivo() {
		return objetivo;
	}
	
	public void setObjetivo(double objetivo) {
		this.objetivo = objetivo;
	}
	
	public TipoObjetivo getTipoObjetivo() {
		return tipoObjetivo;
	}
	
	public void setTipoObjetivo(TipoObjetivo tipoObjetivo) {
        this.tipoObjetivo = tipoObjetivo;
    }

	public TipoDeporte getDeporte() {
		return deporte;
	}

	public void setDeporte(TipoDeporte deporte) {
		this.deporte = deporte;
	}

	
	public List<Integer> getParticipantes() {
		return participantes;
	}

	public void addParticipantes(int idParticipante) {
		this.participantes.add(idParticipante);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deporte, fechaFin, fechaInicio, id, nombre, objetivo, participantes, tipoObjetivo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reto other = (Reto) obj;
		return deporte == other.deporte && fechaFin == other.fechaFin && fechaInicio == other.fechaInicio
				&& id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(objetivo) == Double.doubleToLongBits(other.objetivo)
				&& Objects.equals(participantes, other.participantes) && tipoObjetivo == other.tipoObjetivo;
	}
}
