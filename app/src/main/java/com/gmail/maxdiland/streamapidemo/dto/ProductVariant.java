package com.gmail.maxdiland.streamapidemo.dto;

/**
 * Created by Max Diland
 */

public class ProductVariant {
    private Size size;
    private Color color;
    private float price;
    private boolean onSale;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "ProductVariant{" +
                "size=" + size +
                ", color=" + color +
                ", price=" + price +
                ", onSale=" + onSale +
                '}';
    }
}
