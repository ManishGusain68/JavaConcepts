package imageHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHandlingDemo {
public static void main(String[] args) {
	int width =963;
	int height = 640;
	
	BufferedImage image=null;
	
	image=readFromFile(width,height,image);
	writeToFIle(image);
	
	
}

private static void writeToFIle(BufferedImage image) {
	
	try {
		
		File output=new File("C:\\Users\\Manish Gusain\\Desktop\\copiedSample.jpeg");
		
	ImageIO.write(image, "jpg", output);
	System.out.println("writing complete");
		
	}catch(Exception e) {
		System.out.println(e);
	}
}

private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
	
	try {
	File sampleFile= new File("C:\\Users\\Manish Gusain\\Desktop\\sample.jpeg");
	image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
	//read input file
		image= ImageIO.read(sampleFile);
		
		System.out.println("reading complete"+image);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return image;
}
}
