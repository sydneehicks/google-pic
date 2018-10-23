import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class painting extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		 
		g.setColor(Color.BLUE);
		g.setFont(new Font("Sans-Serif",Font.BOLD, 100));
		g.drawString("G", 25, 75);
		g.setColor(Color.RED);
		g.setFont(new Font("Sans-Serif",Font.BOLD, 100));
		g.drawString("o", 100, 75);
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Sans-Serif",Font.BOLD, 100));
		g.drawString("o", 159, 75);
		g.setColor(Color.BLUE);
		g.setFont(new Font("Seriff",Font.BOLD, 100));
		g.drawString("g", 215, 75);
		g.setColor(new Color(0,115,0));
		g.setFont(new Font("Seriff",Font.BOLD, 100));
		g.drawString("l", 267, 75);
		g.setColor(Color.RED);
		g.setFont(new Font("Seriff",Font.BOLD, 100));
		g.drawString("e", 290, 75);
		
		g.setColor(Color.WHITE);
		g.fillRoundRect(240,90,140,50,50,50);
		
		g.setFont(new Font("Sans-Serif",Font.PLAIN, 10));
		g.setColor(Color.BLACK);
		g.drawString("I'm better than ALEXA!", 255, 120);
		
	
		g.setColor(new Color(64,64,64));
		g.fillRoundRect(160, 105, 100,100,150,150);
		g.setColor(Color.GRAY);
		g.fillRoundRect(150, 100, 100, 100, 150, 150);
		
		g.setColor(Color.WHITE);
		g.fillRoundRect(161, 145, 15, 15, 100,100);
		g.setColor(Color.WHITE);
		g.fillRoundRect(192, 145, 15, 15, 100,100);
		g.setColor(Color.WHITE);
		g.fillRoundRect(221, 145, 15, 15, 100,100);
	}}