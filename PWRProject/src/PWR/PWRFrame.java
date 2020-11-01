/*
 * /*
Programmer: Kieren Foenander S012141776
Course: Object Oriented Programming COIT11134
Assignment 1
 */
package PWR;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JFrame;

/**
 *
 * @author black
 */
public class PWRFrame extends JFrame {

    // Variables declaration - do not modify                     
    private JPanel backgroundPanel;
    private JTabbedPane tabbedPane;
    // End of variables declaration 

    public PWRFrame() {
        super("PWR Stacking Schedule"); // title of program
        
        initComponents();
    }

    private void initComponents() {
        
        

        backgroundPanel = new JPanel();
        tabbedPane = new JTabbedPane(); // creates new Tabbed Pane
        
        tabbedPane.addTab("Add Stacker", new StackerPanel()); // adds panel to tabbed pane
        tabbedPane.addTab("Add Core", new CorePanel());
        
        
        
        
        

        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        addWindowListener(
                new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {

                exit();

            }

        }
        );
    }
    
    private void exit(){
        System.exit(0);
    }

}
