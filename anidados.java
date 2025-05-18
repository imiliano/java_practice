import java.util.Scanner;

public class anidados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String patente = "";
        Double horas;
        Double costoTotal;

        while (true){
            System.out.println("ingrese su patente para continuar o 'fin' para finalizar");
            patente = teclado.nextLine();
            teclado = new Scanner(System.in);

            if (!patente.equalsIgnoreCase("fin")){
                System.out.println("ingrese la cantidad de horas que desea estacionar...\ncantidad mínima: 1\ncantidad máxima: 10\nentre 5 y 10 horas: 10% descuento\ncosto por hora: $5");

                horas = teclado.nextDouble();

                    if ( horas >= 1 && horas < 5){
                        costoTotal = horas*5;
                        System.out.println("Su patente: " + patente + "\nCantidad de horas: " + horas + "\nCosto final: $" + costoTotal);
                    }
                else if ( horas >= 5 && horas <= 10){
                    costoTotal = horas*5;
                    Double descuento = costoTotal*0.1;
                    costoTotal = costoTotal - descuento;
                    System.out.println("Su patente: " + patente + "\nCantidad de horas: " + horas + "\nDescuento aplicado: $" + descuento + "\nCosto final: $" + costoTotal);
                }
                else{
                    System.out.println("\nel valor ingresado es incorrecto\n");
                    teclado = new Scanner(System.in);
                }
            }
            System.out.println("\n**********\nGracias por operar con nuestro sistema, vuelva pronto!\n**********\n");
            break;
        }
    }
}
