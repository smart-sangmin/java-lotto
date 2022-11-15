package lotto;

public enum Prize {
    FIFTH(5_000),
    FOURTH(50_000),
    THIRD(1_500_000),
    SECOND(30_000_000),
    JACKPOT(2_000_000_000);

    private final int prize;
    private int numsOfWinner;

    Prize(int prize) {
        this.prize = prize;
        this.numsOfWinner = 0;
    }

    public int getNumsOfWinner() {
        return this.numsOfWinner;
    }

    private void plusNumsOfWinner() {
        this.numsOfWinner++;
    }

    public static void checkRanking(int numsOfMatchedNumber, boolean containBonus) {
        if (numsOfMatchedNumber == 6) {
            Prize.JACKPOT.plusNumsOfWinner();
        }
        if (numsOfMatchedNumber == 5 && containBonus) {
            Prize.SECOND.plusNumsOfWinner();
        }
        if (numsOfMatchedNumber == 5) {
            Prize.THIRD.plusNumsOfWinner();
        }
        if (numsOfMatchedNumber == 4) {
            Prize.FOURTH.plusNumsOfWinner();
        }
        if (numsOfMatchedNumber == 3) {
            Prize.FIFTH.plusNumsOfWinner();
        }
    }

    public static int getComputedIncome() {
        int totalIncome = 0;
        for (Prize rank : Prize.values()) {
            totalIncome += rank.numsOfWinner * rank.prize;
        }
        return totalIncome;
    }

    public static float getComputeIncomeRate(int seedMoney) {
        int totalIncome = getComputedIncome();
        return totalIncome / (float) seedMoney;
    }
}
