package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello to Chayma's Empire From Azure!";

	}

	public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("https://img.freepik.com/photos-gratuite/rose-rose-rose-petale_1339-1165.jpg?w=900&t=st=1667853926~exp=1667854526~hmac=ede553eb261fdd5530e6c3bff23177a151ced6242aec3306482999e4833f13ea"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    

	}
}
