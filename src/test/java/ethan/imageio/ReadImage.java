package ethan.imageio;

import org.junit.Test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author HUIZHENG
 * @date 2019/5/30
 * @time 9:38
 * Created by IntelliJ IDEA.
 */
public class ReadImage {
    /**
     * 读取图像测试
     */
    @Test
    public void readTest(){
        Image image=null;
        try {
            URL url=new URL("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1559180702&di=ddadf40d38bd25f91a5d71323a36693d&src=http://s10.sinaimg.cn/mw690/006hikKrzy7sly9tEBb49&690");
            image=ImageIO.read(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }
}
