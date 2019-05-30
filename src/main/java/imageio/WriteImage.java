package imageio;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author HUIZHENG
 * @date 2019/5/30
 * @time 9:54
 * Created by IntelliJ IDEA.
 */
public class WriteImage {
    public static void main( String[] args )
    {
        BufferedImage image = null;
        try {

            URL url = new URL("http://p3.so.qhmsg.com/t014d3503dd2d67d728.jpg");
            image = ImageIO.read(url);
            //.jpg文件占空间最小
            ImageIO.write(image, "jpg",new File("C:\\Users\\HUIZHENG\\IntelliJIDEAProjects\\ImageIODemo\\src\\main\\java\\out\\out.jpg"));
            ImageIO.write(image, "gif",new File("C:\\Users\\HUIZHENG\\IntelliJIDEAProjects\\ImageIODemo\\src\\main\\java\\out\\out.gif"));
            ImageIO.write(image, "png",new File("C:\\Users\\HUIZHENG\\IntelliJIDEAProjects\\ImageIODemo\\src\\main\\java\\out\\out.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("成功写入out文件夹");
    }
}
