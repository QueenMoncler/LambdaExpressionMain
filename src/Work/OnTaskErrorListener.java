package Work;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String msg);
}