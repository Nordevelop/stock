package misClases;
import java.util.*;


public class Factura {
	/*
	    *objetos de la clase Factura emcapsulado.con Acceso Denegado en clase Main()
	    *@Author Nordevelop
	    *Repositorio https://github.com/Nordevelop/Stock/Factura.java
	    *Factura
	    */ 
	    
	    //detalle de la venta.......Atencion!! estos objetos deben iterar!
	    private int id_venta;
	    private String descripcion_venta;
	    private int precio_venta;
	    private int cantidad_venta;
	    private int subtotal_venta;	
	   
	  //metodos de asignacion de detalle info de venta
	  public int asignar_id_venta()
	  {
		  return this.id_venta;
	  }
	  public String asignar_descripcion_venta()
	  {
		  return this.descripcion_venta;
	  }
	  public int asignar_precio_venta()
	  {
		  return this.precio_venta;
	  }
	  public int asignar_cantidad_venta()   
	  {
		  return this.cantidad_venta;
	  }
		  public int asignar_subtotal_venta()
		  {
			  return this.subtotal_venta;
		  }
		  //metodo de inserccion de detalle de ventas
		  public void insert_id_venta(int h)
		  {
			  this.id_venta=h;
		  }
		  public void insert_descripcion_venta(String j)
		  {
			  this.descripcion_venta=j;
		  }
		  public void insert_precio_venta(int k)
		  {
			  this.precio_venta=k;
			  
		  }
		  public void insert_cantidad_venta(int l)
		  {
			  this.cantidad_venta=l;
		  }
		  public void insert_subtotal_venta(int m)
		  {
			  this.subtotal_venta=m;
		  }//clase Constructor
		  public Factura( int h, String j, int k, int l, int m)//clase Constructor
		  {
			 
			  this.id_venta=h;
			  this.descripcion_venta=j;
			  this.precio_venta=k;
			  this.cantidad_venta=l;
			  this.subtotal_venta=m;
			//objetos de la clase  con Acceso Permitido en  la clase Main{} 
		  }//Fin de la Clase Constructor
		  
	  }
	 
