//Test Bed 2

// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.robot;

import org.usfirst.frc5902.robot.subsystems.sensorBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
@SuppressWarnings("unused")
public class RobotMap {
		//LEFT 
		public static CANTalon driveTrainleftDriveFollow;
	    public static CANTalon driveTrainleftDriveLead;
	    
	    //RIGHT 
	    public static CANTalon driveTrainrightDriveFollow;
	    public static CANTalon driveTrainrightDriveLead;
	    
	    //Shooter
	    public static CANTalon shooterLeftLead;
	    public static CANTalon shooterRightFollow;
	    
	    // Robot Drive
	    public static RobotDrive driveTrainrobotDrive;
    
    //Camera Pan Tilt
    public static Servo cameraControlpanServo;
    public static Servo cameraControltiltServo;
    
    //Intake
    public static Spark intakeMotor;

    public static void init() {
        
    		//LEFT Drive Train
	    	driveTrainleftDriveLead = new CANTalon(1);
	        LiveWindow.addActuator("driveTrain", "leftDriveLead", driveTrainleftDriveLead);
	        
	        driveTrainleftDriveFollow = new CANTalon(2);
	        LiveWindow.addActuator("driveTrain", "leftDriveFollow", driveTrainleftDriveFollow);
	        
	        //RIGHT Drive Train
	        driveTrainrightDriveLead = new CANTalon(3);
	        LiveWindow.addActuator("driveTrain", "rightDriveLead", driveTrainrightDriveLead);
	        
	        driveTrainrightDriveFollow = new CANTalon(4);
	        LiveWindow.addActuator("driveTrain", "rightDriveFollow", driveTrainrightDriveFollow);
	        
	        //shooter motors
	        shooterLeftLead = new CANTalon(5);
	        LiveWindow.addActuator("Shooter", "shooterLeftLead", shooterLeftLead);
	        
	        shooterRightFollow = new CANTalon(6);
	        LiveWindow.addActuator("Shooter", "shooterRightFollow", shooterRightFollow);
	    
	    //Create Drive Train    
        driveTrainrobotDrive = new RobotDrive(driveTrainleftDriveLead, driveTrainrightDriveLead);
        
        driveTrainrobotDrive.setSafetyEnabled(true);
        driveTrainrobotDrive.setExpiration(0.1);
        driveTrainrobotDrive.setSensitivity(0.5);
        driveTrainrobotDrive.setMaxOutput(1.0);

        // Camera Control Servo
        cameraControlpanServo = new Servo(0);
        LiveWindow.addActuator("cameraControl", "panServo", cameraControlpanServo);
        
        cameraControltiltServo = new Servo(1);
        LiveWindow.addActuator("cameraControl", "tiltServo", cameraControltiltServo);
    
        // Intake Motor
        intakeMotor = new Spark(2);
        LiveWindow.addActuator("intake", "intakeMotor", intakeMotor );
        
        // Encoders and More
       
    }
}
