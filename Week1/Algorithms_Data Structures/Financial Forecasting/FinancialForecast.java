public class FinancialForecast {

   
    public static double forecastValue(double currentValue, double annualGrowthRate, int years) {
      
        if (years == 0) {
            return currentValue;
        }
     
        return forecastValue(currentValue * (1 + annualGrowthRate), annualGrowthRate, years - 1);
    }

  
    public static double forecastValueIterative(double currentValue, double annualGrowthRate, int years) {
        double value = currentValue;
        for (int i = 0; i < years; i++) {
            value *= (1 + annualGrowthRate);
        }
        return value;
    }
}