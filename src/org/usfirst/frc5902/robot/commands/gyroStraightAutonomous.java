package org.usfirst.frc5902.robot.commands;

import org.usfirst.frc5902.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class gyroStraightAutonomous extends Command {
	public boolean isActive;
	public double Kp = .03;
    public gyroStraightAutonomous() {
    	requires(Robot.gyro);
    	requires(Robot.driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gyro.gyro.reset();
        while (isActive) {
            double angle = Robot.gyro.gyro.getAngle(); // get current heading
            //myRobot.drive(-1.0, -angle*Kp); // drive towards heading 0
            Robot.driveTrain.autonomousDrive(1, -angle*Kp);
            Timer.delay(0.004);
        }
        //Robot.driveTrain.autonomousDrive(0.0, 0.0);?
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
