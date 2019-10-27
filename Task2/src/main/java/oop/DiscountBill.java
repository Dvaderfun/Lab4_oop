package oop;

public class DiscountBill extends GroceryBill {
    private int discountCount;
    private double discountAmount;
    private boolean regularCustomer;

    public DiscountBill(Employee clerk, boolean regularCustomer) {
        super(clerk);
        this.regularCustomer = regularCustomer;
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return getDiscountAmount() * 100 / super.getTotal();
    }

    @Override
    public double getTotal() {
        return super.getTotal() - getDiscountAmount();
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (i.getDiscount() > 0 && regularCustomer) {
            discountCount++;
            discountAmount = discountAmount + i.getDiscount();
        }
    }
}
