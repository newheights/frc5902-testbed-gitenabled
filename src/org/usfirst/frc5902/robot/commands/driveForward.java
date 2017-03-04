package org.usfirst.frc5902.robot.commands;

import org.usfirst.frc5902.robot.Robot;
import org.usfirst.frc5902.robot.RobotMap;

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
public class driveForward extends Command {

    public driveForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.leftDriveLead.changeControlMode(CANTalon.TalonControlMode.Position);
    	Robot.driveTrain.rightDriveLead.changeControlMode(CANTalon.TalonControlMode.Position);
    	Robot.driveTrain.leftDriveLead.setEncPosition(0);
    	Robot.driveTrain.rightDriveLead.setEncPosition(0);
    	Robot.driveTrain.leftDriveLead.set(39133.7579618);
    	Robot.driveTrain.rightDriveLead.set(39133.7579618);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Robot.driveTrain.leftDriveLead.getError() < 500 && Robot.driveTrain.rightDriveLead.getError() < 500) {
    		return true;
    	} else {
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.leftDriveLead.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
    	Robot.driveTrain.rightDriveLead.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
