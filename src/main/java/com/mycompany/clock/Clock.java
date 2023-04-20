package com.mycompany.clock;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Clock extends JFrame{
    
    private Calendar calendar;
    private SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a");
    private JLabel time = new JLabel();
    private Timer timer;
    
    private SimpleDateFormat dayFormatter = new SimpleDateFormat("EEEE; ");
    private JLabel day = new JLabel();
    private SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM d, yyyy");
    private JLabel date = new JLabel();
    
    
    Clock(){
        
            timer = new Timer(1000, e -> {
                time.setText(timeFormatter.format(Calendar.getInstance().getTime()));
            });
            timer.start();
            time.setFont(new Font("Oswald", Font.BOLD, 60));
        
        
            day.setText(dayFormatter.format(Calendar.getInstance().getTime()));
            day.setFont(new Font("Oswald", Font.BOLD, 30));
            
            date.setText(dateFormatter.format(Calendar.getInstance().getTime()));
            date.setFont(new Font("Oswald", Font.BOLD, 30));
            
        
        add(time);
        add(day);
        add(date);
        setVisible(true);
        setSize(380, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
