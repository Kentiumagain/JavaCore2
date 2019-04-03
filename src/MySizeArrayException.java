public class MySizeArrayException extends Exception{
    public MySizeArrayException(Throwable e) {
        initCause(e);
    }
}
