import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceEmpleado s = new ServiceEmpleado();
    
       while (true) {
        
        System.out.println("---- bienvenido al menu principal");
        System.out.println("1. Crear empleado de tiempo completo");
        System.out.println("2. Crear empleado de medio tiempo ");
        System.out.println("3. Listar empleados de tiempo completo");
        System.out.println("4. Listar empleados de medio tiempo");
        System.out.println("5. Buscar empleado por ID");
        System.out.println("6. salir pa fuera ");

        System.out.print(" igrese su humilde pero innecesaria opcion: ");
        int op = sc.nextInt();
        
    
        switch (op) {
            case 1:
                sc.nextLine();
                System.out.print("ingrese id: ");
                String id = sc.nextLine();

                System.out.print("ingrese el nombre de la basura : ");
                String nombre = sc.nextLine();

                System.out.print("ingresa la miseria q le vamos a pagar :");
                double plata = sc.nextDouble();

                System.out.print("ingresa el tiempo extra de esclavitud: ");
                int time = sc.nextInt();
                
                s.crearEmpleadoTiempoCompleto(new EmpleadoTC(id, nombre, plata, time));
                 System.out.println("nuevo esclavo adquirido");
                
                
                break;
            case 2:
                sc.nextLine();
                System.out.print("ingrese id: ");
                String id2 = sc.nextLine();

                System.out.print("ingrese el nombre de la basura : ");
                String nombre2 = sc.nextLine();

                System.out.print("ingresa la miseria q le vamos a pagar :");
                double plata2 = sc.nextDouble();

                System.out.print("ingrese las horastrabajadas del esclavo: ");
                int time2 = sc.nextInt();
                
                s.crearEmpleadoMedioTiempo(new EmpleadoMD(id2, nombre2, plata2, time2));
                System.out.println("nuevo esclavo adquirido");
                 
                break;
            case 3:
                s.listarEmpleadoTiempoCompleto();
                break;
            case 4:
                s.listarEmpleadoMedioTiempo();
                break;
            case 5:
                sc.nextLine();
                System.out.print("ingrese id:");
                String id3 = sc.nextLine();
                Empleado e = s.buscarporId(id3);
                System.out.println(e);              
            default:
                break;
        }
       
    }
   
    }
    
    

}