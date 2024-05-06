public record Moneda(String base_code,
                     String target_code,
                     float conversion_rate,
                     float conversion_result) {

    @Override
    public String toString() {
        return
                "\nEl valor de conversión $" + conversion_rate +
                ".\nEl resultado de la conversión es: $" + conversion_result;
    }
}
