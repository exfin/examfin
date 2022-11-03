import java.util.Arrays;

public class AgenteMercado {
	private long ida;
	private String nombre;
	private PlantaGeneracion[] plantaGeneracion;
	private String ciudad;
	private String presidente;
	private double dineroDisponible;
	public AgenteMercado(long ida, String nombre, PlantaGeneracion[] plantaGeneracion, String ciudad, String presidente,
			double dineroDisponible) {
		super();
		this.ida = ida;
		this.nombre = nombre;
		this.plantaGeneracion = plantaGeneracion;
		this.ciudad = ciudad;
		this.presidente = presidente;
		this.dineroDisponible = dineroDisponible;
	}
	public long getId() {
		return ida;
	}
	public void setId(long ida) {
		this.ida = ida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public PlantaGeneracion[] getPlantaGeneracion() {
		return plantaGeneracion;
	}
	public void setPlantaGeneracion(PlantaGeneracion[] plantaGeneracion) {
		this.plantaGeneracion = plantaGeneracion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public double getDineroDisponible() {
		return dineroDisponible;
	}
	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
	@Override
	public String toString() {
		return "AgenteMercado [id=" + ida + ", nombre=" + nombre + ", plantaGeneracion="
				+ Arrays.toString(plantaGeneracion) + ", ciudad=" + ciudad + ", presidente=" + presidente
				+ ", dineroDisponible=" + dineroDisponible + "]";
	}
	public void comprarNuevaPlanta(PlantaGeneracion a) {
		
	}
	
	
	
	
	

}
