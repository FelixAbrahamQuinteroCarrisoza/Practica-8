public class EmpleadoHoras extends  Empleado{
    float numDeHoras;
     float numDeExtras;

	public EmpleadoHoras (String name,String apellido, String ide,int numero, float numDeHoras,float numDeExtras){
        super( name, apellido,  ide, numero);
        this.numDeHoras=numDeHoras;
        this.numDeExtras=numDeExtras;
    }

    //contructor
    public EmpleadoHoras(){
        this.name = "";
		this.apellido = "";
		this.ide = "";
        this.numero = 0;
        this.numDeHoras=0;
        this.numDeExtras=0;
    }
    
    
    @Override 
    public void getSueldo_Hora(){
        numDeHoras=numDeHoras*100;
        if(numDeExtras>0){
            numDeExtras=numDeExtras*200;
            numDeHoras=numDeHoras+numDeExtras;
        }

        System.out.println("\nSu salario Total es:\n " +numDeHoras );
    }

    //Empleados por horas
	public float getNumDeHoras(){
        return numDeHoras;
    }

    public void setNumDeHoras(float numDeHoras){
        this.numDeHoras = numDeHoras;
    }

    //Empleados por horas
	public float getNumDeExtras(){
        return numDeExtras;
    }

    public void setNumDeExtras(float numDeExtras){
        this.numDeExtras = numDeExtras;
    }

    //metodos abractos vacios ya que aqui no se usan en esta clase
    public  void getSalario_Semanal(){
    }
    public  void getComision_Venta(){
    } 
    
        
}