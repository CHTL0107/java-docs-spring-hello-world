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
		return "<button> btn </button> Hello to Chayma's Empire From Azure!";


	}

BufferedImage wPic = ImageIO.read(this.getClass().getResource("data:image/jpeg;base64,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"));
JLabel wIcon = new JLabel(new ImageIcon(wPic));
    

	}
}
