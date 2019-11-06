package view;

import javax.swing.JFrame;

class MainFrame extends JFrame {
    
	public MainFrame(){
        setBounds(450,200,550,550);
        MainPanel mySheet = new MainPanel();
        add(mySheet);
        setVisible(true);
    }
}