public class BonusMilesService {
    public int calculate(int cost) {
        int amountRuble = 20;
        int bonusMile = cost / amountRuble;
        return bonusMile;
    }
}