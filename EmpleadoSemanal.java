public class EmpleadoSemanal extends Empleado{
     float numDeSemanas;
    
	public EmpleadoSemanal (String name,String apellido, String ide,int numero, float numDeSemanas){
        super( name, apellido,  ide, numero);
        this.numDeSemanas=numDeSemanas;
    }

    //contructor
    public EmpleadoSemanal(){
        this.name = "";
		this.apellido = "";
		this.ide = "";
        this.numero = 0;
        this.numDeSemanas=0;
    }
    
    
    @Override 
    public void getSalario_Semanal(){
        numDeSemanas=numDeSemanas*2500;
        System.out.println("\nSu salario Total es:\n " +numDeSemanas );
    }
    
    
    //Empleados semanal
	public float getNumDeSemanas(){
        return numDeSemanas;
    }

    public void setNumDeSemanas(float numDeSemanas){
        this.numDeSemanas = numDeSemanas;
    }
    
    //metodos abractos vacios ya que aqui no se usan en esta clase
    public  void getSueldo_Hora(){
    }
    public  void getComision_Venta(){
    }    
}