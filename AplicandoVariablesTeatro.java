
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ambar
 */



public class AplicandoVariablesTeatro {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        final int VIP = 30000;
        final int PLATEA_BAJA = 15000;
        final int PLATEA_ALTA = 18000;
        final int PALCO = 13000;
        
        int respuestaInicio;
        int respuestaMenu;
        
        int valorEntradaFinal = 0;
        int contadorEntradasVendidas = 0;
        int totalCompra = 0;
        int totalPromocion = 0;
        
        
        System.out.println("Bienvenido al Teatro Moro");
        
        try {
            System.out.println("Desea comenzar?");
            System.out.println("1. Si");
            System.out.println("2. No");
            respuestaInicio = Integer.parseInt(scanner.nextLine());
            
                
                
                while(respuestaInicio == 1 ){
                    System.out.println("Por favor seleccione una opcion del menu:");
                    System.out.println("1. Comprar entrada");
                    System.out.println("2. Ver Promociones");
                    System.out.println("3. Buscar una entrada");
                    System.out.println("4. Eliminar una entrada");
        
                    respuestaMenu = Integer.parseInt(scanner.nextLine());
                    
                    
            switch (respuestaMenu) {
                case 1:
                    System.out.println("Usted selecciono opcion 1. Comprar entrada");
                    int respuestaCompra;
                    String nombreUbicacion;
                    double descuento;
                    
                
                    System.out.println("Por favor ingrese la ubicacion de la entrada");
                    System.out.println("Ubicaciones disponibles: 1. VIP, 2. platea alta, 3. platea baja, 4. Palco");
                    respuestaCompra = Integer.parseInt(scanner.nextLine());
                    
                    System.out.println("Elija una de las siguientes opciones: 1. Estudiante, 2. Tercera edad, 3. Publico general");
                    int tipoCliente = Integer.parseInt(scanner.nextLine());
                   
                    if (tipoCliente == 1 ) {
                       descuento = 0.9;
                    }else if (tipoCliente == 2 ) {
                       descuento = 0.85;
                    }else if(tipoCliente == 3 ) {
                       descuento = 1;
                    }else {
                    System.out.println("La opcion ingresada no es valida");
                       descuento = 1;
                    }
                
                switch (respuestaCompra) {
                    case 1:
                        nombreUbicacion = "VIP";
                        valorEntradaFinal = (int) (VIP * descuento);
                        System.out.println("Precio final de la entrada "+nombreUbicacion+": $"+valorEntradaFinal);
                                
                    break;
                    
                    case 2:
                        nombreUbicacion = "Platea alta";
                        valorEntradaFinal = (int) (PLATEA_ALTA * descuento);    
                        System.out.println("Precio final de la entrada "+nombreUbicacion+": $"+valorEntradaFinal);
                    break;
                    
                    case 3:
                        nombreUbicacion = "Platea baja";
                        valorEntradaFinal = (int) (PLATEA_BAJA * descuento);
                        System.out.println("Precio final de la entrada "+nombreUbicacion+": $"+valorEntradaFinal);
                    break;
                    
                    case 4:
                        nombreUbicacion = "Palco";
                        valorEntradaFinal = (int) (PALCO * descuento);
                        System.out.println("Precio final de la entrada "+nombreUbicacion+": $"+valorEntradaFinal);
                    break;
                    
                    default:
                         System.out.println("Esta opcion no es valida");
                         break;
                }
                contadorEntradasVendidas ++;
                totalCompra = totalCompra + valorEntradaFinal;
                break;
                
                case 2:
                    System.out.println("Usted selecciono opcion 2. Ver promociones");
                    System.out.println("Si compra 2 entradas o mas, se aplica 20% de descuento en el total de su compra");               
                    
                    if (contadorEntradasVendidas >= 2 ) {
                        totalPromocion = (int) (totalCompra * 0.80);
                        System.out.println("Usted cumple los requisitos para la promocion");
                        System.out.println("El monto total a pagar original es: "+totalCompra);
                        System.out.println("El total de su compra con promocion aplicada es: "+totalPromocion);
                    } else {
                        System.out.println("Usted no cumple los requisitos para la promocion");
                    }
                    
                
                break;
                
                case 3:
                    System.out.println("Usted selecciono opcion 3. Buscar una entrada");
                    System.out.println("Usted tiene un total de "+contadorEntradasVendidas+" entradas vendidas");
                    System.out.println("El precio total de sus entradas es: "+totalCompra);
                    
                break;
                
                case 4:
                    System.out.println("Usted selecciono opcion 4. Eliminar una entrada");
                    
                    if ( contadorEntradasVendidas == 0 ) {
                        System.out.println("En este momento usted no tiene ninguna entrada");
                        break;
                    }
                    
                    
                    System.out.println("Ingrese el monto de la entrada que quiere eliminar");
                    int entradaEliminada = Integer.parseInt(scanner.nextLine());
                    
                    
                    if ( entradaEliminada > totalCompra ) {
                        System.out.println("El monto ingresado no es valido");
                        
                    } else {
                        totalCompra = totalCompra - entradaEliminada;
                        contadorEntradasVendidas --;
                        System.out.println("La entrada ingresada fue eliminada con exito");
                    }
                
                break;
                
                default:
                    System.out.println("Esta opcion no es valida");
                    break;
            }
            
            System.out.println("Desea seleccionar otra opcion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int resp = Integer.parseInt(scanner.nextLine());
            respuestaInicio = resp;
   
            }
            
            
        
        }catch (NumberFormatException e) {
            System.out.println("Error: por favor seleccione una opcion valida");
            
        } finally {
            System.out.println("Operacion finalizada"); 
            System.out.println("Gracias por visitar Teatro Moro");
            
            scanner.close();
        }
        
       
        
    }
}
