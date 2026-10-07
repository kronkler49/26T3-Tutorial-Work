package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public interface PricingStrategy {
    public double cost(List<Meal> order, boolean isMember);
    public double standardChargeModifier();
}
