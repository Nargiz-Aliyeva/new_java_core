public class Bmvv extends Car{
    public String car ;
    public String color;

    public Bmvv(String car, String color) {
        this.car = car;
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bmvv{" +
                "car='" + car + '\'' +
                ", color='" + color + '\'' +
                '}' ;
    }
}
