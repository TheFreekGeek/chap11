import java.util.ArrayList;

public class NeuralMod implements Comparable<NeuralMod> {
    private String name;
    private double ProcSpeed;
    private int CompRating;

    public NeuralMod(String name, double procSpeed, int compRating) {
        this.name = name;
        this.ProcSpeed = procSpeed;
        this.CompRating = compRating;
    }

    @Override
    public String toString() {
        return "ModName= " + name + System.lineSeparator() +
                "ProcSpeed " + ProcSpeed + System.lineSeparator() +
                "CompRating " + CompRating + System.lineSeparator() +
                " ";
    }

    @Override
    public int compareTo(NeuralMod o) {
        if(this.ProcSpeed > o.ProcSpeed) {
            return 1;
        }
        else if(o.ProcSpeed > this.ProcSpeed) {
            return -1;
        }
        else {
            return 0;
        }
    }

}
