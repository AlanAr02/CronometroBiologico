package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Consultas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fechaCreacion;
    private String fechaTurno;
    private String descripcion;
    @ManyToOne
    private Medico medico;
    private String nombrePaciente;
    private int edadPaciente;
    @ManyToOne
    private ObraSociales tieneObraSocialPaciente;
    private String nombreRecepcionista;

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public ObraSociales getTieneObraSocialPaciente() {
        return tieneObraSocialPaciente;
    }

    public void setTieneObraSocialPaciente(ObraSociales tieneObraSocialPaciente) {
        this.tieneObraSocialPaciente = tieneObraSocialPaciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(String fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreRecepcionista() {
        return nombreRecepcionista;
    }

    public void setNombreRecepcionista(String nombreRecepcionista) {
        this.nombreRecepcionista = nombreRecepcionista;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
