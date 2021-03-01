public class BalanceInsuffiicentException extends Exception {
    String mesage;

    public BalanceInsuffiicentException(String mesage) {
        this.mesage = mesage;
    }

    @Override
    public String getMessage() {
        return this.mesage;
    }
}
