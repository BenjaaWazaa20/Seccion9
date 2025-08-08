
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.shape.Circle;

public class Residence {
    private final StringProperty name;
    private final IntegerProperty population;
    private final Circle circle;

    public Residence(String name, int population, double x, double y) {
        this.name = new SimpleStringProperty(name);
        this.population = new SimpleIntegerProperty(population);
        this.circle = new Circle(x, y, 10);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getPopulation() {
        return population.get();
    }

    public IntegerProperty populationProperty() {
        return population;
    }

    public void setPopulation(int population) {
        this.population.set(population);
    }

    public Circle getCircle() {
        return circle;
    }

    public double getCenterX() {
        return circle.getCenterX();
    }

    public double getCenterY() {
        return circle.getCenterY();
    }
}
ion);
    }

    public Circle getCircle() {
        return circle;
    }

    public double getCenterX() {
        return circle.getCenterX();
    }

    public double getCenterY() {
        return circle.getCenterY();
    }
}
