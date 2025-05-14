package strategy;

public class ShortestRouteStrategy implements RouteStrategy {
    @Override
    public Route calculateRoute(String start, String end, String transportType) {
        // Simulação dos dados para a rota mais curta
        double time = 40.0; // tempo estimado em minutos
        double distance = 15.0; // distância em km
        double cost = 12.0; // custo em unidades monetárias
        double co2Emissions = 4.0; // emissões de CO2 em kg
        System.out.println("Calculando a rota mais curta: " + start + " -> " + end + " com " + transportType);
        return new Route(time, distance, cost, co2Emissions);
    }
}
