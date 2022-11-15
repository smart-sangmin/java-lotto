package lotto;

public class Constants {
    public static final int NUM_OF_LOTTO = 6;
    public static final int MIN_VALUE_OF_LOTTO = 1;
    public static final int MAX_VALUE_OF_LOTTO = 45;
    public static final int MONEY_UNIT = 1000;

    public static final String SPLIT_MARK = ",";
    public static final String ERROR_MESSAGE_FOR_SIZE = "[ERROR] 로또 번호는 " + NUM_OF_LOTTO + "자리여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_RANGE_OF_NUMBER = "[ERROR] 로또 번호는 " + MIN_VALUE_OF_LOTTO + "부터 " + MAX_VALUE_OF_LOTTO + " 사이의 숫자여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_DUPLICATION = "[ERROR] 로또 번호는 서로 중복되지 않는 숫자여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_DUPLICATION_WITH_WINNING_NUMBER = "[ERROR] 보너스 번호는 로또 번호와 중복되지 않은 숫자여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_RANGE_OF_BONUS_NUMBER = "[ERROR] 보너스 번호는 " + MIN_VALUE_OF_LOTTO + "부터 " + MAX_VALUE_OF_LOTTO + " 사이의 숫자여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_SEED_MONEY = "[ERROR] 구입금액은 " + MONEY_UNIT + "원 단위여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_IS_NUMERIC = "[ERROR] 구입금액은 숫자여야 합니다.";
    public static final String ERROR_MESSAGE_FOR_PROPER_MONEY = "[ERROR] 구입금액은 최소 1000원 입니다.";
}
