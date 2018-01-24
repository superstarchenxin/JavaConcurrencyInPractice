package multithread.task.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by chenxin110 on 18/1/22.
 */
public class Future {
    private final ExecutorService executor;

    Future(ExecutorService executor) {
        this.executor = executor;
    }

    public void renderPage(CharSequence source) {
        final List<ImageData> info = scanForImageInfo(source);
        CompletionService<ImageData> completionService = new ExecutorCompletionService<ImageData>(executor);
        for(final ImageData data: info)
                completionService.submit(new Callable<ImageData>() {
                    public ImageData call() throws Exception {
                        return data;
                    }
                });

        //renderText(source);


        try {
            for (int i = 0; i < info.size(); ++i) {
                Future<ImageData> f = completionService.take();
                ImageData imageData = f.get();
                // renderImage(data);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            // throw exception
        }
    }
    private List<ImageData> scanForImageInfo(CharSequence source) {
        List<ImageData> info = new ArrayList<ImageData>();
        // do something
        return info;
    }
}

class ImageData {

}
