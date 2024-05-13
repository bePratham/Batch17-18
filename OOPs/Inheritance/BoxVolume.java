package OOPs.Inheritance;

public class BoxVolume extends Box {
    double volume;

    BoxVolume() {
        super();
        volume = 1;
    }

    BoxVolume(int l, int b, int h) {
        super(l, b, h);
        this.volume = l * b * h;
    }
}
