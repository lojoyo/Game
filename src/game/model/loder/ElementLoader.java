package game.model.loder;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementLoader {
    private static volatile ElementLoader loader;
    private Map<String, List<ImageIcon>> imageMap;//图片资源
    //效率比较高的线程安全的单例模式写法
    public static ElementLoader getLoader() {
        if (loader == null) {
            synchronized (ElementLoader.class){
                if (loader==null){
                    loader=new ElementLoader();
                }
            }
        }
        return loader;
    }

    private ElementLoader() {
        imageMap=new HashMap<>();
    }
    public Map<String, List<ImageIcon>> getImageMap() {
        return imageMap;
    }
}
