/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 14-Planet Enumeration
 * This program tells the user where a planet is based on their selection
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PlanetEnumer {
    private JComboBox cmbPlanets;
    private JButton btnSelectPlanet;
    private javax.swing.JPanel JPanel;


    //creates enum
    public enum Planets{
    Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune
    }

    public PlanetEnumer() {
        //adds values to cmb
        for (Planets p:Planets.values()){
            cmbPlanets.addItem(p);
        }

        btnSelectPlanet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //checks what the user selected, will then display a window for a response to the selection
                if (cmbPlanets.getSelectedItem()==Planets.Mercury){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Mercury + ", planet #1");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Venus){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Venus + ", planet #2");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Earth){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Earth + ", planet #3");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Mars){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Mars + ", planet #4");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Jupiter){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Jupiter + ", planet #5");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Saturn){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Saturn + ", planet #6");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Uranus){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Uranus + ", planet #7");
                }
                else if (cmbPlanets.getSelectedItem()==Planets.Neptune){
                    JOptionPane.showMessageDialog(null, "You want to go to " +Planets.Neptune + ", planet #8");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new PlanetEnumer().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
