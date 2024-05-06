public record Moneda(String base_code,
                     String target_code,
                     float conversion_rate,
                     float conversion_result) {
    @Override
    public String toString() {
        return ".\nValor de conversión: $" + conversion_rate +
                ".\nResultado de la conversión: $" + conversion_result;
    }
}
