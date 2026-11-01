import java.util.ArrayList;

public class NeuralMod {
    String name;
    double ProcSpeed;
    int CompRating;

    public NeuralMod(String name, double procSpeed, int compRating) {
        this.name = name;
        this.ProcSpeed = procSpeed;
        this.CompRating = compRating;
    }

    @Override
    public String toString() {
        return "ModName=" + name + " - ProcSpeed=" + ProcSpeed + " - CompRating=" + CompRating + "";
    }

}
