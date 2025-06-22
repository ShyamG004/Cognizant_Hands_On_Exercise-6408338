public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0;
        double growthRate = 0.08; 
        int years = 5;

        double futureValueRecursive = FinancialForecast.forecastValue(initialValue, growthRate, years);
        double futureValueIterative = FinancialForecast.forecastValueIterative(initialValue, growthRate, years);

        System.out.printf("Recursive Future Value after %d years: ₹%.2f%n", years, futureValueRecursive);
        System.out.printf("Iterative Future Value after %d years: ₹%.2f%n", years, futureValueIterative);
    }
}