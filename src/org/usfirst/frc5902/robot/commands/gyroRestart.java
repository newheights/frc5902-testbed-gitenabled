package org.usfirst.frc5902.robot.commands;

import org.usfirst.frc5902.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class gyroRestart extends Command {
	public static double angle;
    public gyroRestart() {
    	requires(Robot.gyro);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	angle = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	angle = Robot.gyro.getAngle();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
