public class EmpleadoComosion extends  Empleado{
     double numDeComision;
    
    
	public EmpleadoComosion (String name,String apellido, String ide,int numero, double numDeComision){
        super( name, apellido,  ide, numero);
        this.numDeComision=numDeComision;
    }

    //contructor
    public EmpleadoComosion(){
        this.name = "";
		this.apellido = "";
		this.ide = "";
        this.numero = 0;
        this.numDeComision=0;
    }
    
    
    @Override 
    public void getComision_Venta(){
        numDeComision=numDeComision*(0.40);

        System.out.println("\nSu salario Total es:\n " +numDeComision );
    }

    //Empleados semanal
	public double getNumDeComision(){
        return numDeComision;
    }

    public void setNumDeComision(double numDeComision){
        this.numDeComision = numDeComision;
    }
    
    //metodos abractos vacios ya que aqui no se usan en esta clase
    public  void getSalario_Semanal(){
    }
    public  void getSueldo_Hora(){
    }
        
}