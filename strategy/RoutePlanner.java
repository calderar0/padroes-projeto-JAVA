package strategy;

public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route planRoute(String start, String end, String transportType) {
        if (strategy != null) {
            return strategy.calculateRoute(start, end, transportType);
        } else {
            System.out.println("Nenhuma estratégia de rota selecionada.");
            return null;
        }
    }
}
