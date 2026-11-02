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
        return "Name: " + name + ", ProcSpeed: " + ProcSpeed + ", CompRating: " + CompRating;
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
            if(this.CompRating > o.CompRating) {
                return 1;
            }
            else if(o.CompRating > this.CompRating) {
                return -1;
            }
            else {
                return this.name.compareTo(o.name);
            }
        }
    }

    public Integer getCompRating() {
        return CompRating;
    }

    public String getName() {
        return name;
    }

    public double getProcSpeed() {
        return ProcSpeed;
    }
}
