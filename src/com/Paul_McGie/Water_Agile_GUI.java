package com.Paul_McGie;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pmcgie on 3/25/2017.
 */
public class Water_Agile_GUI extends JFrame {
    private JTextField projectName;
    private JCheckBox greaterThan9ProgrammersCheckBox;
    private JCheckBox fixedScheduleFirmDeadlineCheckBox;
    private JCheckBox programmingTeamDoesNotCheckBox;
    private JCheckBox stringentQualityControlRequirementsCheckBox;
    private JCheckBox earlyIntegrationNotNeededCheckBox;
    private JCheckBox workingModelsNotNeededCheckBox;
    private JButton clickHereForRecommendationButton;
    private JLabel Recommendation;
    private JPanel MainPanel;
    private boolean Programmers;
    private boolean Deadline;
    private boolean Requirements;
    private boolean Quality;
    private boolean Integration;
    private boolean WorkingModel;

    public Water_Agile_GUI() {
        super("Water or Agile Method Recommender");
        setContentPane(MainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        clickHereForRecommendationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whatmethod();
            }
        });
    }

    private void whatmethod() {
        //Check Programmers
        if (greaterThan9ProgrammersCheckBox.isSelected()) {
            Programmers = true;
        } else {
            Programmers = false;
        }

        //Check Deadline
        if (fixedScheduleFirmDeadlineCheckBox.isSelected()) {
            Deadline = true;
        } else  {
            Deadline = false;
        }

        //Requirements
        if (programmingTeamDoesNotCheckBox.isSelected()) {
            Requirements = true;
        } else {
            Requirements = false;
        }

        //Quality
        if (stringentQualityControlRequirementsCheckBox.isSelected()) {
            Quality = true;
        } else {
            Quality = false;
        }

        //Integration
        if (earlyIntegrationNotNeededCheckBox.isSelected()) {
            Integration = true;
        } else {
            Integration = false;
        }

        //WorkingModel
        if (workingModelsNotNeededCheckBox.isSelected()) {
            WorkingModel = true;
        } else {
            WorkingModel = false;
        }


        //Run Final validation
        if (Programmers == true && Deadline == true && Requirements == false &&
                Quality == true && Integration == false && WorkingModel == false) {
            String results = "Waterfall is preferred method";
            Recommendation.setText(results);
        } else {
            String results = "Agile is preferred method";
            Recommendation.setText(results);
        }

    }

}
