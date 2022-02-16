package com.ejercicios;

public class Main {


    public static void main(String[] args) {

        String nombres[] = {"Ricardo Valenzuela", "Bryan Astudillo", "Billy Blanco", "Luis Latines", "Jose Camargo"};
        String marcas[] = {"LAMBORGINI", "MERCEDES", "TOYOTA", "FORD", "SUSUKI"};
        String placas[] = {"AAA-123", "AAA-131", "BBB-128", "BBB-133", "AAA-139"};
        double tarifa_hora[] = {1200, 1000, 1900, 2500, 1100};
        int numero_horas[] = {7, 8, 4, 3, 6};

        double subtotal[] = {0, 0, 0, 0, 0};
        double igvs[] = {0.0, 0.0, 0.0, 0.0, 0.0};
        double total[] = {0, 0, 0, 0, 0};

        calculoTotalSinIGV(tarifa_hora, numero_horas, subtotal);
        calculoIGV(subtotal, igvs);
        calculoTotalConIGV(subtotal, igvs, total);
        total_dia(total);
        ingreso_promedio(total);
        imprimir_reporte(nombres, marcas, placas, tarifa_hora, numero_horas, subtotal, igvs, total);

    }

    public static void calculoTotalSinIGV(double tarifa_hora[], int numero_horas[], double subtotal[]) {

        for (int i = 0; i < subtotal.length; i++) {
            subtotal[i] = tarifa_hora[i] * numero_horas[i];

        }

    }

    public static void calculoIGV(double subtotal[], double igvs[]) {
        for (int i = 0; i < subtotal.length; i++) {
            igvs[i] = 0.18 * subtotal[i];

        }

    }

    public static void calculoTotalConIGV(double subtotal[], double igvs[], double total[]) {
        for (int i = 0; i < subtotal.length; i++) {
            total[i] = subtotal[i] + igvs[i];
        }
    }

    public static double total_dia(double total[]) {
        double monto_diario = 0;
        for (int i = 0; i < total.length; i++) {
            monto_diario = monto_diario + total[i];
        }

        return monto_diario;
    }

    public static double ingreso_promedio(double total[]) {
        double promedio;
        promedio = total_dia(total) / total.length;
        return promedio;
    }

    public static void imprimir_reporte(String nombres[], String marcas[], String placas[], double tarifa_hora[], int numero_horas[], double subtotal[], double igvs[], double total[]) {

        System.out.println("**************");
        System.out.println("**** Datos del Cliente ***");

        System.out.println("**************");

        for (int i = 0; i < subtotal.length; i++) {

            System.out.println("**************");
            System.out.println("CLIENTE " + (i + 1) + ":");
            System.out.println("**************");
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Marca: " + marcas[i]);
            System.out.println("Placa: " + placas[i]);
            System.out.println("Tarifa por Hora: " + tarifa_hora[i]);
            System.out.println("Numero de Horas Alquiladas: " + numero_horas[i]);
            System.out.println("Subtotal: " + subtotal[i]);
            System.out.println("IGV: " + igvs[i]);
            System.out.println("Total a Pagar: " + total[i]);
            System.out.println("**************");
            System.out.println("**************");
            System.out.println("** REPORTE DE ALQUILER DE AUTOS ***");
            System.out.println("**************");
            System.out.println("El monto total del dia es: " + total_dia(total));
            System.out.println("El monto total promedio es: " + ingreso_promedio(total));
            System.out.println("**************");

        }

    }
}

