package imageio;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageTest {

    public static void main(String[] args) {

        try {
           //使用jpg格式，可以减少存储空间
            BufferedImage originalImage = ImageIO.read(new File(
                    "C:\\Users\\HUIZHENG\\IntelliJIDEAProjects\\ImageIODemo\\src\\main\\java\\out\\1.jpg"));

            ImageIO.write(originalImage, "jpg", new File(
                    "C:\\Users\\HUIZHENG\\IntelliJIDEAProjects\\ImageIODemo\\src\\main\\java\\out\\2.jpg"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
