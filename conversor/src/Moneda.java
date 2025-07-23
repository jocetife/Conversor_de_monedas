public class Moneda {
    private ConversionRates conversion_rates;

    public ConversionRates getConversion_rates() {
        return conversion_rates;
    }

    public static class ConversionRates {
        private double ARS;
        private double COP;
        private double BRL;
        private double USD;

        public double getARS() { return ARS; }
        public double getCOP() { return COP; }
        public double getBRL() { return BRL; }
        public double getUSD() { return USD; }
    }
}
