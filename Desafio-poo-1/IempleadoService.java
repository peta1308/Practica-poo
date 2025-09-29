public interface IempleadoService {
    void crearEmpleadoTiempoCompleto(Empleado empleado);
    void crearEmpleadoMedioTiempo(Empleado empleado);
    void listarEmpleadoTiempoCompleto();
    void listarEmpleadoMedioTiempo();
    Empleado buscarporId(String id);
}
