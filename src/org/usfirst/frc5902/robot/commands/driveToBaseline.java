package org.usfirst.frc5902.robot.commands;

import org.usfirst.frc5902.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveToBaseline extends Command {
	public final double pulseToInches = (10*Math.PI)/4096.0;

    public driveToBaseline() {
    	requires(Robot.leftDriveEncoder);
    	requires(Robot.driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    protected void execute() {
 
    	// Below Code works. WNM Feb 21
    	Robot.driveTrain.driveStraightAdjust(.522, .5); // Adjustment to drive straighter
    	setTimeout(97/Robot.driveTrain.inchesToSecondsModifier); // Format inches needed to go #*inchesToSecondsModifier
    	
    	//Gyro Code UNTESTED Feb 20 Harrison G
    	/*   	double feet = 7.93;
    	double dblFactor = 1;
    	double dblCommonSpeed = 0.5;
    	double dblLeftSpeed;
    	double dblRightSpeed;
    	double dblAngle;

        double distance = (-feet * 12)/pulseToInches;
        while (Robot.leftDriveEncoder.pulseWidthPos >= distance) {
           	dblAngle = Robot.gyro.gyro.getAngle();
        	dblLeftSpeed = dblCommonSpeed + (dblAngle*dblFactor);
        	dblRightSpeed = dblCommonSpeed - (dblAngle*dblFactor);
        	Robot.driveTrain.arcadeDrive(dblLeftSpeed, dblRightSpeed, dblCommonSpeed);
        }
        end(); */
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
