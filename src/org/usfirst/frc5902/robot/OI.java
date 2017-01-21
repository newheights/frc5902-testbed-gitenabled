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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick logitech;
    public Joystick driverXbox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public JoystickButton rightBumper;
    public JoystickButton buttonA;
    public JoystickButton buttonY;
    public JoystickButton button6;

    public JoystickButton button5;
    public JoystickButton button4;
    public JoystickButton button3;
    public JoystickButton button2;
    public JoystickButton button1; 

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driverXbox = new Joystick(1);
        
        logitech = new Joystick(0);
        
    
        


        // SmartDashboard Buttons
        SmartDashboard.putData("arcadeDrive", new arcadeDrive());
        SmartDashboard.putData("autoCommandExample", new autoCommandExample());
        SmartDashboard.putData("autoGear", new autoGear());
        SmartDashboard.putData("autoBaseline", new autoBaseline());
        SmartDashboard.putData("intakeDoNothing", new intakeDoNothing());
        SmartDashboard.putData("startIntake", new startIntake());
         // SmartDashboard.putData("stopIntake", new stopIntake());
        SmartDashboard.putData("startShooter", new startShooter());
        SmartDashboard.putData("stopShooter", new stopShooter());
        SmartDashboard.putData("moveCamera", new moveCamera());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        button1 = new JoystickButton(driverXbox, 1);
        button1.whileHeld(new moveCamera());

        button3 = new JoystickButton(driverXbox, 1);
        button3.toggleWhenPressed(new startIntake());
        

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
