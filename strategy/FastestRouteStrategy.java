package strategy;

public class FastestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String start, String end, String transportType) {
        // Simulação dos dados para a rota mais rápida
        double time = 30.0; // tempo estimado em minutos
        double distance = 20.0; // distância em km
        double cost = 15.0; // custo em unidades monetárias
        double co2Emissions = 5.0; // emissões de CO2 em kg
        System.out.println("Calculando a rota mais rápida: " + start + " -> " + end + " com " + transportType);
        return new Route(time, distance, cost, co2Emissions);
    }
}
