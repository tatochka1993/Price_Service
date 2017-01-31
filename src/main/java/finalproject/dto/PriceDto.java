package finalproject.dto;

public class PriceDto {

    private long idPrice;
    private int idProduct;
    private double cost;

    public long getId() {
        return idPrice;
    }

    public void setId(long id) {
        this.idPrice = id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "PriceDto{" +
                "id=" + idPrice +
                ", idProduct=" + idProduct +
                ", cost=" + cost +
                '}';
    }
}
