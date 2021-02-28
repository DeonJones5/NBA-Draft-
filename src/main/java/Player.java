public class Player {
    private String name;
    private String height;
    private double points;

    public Player(String name, String height, double points) {
        this.name = name;
        this.height = height;
        this.points = points;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Height: " + height + "\n" +
                "Points per game: " + points;
    }
}
