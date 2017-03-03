package org.usfirst.frc5902.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class gyro extends Subsystem {
	public ADXRS450_Gyro gyro;
	private double angle;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public gyro () {
		gyro = new ADXRS450_Gyro(); 
		gyro.reset();
		gyro.calibrate();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void run(gyro gyro) {
    	angle = gyro.gyro.getAngle();
    }
    public void reset(gyro gyro) {
    	gyro.gyro.reset();
    }
    public void calibrate(gyro gyro) {
    	gyro.gyro.calibrate();
    }
    public double getAngle() {
    	return angle;
    }
    
}

