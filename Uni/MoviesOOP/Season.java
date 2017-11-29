public class Season {
    private String name;
    private int number;
    private Series series;
    
    public Season(Series series, int number) {
    this.series = series;
    this.number = number;
    }
}
