import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallet {

    private String color;
    private List<String> cardHolder = new ArrayList<>();
    private String brand;
    private double weight;
    private double money;
    private boolean lost = false;


    public void addMoney(double amount) {
        if (amount > 0) {
            this.money += amount;
        }
    }

    public boolean checkMoney(double amount) {
        return this.money >= amount;
    }

    public void addCard(String card) {
        if (card != null && !card.trim().isEmpty()) {
            this.cardHolder.add(card);
        }
    }

    public void lose() {
        this.lost = true;
    }

    public List<String> getCardHolder() {
        return this.cardHolder;
    }

    public boolean isLost() {
        return this.lost;
    }

    public double getMoney() {
        return this.money;
    }
}
