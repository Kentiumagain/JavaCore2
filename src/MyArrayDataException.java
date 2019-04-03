public class MyArrayDataException extends Exception {
    int j,i;
    public MyArrayDataException(Throwable e, int i, int j) {
        this.i=i;
        this.j=j;
        initCause(e);
    }

    public int getJ() {
        return j;
    }

    public int getI() {
        return i;
    }
}
