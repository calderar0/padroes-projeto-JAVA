package strategy;

public class SafeRouteStrategy implements RouteStrategy {
    @Override
    public Route calculateRoute(String start, String end, String transportType) {
        // Simulação dos dados para a rota mais econômica
        double time = 60.0; // tempo estimado em minutos
        double distance = 25.0; // distância em km
        double cost = 5.0; // custo em unidades monetárias
        double co2Emissions = 3.0; // emissões de CO2 em kg
        System.out.println("Calculando a rota mais econômica: " + start + " -> " + end + " com " + transportType);
        return new Route(time, distance, cost, co2Emissions);
    }
}
