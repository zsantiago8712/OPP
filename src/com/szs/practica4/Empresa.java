package com.szs.practica4;


import com.szs.practica3.Empleado;
import com.szs.practica5.EmpleadoComision;
import com.szs.practica5.EmpleadoSueldoBase;


/**
 * Registra una empresa con sus empleados
 * @author Santiago Zamora
 */
public class Empresa {

    private String id;
    private String nombre;
    private String direccion;

    private Empleado[] empleadosHorasTrabajadas;
    private int numeroEmpleadosHorasTrabajadas = 0;

    private EmpleadoComision[] empleadosComision;
    private int numeroEmpleadosComision = 0;

    private EmpleadoSueldoBase[] empleadoSueldoBase;
    private int numeroEmpleadoSueldoBase = 0;

    public Empresa(String id, String nombre, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleadosHorasTrabajadas = new Empleado[10];
        this.empleadosComision = new EmpleadoComision[10];
        this.empleadoSueldoBase = new EmpleadoSueldoBase[10];
    }


    /**
     * Agrega un nuevo empleado a la  empresa
     * @param id (String)
     * @param nombre (String)
     * @param apellidos (String)
     * @param horasTrabajadas (double)
     * @param horaSueldo (double)
     */
    public void agregarEmpleadoHorasTrabajadas(String id, String nombre, String apellidos, double horasTrabajadas, double horaSueldo){

        if(this.numeroEmpleadosHorasTrabajadas < this.empleadosHorasTrabajadas.length){
            this.empleadosHorasTrabajadas[this.numeroEmpleadosHorasTrabajadas] = new Empleado(id, nombre, apellidos);
            this.empleadosHorasTrabajadas[this.numeroEmpleadosHorasTrabajadas].setHorasTrabajadas(horasTrabajadas);
            this.empleadosHorasTrabajadas[this.numeroEmpleadosHorasTrabajadas].setHoraSueldo(horaSueldo);

            this.numeroEmpleadosHorasTrabajadas += 1;
            return;
        }

        System.out.println("Ya no se pueden introducir más empleados");
    }

    public void agregarEmpleadComision(String id, String nombre, String apellidos, double sueldo, int ventas){

        if(this.numeroEmpleadosComision < this.empleadosComision.length){
            this.empleadosComision[this.numeroEmpleadosComision] = new EmpleadoComision(id, nombre, apellidos);
            this.empleadosComision[this.numeroEmpleadosComision].setSueldo(sueldo);
            this.empleadosComision[this.numeroEmpleadosComision].setVentas(ventas);

            this.numeroEmpleadosComision += 1;
            return;
        }

        System.out.println("Ya no se pueden introducir más empleados por comision");
    }


    public void agregarEmpleadoSueldoBase(String id, String nombre, String apellidos, double sueldo){

        if(this.numeroEmpleadoSueldoBase < this.empleadoSueldoBase.length){
            this.empleadoSueldoBase[this.numeroEmpleadoSueldoBase] = new EmpleadoSueldoBase(id, nombre, apellidos);
            this.empleadoSueldoBase[this.numeroEmpleadoSueldoBase].setSueldo(sueldo);

            this.numeroEmpleadoSueldoBase += 1;
            return;
        }

        System.out.println("Ya no se pueden introducir más empleados de sueldo base");
    }

    /**
     * Calcula la nomina total de la empresa
     * @return (double) -> salario de todos los empleados
     */
    public double calcularNominaTotal(){

        int i;
        double  nominaTotal = 0;
        for(i = 0; i < this.numeroEmpleadosHorasTrabajadas; i++)
            nominaTotal += this.empleadosHorasTrabajadas[i].calcularSalario();

        for(i = 0; i < this.numeroEmpleadosComision; i++)
            nominaTotal += this.empleadosComision[i].calcularSalario();

        for(i = 0; i < this.numeroEmpleadoSueldoBase; i++)
            nominaTotal += this.empleadoSueldoBase[i].calcularSalario();

        return nominaTotal;
    }


    public int getNumeroEmpleadosHorasTrabajadas(){
        return this.numeroEmpleadosHorasTrabajadas;
    }

    public int getNumeroEmpleadosComision(){
        return this.numeroEmpleadosComision;
    }

    public int getNumeroEmpleadoSueldoBase(){
        return this.numeroEmpleadoSueldoBase;
    }

    public String getNombreEmpleadosHorasTrabajadas(int numEmpleado){
        return this.empleadosHorasTrabajadas[numEmpleado].getNombre();
    }

    public String getNombreEmpleadoComision(int numEmpleado){

        return this.empleadosComision[numEmpleado].getNombre();
    }

    public String getNombreEmpleadoSueldoBase(int numEmpleado){
        return this.empleadoSueldoBase[numEmpleado].getNombre();
    }

    public double getSalarioEmpleadosHorasTrabajadas(int numEmpleado){
        if(numEmpleado < this.numeroEmpleadosHorasTrabajadas)
            return this.empleadosHorasTrabajadas[numEmpleado].calcularSalario();

        return -1;
    }

    public double getSalarioEmpleadosComision(int numEmpleado){
        if(numEmpleado < this.numeroEmpleadosComision)
            return this.empleadosComision[numEmpleado].calcularSalario();

        return -1;
    }

    public double getSalarioEmpleadoBase(int numEmpleado){
        if(numEmpleado < this.numeroEmpleadoSueldoBase)
            return this.empleadoSueldoBase[numEmpleado].calcularSalario();

        return -1;
    }

}

