🧾 Ejercicio Propuesto — Gestión de Empleados
📌 Requerimientos

Clase Empleado (padre):

Atributos privados:


<private String id;
private String nombre;
private double salario;>


<Constructor con parámetros y getters/setters.>

Clases hijas:

<EmpleadoTiempoCompleto:>

<Atributo adicional: int horasExtras.>

<Implementar toString() para mostrar todos los atributos.>

<EmpleadoMedioTiempo:>

<Atributo adicional: int horasTrabajadas.>

<Implementar toString() para mostrar todos los atributos.>

<Interface IEmpleadoService:>
Métodos:

<void crearEmpleadoTiempoCompleto(Empleado empleado);
void crearEmpleadoMedioTiempo(Empleado empleado);
void listarEmpleadosTiempoCompleto();
void listarEmpleadosMedioTiempo();
Empleado buscarPorId(String id);>


Clase ServiceEmpleado:

<Implementa la interface.

<Guarda los empleados en una lista interna (List<Empleado>).

<Maneja los métodos de creación, listado y búsqueda.

Clase Principal App:
<Menú con las siguientes opciones:

----- Gestión de Empleados -----
1. Crear empleado de tiempo completo
2. Crear empleado de medio tiempo
3. Listar empleados de tiempo completo
4. Listar empleados de medio tiempo
5. Buscar empleado por ID
6. Salir


⚡ <Validar que el id del empleado no se repita (similar a la validación de placas en el ejercicio de vehículos).