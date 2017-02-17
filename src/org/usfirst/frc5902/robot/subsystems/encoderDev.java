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
	public FeedbackDeviceStatus sensorstatus;
	public boolean sensorPluggedIn;
    public encoderDev(CANTalon _tal) {
    	_tal.reset();
    	pulseWidthPos = _tal.getPulseWidthPosition();
    	pulseWidthRiseToFallUs = _tal.getPulseWidthRiseToFallUs();
    	pulseWidthRiseToRiseUs = _tal.getPulseWidthRiseToRiseUs();
    	pulseWidthVelocity = _tal.getPulseWidthVelocity();
    	sensorstatus = _tal.isSensorPresent(FeedbackDevice.CtreMagEncoder_Absolute);
    	sensorPluggedIn = (FeedbackDeviceStatus.FeedbackStatusPresent == sensorstatus);
	}
	@Override
	protected void initDefaultCommand() {
		
	}
	public void run(CANTalon _tal) {
		this.pulseWidthPos = _tal.getPulseWidthPosition();
    	this.pulseWidthRiseToFallUs = _tal.getPulseWidthRiseToFallUs();
    	this.pulseWidthRiseToRiseUs = _tal.getPulseWidthRiseToRiseUs();
    	this.pulseWidthVelocity = _tal.getPulseWidthVelocity();
    	this.sensorstatus = _tal.isSensorPresent(FeedbackDevice.CtreMagEncoder_Absolute);
    	this.sensorPluggedIn = (FeedbackDeviceStatus.FeedbackStatusPresent == sensorstatus);
	}
}

