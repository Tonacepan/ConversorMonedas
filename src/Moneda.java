public record Moneda(String base_code,
                     String target_code,
                     float conversion_rate,
                     float conversion_result) {

    String imprimir(){
         return "El monto de $" + conversion_result / conversion_rate + " en " + base_code +
                ".\nMoneda a convertir " + target_code +
                ".\nValor de conversión: $" + conversion_rate +
                ".\nResultado de la conversión: $" + conversion_result;
    }
}
