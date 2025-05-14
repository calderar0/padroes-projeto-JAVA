package strategy;

public class EcoFriendlyRouteStrategy implements RouteStrategy {
    @Override
    public Route calculateRoute(String start, String end, String transportType) {
        // Simulação dos dados para a rota ecológica
        double time = 50.0; // tempo estimado em minutos
        double distance = 18.0; // distância em km
        double cost = 10.0; // custo em unidades monetárias
        double co2Emissions = 2.0; // emissões de CO2 em kg
        System.out.println("Calculando a rota ecológica: " + start + " -> " + end + " com " + transportType);
        return new Route(time, distance, cost, co2Emissions);
    }
}
