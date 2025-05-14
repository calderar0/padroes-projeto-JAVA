package strategy;

public interface RouteStrategy {
    abstract Route calculateRoute(String start, String end, String transportType);
}
