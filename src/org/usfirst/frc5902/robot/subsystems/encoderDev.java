package org.usfirst.frc5902.robot.subsystems;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.FeedbackDeviceStatus;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class encoderDev extends Subsystem implements edu.wpi.first.wpilibj.CANSpeedController.ControlMode{

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public int pulseWidthPos;
	public int pulseWidthRiseToFallUs;
	public int pulseWidthRiseToRiseUs;
	public int pulseWidthVelocity;
	public int wireClippersEncoderValue;
	private int internalEncoderValue;
	public FeedbackDeviceStatus sensorstatus;
	public boolean sensorPluggedIn;
	public CANTalon leftDriveEncoder;
    public encoderDev(CANTalon _tal) {
    	leftDriveEncoder=_tal;
	}
	@Override
	protected void initDefaultCommand() {
		internalEncoderValue = leftDriveEncoder.getPulseWidthPosition();
	}
	public void run() {
		this.pulseWidthPos = internalEncoderValue - leftDriveEncoder.getPulseWidthPosition();
    	this.pulseWidthRiseToFallUs = leftDriveEncoder.getPulseWidthRiseToFallUs();
    	this.pulseWidthRiseToRiseUs = leftDriveEncoder.getPulseWidthRiseToRiseUs();
    	this.pulseWidthVelocity = leftDriveEncoder.getPulseWidthVelocity();
    	this.sensorstatus = leftDriveEncoder.isSensorPresent(FeedbackDevice.CtreMagEncoder_Absolute);
    	this.sensorPluggedIn = (FeedbackDeviceStatus.FeedbackStatusPresent == sensorstatus);
    	
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isPID() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int reset() {
		// TODO Auto-generated method stub
		internalEncoderValue = leftDriveEncoder.getPulseWidthPosition();
		return 0;
	}
	public void zero() {
		// TODO Auto-generated method stub
		internalEncoderValue = 0;
	}
}

