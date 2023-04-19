package com.mycompany.clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Clock extends JFrame{
    
    private Calendar calendar;
    private SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
    private String formatted;
    private JLabel time = new JLabel();
    private Timer timer;
    
    Clock(){
        
        add(time);
        timer = new Timer(1000, e -> {
            time.setText(formatter.format(Calendar.getInstance().getTime()));
        });
        timer.start();
        
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
