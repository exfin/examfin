import java.util.Arrays;

public class PlantaGeneracion {
	private int id;
	private String recurso;
	private String ciudadp;
	private int fechainicial;
	private String fechasmantenimiento[];
	private double factordeDisponibilidad;
	private double presupuestoMantenimiento;
	public PlantaGeneracion(int id, String recurso, String ciudadp, int fechainicial, String[] fechasmantenimiento,
			double factordeDisponibilidad, double presupuestoMantenimiento) {
		super();
		this.id = id;
		this.recurso = recurso;
		this.ciudadp = ciudadp;
		this.fechainicial = fechainicial;
		this.fechasmantenimiento = fechasmantenimiento;
		this.factordeDisponibilidad = factordeDisponibilidad;
		this.presupuestoMantenimiento = presupuestoMantenimiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecurso() {
		return recurso;
	}
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	public String getCiudadp() {
		return ciudadp;
	}
	public void setCiudad(String ciudadp) {
		this.ciudadp = ciudadp;
	}
	public int getFechainicial() {
		return fechainicial;
	}
	public void setFechainicial(int fechainicial) {
		this.fechainicial = fechainicial;
	}
	public String[] getFechasmantenimiento() {
		return fechasmantenimiento;
	}
	public void setFechasmantenimiento(String[] fechasmantenimiento) {
		this.fechasmantenimiento = fechasmantenimiento;
	}
	public double getFactordeDisponibilidad() {
		return factordeDisponibilidad;
	}
	public void setFactordeDisponibilidad(double factordeDisponibilidad) {
		this.factordeDisponibilidad = factordeDisponibilidad;
	}
	public double getPresupuestoMantenimiento() {
		return presupuestoMantenimiento;
	}
	public void setPresupuestoMantenimiento(double presupuestoMantenimiento) {
		this.presupuestoMantenimiento = presupuestoMantenimiento;
	}
	@Override
	public String toString() {
		return "PlantaGeneracion [id=" + id + ", recurso=" + recurso + ", ciudad=" + ciudadp + ", fechainicial="
				+ fechainicial + ", fechasmantenimiento=" + Arrays.toString(fechasmantenimiento)
				+ ", factordeDisponibilidad=" + factordeDisponibilidad + ", presupuestoMantenimiento="
				+ presupuestoMantenimiento + "]";
	}
	 public void realizarMantenimiento(double a) {
		 this.presupuestoMantenimiento-=a;
	 }
		
		
		
	

}
