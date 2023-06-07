package Work;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(){
        for (int i = 0; i < 100; i++) {
            if(i!=33) {callback.onDone("Good " + i + " Job");}
            else { errorCallback.onError("Error " + i + " Job");}
        }
    }
}