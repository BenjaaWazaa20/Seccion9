
import java.util.List;

public class CentralPointCalculator {

    public static double calculateCenterX(List<Residence> residences) {
        double weightedSumX = 0;
        int totalPopulation = 0;

        for (Residence res : residences) {
            weightedSumX += res.getCenterX() * res.getPopulation();
            totalPopulation += res.getPopulation();
        }

        return totalPopulation > 0 ? weightedSumX / totalPopulation : 0;
    }

    public static double calculateCenterY(List<Residence> residences) {
        double weightedSumY = 0;
        int totalPopulation = 0;

        for (Residence res : residences) {
            weightedSumY += res.getCenterY() * res.getPopulation();
            totalPopulation += res.getPopulation();
        }

        return totalPopulation > 0 ? weightedSumY / totalPopulation : 0;
    }
}
: residences) {
            weightedSumY += res.getCenterY() * res.getPopulation();
            totalPopulation += res.getPopulation();
        }

        return totalPopulation > 0 ? weightedSumY / totalPopulation : 0;
    }
}
