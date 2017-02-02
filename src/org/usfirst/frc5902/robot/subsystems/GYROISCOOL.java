package org.usfirst.frc5902.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Timer;
/**
 *
 */
public class GYROISCOOL extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public double angle;
	public ADXRS450_Gyro gyro; 
	boolean isActive;
	public GYROISCOOL() {
		gyro = new ADXRS450_Gyro();
		isActive = true;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	while(isActive) {
    		double angle = Math.round(gyro.getAngle());
    		this.angle = angle;
    		Timer.delay(1);
    	}
    }
    public void stop() {
    	isActive = false;
    }
    public void restart() {
    	isActive = true;
    }
}

