package org.usfirst.frc5902.robot.commands;

import org.usfirst.frc5902.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveGearStraight extends Command {

    public driveGearStraight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	//Code below works - WNM Feb 21
    	Robot.driveTrain.driveStraightAdjust(-.55, -.5); // Adjust for our Drift.
    	setTimeout(103/Robot.driveTrain.inchesToSecondsModifier); // Format inches needed to go #*inchesToSecondsModifier
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
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
