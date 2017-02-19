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

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
@SuppressWarnings("unused")
public class shooter extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final CANTalon shooter = RobotMap.shooter;
    public void initDefaultCommand() {
    	shooter.set(0);
    	// Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	//shooterLeftLead.changeControlMode(TalonControlMode.PercentVbus);
    }
    public void shooterRun(double speed) {
    	shooter.set(speed);
    }
       public void stop() {
    	shooter.set(0);
    }
}

