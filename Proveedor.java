package misClases;

public class Proveedor {
	/*Author Nordevelop
	 * 
	 *Repositorio https://github.com/Nordevelop/Stock/Proveedores.java
	  *Clase proveedores
	 *objetos de la clase Proveedores emcapsulado con Acceso Denegado en clase Main()
     *detalle del Proveedor_-...
     */
    private int id_proveedor;
    private String razon_social;
    private String nombre_corred_proveedor;
    private String apellido_corred_proveedor;
    private int cuit_proveedor;	
    private String calle_proveedor;
    private int altura_proveedor;
    private String loc_proveedor;
    //metodos de asignacion del detalle info de proveedores
    public int asignar_id_proveedores()
	{
		return this.id_proveedor; //devolver
	}
	public String asignar_nombre_proveedor()  //metodo 
	{
		return this.nombre_corred_proveedor;
	}
  public String asignar_apellido_corred_proveedor()
  {
    return this.apellido_corred_proveedor;
  }
  public String asignar_calle_proveedor()
  {
    return this.calle_proveedor;
  }
  public int asignar_altura_proveedor()
  {
    return this.altura_proveedor;
  }
  public String asignar_loc_proveedor()
  {
    return this.loc_proveedor; 
  }
//metodos de inserccion detalle de info de proveedores
  public void insert_id_proveedor(int n)
	{
		this.id_proveedor=n;
	}
  public void insert_nombre_corred_proveedor(String o)
  {
	   this.nombre_corred_proveedor=o;
  }
  
  public void insert_apellido_corred_proveedor(String p)
  {
	   this.apellido_corred_proveedor=p;
  }
  public void  insert_cuit_proveedor(int q)
  {
	  this.cuit_proveedor=q;
  }
  public void insert_calle_proveedor(String r)
  {
	  this.calle_proveedor=r;
  }
  public void insert_altura_proveedor(int s)
  {
	  this.altura_proveedor=s;
  }
  public void insert_localidad_proveedor(String t)
  {
	  this.loc_proveedor=t;
  }
  public Proveedor (int n, String o, String p, int q, String r, int s, String t){  //Clase constructor
 
  this.id_proveedor=n;
  this.nombre_corred_proveedor=o;
  this.apellido_corred_proveedor=p;
  this.cuit_proveedor=q;
  this.calle_proveedor=r;
  this.altura_proveedor=s;
  this.loc_proveedor=t;
  }

}



