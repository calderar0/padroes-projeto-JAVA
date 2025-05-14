package strategy;

public class Main {
    public static void main(String[] args) {
        // Criando o plano de rota
        RoutePlanner planner = new RoutePlanner();

        // Selecionando a estratégia de rota mais rápida
        planner.setStrategy(new FastestRouteStrategy());
        Route route1 = planner.planRoute("Av. Paulista", "USP", "Carro");
        System.out.println(route1);

        // Mudando para a estratégia mais curta
        planner.setStrategy(new ShortestRouteStrategy());
        Route route2 = planner.planRoute("Av. Paulista", "USP", "Carro");
        System.out.println(route2);

        // Mudando para a estratégia ecológica
        planner.setStrategy(new EcoFriendlyRouteStrategy());
        Route route3 = planner.planRoute("Av. Paulista", "USP", "Bicicleta");
        System.out.println(route3);

        // Mudando para a estratégia mais econômica
        planner.setStrategy(new SafeRouteStrategy());
        Route route4 = planner.planRoute("Av. Paulista", "USP", "Ônibus");
        System.out.println(route4);
    }
}
