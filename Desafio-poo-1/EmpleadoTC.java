public class EmpleadoTC extends Empleado{

    private int horasextra;

   

    public EmpleadoTC(String id, String nombre, double salario, int horasextra) {
        super(id, nombre, salario);
        this.horasextra = horasextra;
    }
    
    public int getHorasextra() {return horasextra;}
    public void setHorasextra(int horasextra) { this.horasextra = horasextra;}


    @Override
    public String toString() {
       
        return "id: " + getId() + " nombre: " + getNombre() + 
        " salario: " + getSalario() + " horasextra: " + getHorasextra();
    }



}
