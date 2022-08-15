public class Hotel {
    private final String name;
    private final long weekdayRate;
    private final long weekendRate;
    private long totalCost;

    public Hotel(String name, long weekdayRate,long weekendRate) {
        this.name = name;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public String getName() {
        return name;
    }

    public long getWeekdayRate() {
        return weekdayRate;
    }

    public long getWeekendRate() {
        return weekendRate;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost)
    {
        this.totalCost = totalCost;
    }
}
