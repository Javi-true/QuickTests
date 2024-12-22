public class Roof {

    //fields.
    private String color;
    private double width;
    private double height;
    private int inclination;

    //constructor.
    public Roof(String color, double width, double height, int inclination){
        this.color = color;
        this.width = width;
        this.height = height;
        this.inclination = inclination;
    }

    //copy.
    public void copy(Roof roof){
        this.setColor(roof.getColor());
        this.setHeight(roof.getHeight());
        this.setWidth(roof.getWidth());
        this.setInclination(roof.getInclination());
    }
    //getters.
    public String getColor(){
        return this.color;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public int getInclination(){
        return this.inclination;
    }
    //setter.
    public void setColor(String color){
        this.color = color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setInclination(int inclination){
        this.inclination = inclination;
    }
}
