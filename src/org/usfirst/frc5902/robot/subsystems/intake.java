// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.robot.subsystems;

import org.usfirst.frc5902.robot.RobotMap;
import org.usfirst.frc5902.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class intake extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    private final Spark intakeMotor = RobotMap.intakeMotor;
    // Not needed anymrore - private double speedValue = 1.0;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void intakeRun(double speed) {
    	intakeMotor.set(speed);
    }
  
    public void stop() {
    	intakeMotor.set(0);
    }
    public void intakeDriverJoystick (Joystick stick) {
    	intakeMotor.set(-stick.getY());
    }
   
    public void initDefaultCommand() {
        
        setDefaultCommand(new driverIntake());

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

