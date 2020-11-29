public abstract class Empleado{
    public static String name;
    public static String apellido;
	public static String ide;
	public static int numero;
    
    public abstract void getSalario_Semanal();
    public abstract void getSueldo_Hora();
    public abstract void getComision_Venta();

	public Empleado (String name,String apellido, String ide,int numero){
		this.name = name;
		this.apellido = apellido;
		this.ide = ide;
		this.numero = numero;
    }
    
    public Empleado (){
		this.name = "";
		this.apellido = "";
		this.ide = "";
		this.numero = 0;
	}
	
	
	//nombre
	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    //Apellido
	public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    //identifiacion de empresa
	public String getIde(){
        return ide;
    }

    public void setIde(String ide){
        this.ide = ide;
    }
    
     //Numero de telefono
	public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
	}

	
	
}