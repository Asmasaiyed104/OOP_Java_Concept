public class Box {


    double depth;
    double width;
    double height;

    public Box(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
    public double volume(){
        return depth * width * height;

    }


    }




