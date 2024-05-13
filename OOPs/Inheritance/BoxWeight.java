package OOPs.Inheritance;

public class BoxWeight extends BoxVolume{
    double weight;
    BoxWeight(){
        weight=1;
    }
    BoxWeight(int l,int b, int h, int density){
        super(l,b,h);
        this.weight = super.volume* density;
    }
}
