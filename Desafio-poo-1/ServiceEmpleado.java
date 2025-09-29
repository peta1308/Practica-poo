import java.util.ArrayList;
import java.util.List;

public class ServiceEmpleado implements IempleadoService {

    List <Empleado> empleados = new ArrayList<>();

    public ServiceEmpleado(){
        empleados.add(new EmpleadoTC("123", "jose", 4000.000000000, 1));
        empleados.add(new EmpleadoMD("1234", "chicogel", 20000, 25));
    }










    @Override
    public void crearEmpleadoTiempoCompleto(Empleado empleado) {
        empleados.add(empleado);
        
    }
        

    @Override
    public void crearEmpleadoMedioTiempo(Empleado empleado) {
       
        empleados.add(empleado);
    }

    @Override
    public void listarEmpleadoTiempoCompleto() {
       
       for (Empleado e : empleados) {
        if (e instanceof EmpleadoTC) {

            System.out.println(e);
         }
       }
    }

    @Override
    public void listarEmpleadoMedioTiempo() {
       
       for (Empleado e : empleados) {
        if (e instanceof EmpleadoMD) {
            
            System.out.println(e);
        }
       }
    }

    @Override
    public Empleado buscarporId(String id) {
       
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) {
                
                return e;
            }
        }
        
        return null;
    }

}
