import java.util.Scanner;

public class PagosDeEmpleados {
    public static void main(String[] args) {
    
    EmpleadoSemanal Semanal = new EmpleadoSemanal();
    EmpleadoHoras Horas = new EmpleadoHoras();
    EmpleadoComosion Comision = new EmpleadoComosion();

 
    
    Scanner Teclado= new Scanner(System.in);
    int opcion=0;
    
    do{
    System.out.println("\n-------MENU PRINCIPAL------\n"); 
        System.out.println("\n--PAGOS DE EMPLEADOS: "); 
        System.out.println("1--EMPLEADO ASALARIADO: ");
        System.out.println("2--EMPLEADO DE PAGO POR HORAS DE TRABAJO: ");
        System.out.println("3--EMPLEADO POR COMISION: ");
        System.out.println("4--EMPLEADO ASALARIADO y COMISION: ");
        System.out.println("5--MENU DE PAGOS: ");
        System.out.println("6--Salir: ");
        
        System.out.println("\n Introduce el numero del menu:");
        opcion=Teclado.nextInt();
        System.out.println("\n ");

        if(opcion==1){

            System.out.println("\n---------------INGRESA TUS DATOS------------");

            System.out.println("\nIngresa tus nombres: ");  
            Scanner inName = new Scanner(System.in);
            Semanal.setName(inName.next());
    
            System.out.println("\nIngresa tus apellidos : ");  
            Scanner inApellido = new Scanner(System.in);
            Semanal.setApellido(inApellido.next());
    
            System.out.println("\nIngresa tu identificacion de empresa: ");  
            Scanner inIde = new Scanner(System.in);
            Semanal.setIde(inIde.next());
    
            System.out.println("\nIngresa tu numero telefonico: ");   
            Scanner inNumero = new Scanner(System.in);
            Semanal.setNumero(inNumero.nextInt());
            
            System.out.println("\nIngresa las semanas que se cobraran: ");  
            Scanner inNumDeSemanas = new Scanner(System.in);
            Semanal.setNumDeSemanas(inNumDeSemanas.nextFloat());
            
            Semanal.getSalario_Semanal();
        }
        else if(opcion==2){
            
            System.out.println("\n---------------INGRESA TUS DATOS------------");

            System.out.println("\nIngresa tus nombres: ");  
            Scanner inName = new Scanner(System.in);
            Horas.setName(inName.next());
    
            System.out.println("\nIngresa tus apellidos : ");  
            Scanner inApellido = new Scanner(System.in);
            Horas.setApellido(inApellido.next());
    
            System.out.println("\nIngresa tu identificacion de empresa: ");
            Scanner inIde = new Scanner(System.in);
            Horas.setIde(inIde.next());
    
            System.out.println("\nIngresa tu numero telefonico: ");   
            Scanner inNumero = new Scanner(System.in);
            Horas.setNumero(inNumero.nextInt());
            
            System.out.println("\nIngresa las horas que se realizaron: ");  
            Scanner inNumDeHoras = new Scanner(System.in);
            Horas.setNumDeHoras(inNumDeHoras.nextFloat());

            System.out.println("\nIngresa si se realizaron horas extras: ");  
            Scanner inNumDeExtras = new Scanner(System.in);
            Horas.setNumDeExtras(inNumDeExtras.nextFloat());
            
            Horas.getSueldo_Hora();
        }
         else if(opcion==3){

            System.out.println("\n---------------INGRESA TUS DATOS------------");

            System.out.println("\nIngresa tus nombres: ");  
            Scanner inName = new Scanner(System.in);
            Comision.setName(inName.next());
    
            System.out.println("\nIngresa tus apellidos : ");  
            Scanner inApellido = new Scanner(System.in);
            Comision.setApellido(inApellido.next());
    
            System.out.println("\nIngresa tu identificacion de empresa: ");
            Scanner inIde = new Scanner(System.in);
            Comision.setIde(inIde.next());
    
            System.out.println("\nIngresa tu numero telefonico: ");  
            Scanner inNumero = new Scanner(System.in);
            Comision.setNumero(inNumero.nextInt());
            
            System.out.println("\nIngresa la cantidad total de sus ventas: ");  
            Scanner inNumDeComision = new Scanner(System.in);
            Comision.setNumDeComision(inNumDeComision.nextDouble());
            
            Comision.getComision_Venta();
        }
        else if(opcion==4){
            
            System.out.println("\nIngresa tus nombres: ");  
            Scanner inName = new Scanner(System.in);
            Semanal.setName(inName.next());
    
            System.out.println("\nIngresa tus apellidos : ");  
            Scanner inApellido = new Scanner(System.in);
            Semanal.setApellido(inApellido.next());
    
            System.out.println("\nIngresa tu identificacion de empresa: "); 
            Scanner inIde = new Scanner(System.in);
            Semanal.setIde(inIde.next());
    
            System.out.println("\nIngresa tu numero telefonico: ");  
            Scanner inNumero = new Scanner(System.in);
            Semanal.setNumero(inNumero.nextInt());
             
            System.out.println("\nIngresa las semanas que se cobraran: ");  
            Scanner inNumDeSemanas = new Scanner(System.in);
            Semanal.setNumDeSemanas(inNumDeSemanas.nextFloat());

            System.out.println("\nIngresa la cantidad total de sus ventas: ");  
            Scanner inNumDeComision = new Scanner(System.in);
            Comision.setNumDeComision(inNumDeComision.nextDouble());

            Semanal.getSalario_Semanal();
            Comision.getComision_Venta();
        }
        else if(opcion==5){
            System.out.println("\n--PAGOS DE EMPLEADOS: "); 
            System.out.println("1--EMPLEADO ASALARIADO---> por semana es 2500 pesos: ");
            System.out.println("2--EMPLEADO DE PAGO POR HORAS DE TRABAJO---->por hora son 100 pesos ");
            System.out.println("las horas extras son despues de cumplir las 40 horas , pagando como extras esas horas con 200 pesos");
            System.out.println("4--EMPLEADO POR COMISION---->se le aplicara un 40 porciento a la cantidad de ventas la cual ese sera su pago total ");
            
        }

    }while(opcion<6);
    

 }
}
