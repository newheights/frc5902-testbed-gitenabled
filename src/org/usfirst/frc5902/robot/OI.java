//Test Bed 2

//// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.robot;

import org.usfirst.frc5902.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc5902.robot.subsystems.*;



import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // Define Joysticks
    public Joystick logitech;
    public Joystick driverXbox;

    // Define Buttons for Xbox
    
    public JoystickButton buttonA1; 
    public JoystickButton buttonB2;
    public JoystickButton buttonX3;
    public JoystickButton buttonY4;
    
    public JoystickButton leftBumper5;
    public JoystickButton rightBumper6;
    
    public JoystickButton buttonLeftStick7;
    public JoystickButton buttonRightStick8;
    
    public JoystickButton buttonStart9;
    public JoystickButton buttonBack10;
    public JoystickButton buttonHome11;
    
    public JoystickButton buttonDpadUp12;
    public JoystickButton buttonDpadDown13;
    public JoystickButton buttonDpadLeft14;
    public JoystickButton buttonDpadRight15;

    
    // Define Buttons for Logitech

    public JoystickButton buttonJoy7;


    public OI() {
    	// Assign Joysticks to Drive Station IDs
        driverXbox = new Joystick(1);
        
        logitech = new Joystick(0);
        
        // SmartDashboard Buttons
        SmartDashboard.putData("arcadeDrive", new arcadeDrive());
        SmartDashboard.putData("autoCommandExample", new autoCommandExample());
        SmartDashboard.putData("autoBaseline", new autoBaseline());
        SmartDashboard.putData("startIntake", new startIntake(.5));
        SmartDashboard.putData("startShooter", new startShooter(.75));
        SmartDashboard.putData("stopShooter", new stopShooter());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
    // Tell Each button what to do
        // Format it as follows
        // button1 = new JoystickButton(joystickName, 1);
        // button1.whileHeld(new commandName());

        // Driver Xbox Button Assignments 
        buttonA1 = new JoystickButton(driverXbox, 1);
        buttonA1.whileHeld(new startShooter(.90));
        
        buttonB2 = new JoystickButton(driverXbox, 2);
        buttonB2.whileHeld(new startShooter(.85));
        
        buttonX3 = new JoystickButton(driverXbox, 3);
        buttonX3.whileHeld(new startShooter(.75));
       
        buttonY4 = new JoystickButton(driverXbox, 4);
        buttonY4.whileHeld(new startShooter(.80));

        leftBumper5 = new JoystickButton(driverXbox, 5);
        leftBumper5.whileHeld(new moveCamera());
      
        rightBumper6 = new JoystickButton(driverXbox, 6);
        rightBumper6.toggleWhenPressed(new startIntake(.75));
          
        // Logitech Joystick Button Assignments 

        buttonJoy7 = new JoystickButton(logitech, 7);
        buttonJoy7.whenPressed(new resetEncoder());
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getlogitech() {
        return logitech;
    }

    public Joystick getdriverXbox() {
        return driverXbox;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    

}