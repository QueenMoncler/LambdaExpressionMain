package Work;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}