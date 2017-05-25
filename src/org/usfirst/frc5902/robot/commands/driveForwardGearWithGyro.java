package org.usfirst.frc5902.robot.commands;

import org.usfirst.frc5902.robot.Robot;
import org.usfirst.frc5902.robot.RobotMap;
import org.usfirst.frc5902.robot.subsystems.encoderDev;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Command;

/**
 * driveForward.java
 * Written for NE District Granite State District Event by Brennan Macaig (FRC-1721)
 * 3/2/2017
 * 
 * Notes:
 * This doesn't implement a gyro. A gyro is really unneccessary for this purpose.
 * 
 */

public class driveForwardGearWithGyro extends Command {
	
    public final double pulseToInches = (6*Math.PI)/4096.0;
    double startPosition = 0; 

    public driveForwardGearWithGyro() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	double startPosition = Robot.leftDriveEncoder.pulseWidthPos * pulseToInches *100/(int)100;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.gyroDriveStraight(-.4);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Robot.leftDriveEncoder.pulseWidthPos * pulseToInches *100/(int)100 < -103 )
    			{ return true; }
    	else 
    		{ return false;}
    		
    	}
    	

    // Called once after isFinished returns true
    protected void end() {
    			Robot.driveTrain.driveStraight(0);
    	}

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
