package chap_07;

public class BlackBoxRefurbish {
    public String modelName;
    String resolution;
    private int price;
    protected String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의 하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price < 100000 ? 100000 : price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
