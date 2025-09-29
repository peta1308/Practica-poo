public class EmpleadoMD extends Empleado {

  private int horastrabajadas;
  
  
    public EmpleadoMD(String id, String nombre, double salario, int horastrabajadas) {
        super(id, nombre, salario);
        this.horastrabajadas = horastrabajadas;
    }

    
    public int getHorastrabajadas() {return horastrabajadas;}
    public void setHorastrabajadas(int horastrabajadas) { this.horastrabajadas = horastrabajadas; }
    
    @Override
    public String toString() {
       
        return "id: " + getId() + "- nombre: " + getNombre() + 
        "- salario: " + getSalario() + "- horastrabajadas: " + getHorastrabajadas();
    }
}
