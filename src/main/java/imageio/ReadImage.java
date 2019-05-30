package imageio;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReadImage
{
    public static void main( String[] args )
    {
        Image image = null;
        try {
            URL url = new URL("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1559180702&di=ddadf40d38bd25f91a5d71323a36693d&src=http://s10.sinaimg.cn/mw690/006hikKrzy7sly9tEBb49&690");
            image = ImageIO.read(url);
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