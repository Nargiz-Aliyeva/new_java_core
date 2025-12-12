public class mercedes extends car{

private String model;
private String color;

    public String getColor() {
        return color;
    }

//    @Override
//    public void marka() {
//        System.out.println("mercedes");
//    }

    @Override
    public void model(String model) {
        System.out.println(model);
    }


    @Override
    public void color(String color) {
        System.out.println(color);

    }
    public mercedes(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void displayInfo(){

        model(this.model);
        color(this.color);
    }
}
