package org.usfirst.frc5902.robot.subsystems;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.FeedbackDeviceStatus;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class encoderDev extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public int pulseWidthPos;
	public int pulseWidthRiseToFallUs;
	public int pulseWidthRiseToRiseUs;
	public int pulseWidthVelocity;
    public encoderDev(CANTalon _tal) {
    	pulseWidthPos = _tal.getPulseWidthPosition();
    	pulseWidthRiseToFallUs = _tal.getPulseWidthRiseToFallUs();
    	pulseWidthRiseToRiseUs = _tal.getPulseWidthRiseToRiseUs();
    	pulseWidthVelocity = _tal.getPulseWidthVelocity();
    	FeedbackDeviceStatus sensorstatus = _tal.isSensorPresent(FeedbackDevice.CtreMagEncoder_Absolute);
    	boolean sensorPluggedIn = (FeedbackDeviceStatus.FeedbackStatusPresent == sensorstatus);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
