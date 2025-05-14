package strategy;

public class Route {
    private double time; 
    private double distance; 
    private double cost; 
    private double co2Emissions; 

    public Route(double time, double distance, double cost, double co2Emissions) {
        this.time = time;
        this.distance = distance;
        this.cost = cost;
        this.co2Emissions = co2Emissions;
    }

    public double getTime() {
        return time;
    }

    public double getDistance() {
        return distance;
    }

    public double getCost() {
        return cost;
    }

    public double getCO2Emissions() {
        return co2Emissions;
    }

    public String toString() {
        return "Tempo: " + time + " minutos, Distância: " + distance + " km, Custo: " + cost + " unidades, Emissão de CO2: " + co2Emissions + " kg";
    }
}
