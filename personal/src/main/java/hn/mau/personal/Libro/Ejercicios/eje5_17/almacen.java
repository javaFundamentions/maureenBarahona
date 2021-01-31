/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje5_17;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class almacen {

    private float monto_total = 0;
    private int numero_producto;
    private int cantidad_vendida;

    public void Recibe() {

        Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.print("\nEste almacen vende cinco productos con los siguientes");
        System.out.println("\nprecios:");
        System.out.println("\nProducto 1: $2.98");
        System.out.println("\nProducto 2: $4.50");
        System.out.println("\nProducto 3: $9.98");
        System.out.println("\nProducto 4: $4.49");
        System.out.println("\nProducto 5: $6.87\n");

        System.out.println("\nPor favor introduzca el numero del primer producto:");
        System.out.println("( -1 para terminar).");
        numero_producto = capturador.nextInt();

        
        while ( -1 != numero_producto )
  {        
   
  switch ( numero_producto )
  {   

  case 1:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = capturador.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*2.98);
  monto_total += cantidad_vendida*2.98;
  break;
  }  

  case 2:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = capturador.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*4.50);
  monto_total += cantidad_vendida*4.50;
  break;
  }  

  case 3:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = capturador.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*9.98);
  monto_total += cantidad_vendida*9.98;
  break;
  }  

   
  case 4:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = capturador.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*4.49);
  monto_total += cantidad_vendida*4.49;
  break;
  }  

  case 5:
  {    // Cierra case 5

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = capturador.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*6.87);
  monto_total += cantidad_vendida*6.87;
  break;
  }  


  default :
  {    

  System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!");
  break;
  }  

  }  

  System.out.println("\nPor favor introduzca el numero del siguiente producto:");
  System.out.println("( -1 para terminar).");
  numero_producto = capturador.nextInt(); 


  }        

  System.out.printf("\nLas ventas totales fueron: %f\n\n", monto_total);
    }

}
