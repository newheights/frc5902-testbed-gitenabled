<<<<<<< HEAD
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.robot.subsystems;

import org.usfirst.frc5902.robot.Robot;
import org.usfirst.frc5902.robot.RobotMap;
import org.usfirst.frc5902.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class cameraControl extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Servo panServo = RobotMap.cameraControlpanServo;
    private final Servo tiltServo = RobotMap.cameraControltiltServo;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    //double servoInPan = (Robot.oi.driverXbox.getX());
    //double servoInTilt = (Robot.oi.driverXbox.getY());

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
   /** sets the camera's default pos
    * 
    */
   public void cameraDefaultPos()	{
   	    //
    	panServo.set(0);
    	tiltServo.set(0); 
    }
    
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    /**moves servos based on XBox input
     * 
     * @param stick
     */
	public void cameraDriverControlled(Joystick stick) {
		//
		panServo.set(Math.abs(stick.getX()));
       	tiltServo.set(Math.abs(stick.getY()));		
	}
}

=======
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.robot.subsystems;

import org.usfirst.frc5902.robot.Robot;
import org.usfirst.frc5902.robot.RobotMap;
import org.usfirst.frc5902.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class cameraControl extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public final Servo panServo = RobotMap.cameraControlpanServo;
    private final Servo tiltServo = RobotMap.cameraControltiltServo;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    //double servoInPan = (Robot.oi.driverXbox.getX());
    //double servoInTilt = (Robot.oi.driverXbox.getY());

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
   
   public void cameraDefaultPos()	{
    	panServo.set(0.9);
    	tiltServo.set(0); 
    }
    
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

	public void cameraDriverControlled(Joystick stick) {
		panServo.set(Math.abs(stick.getX()));
       	tiltServo.set(Math.abs(stick.getY()));		
	}
}

>>>>>>> b805daf185f9969d40c17192a2b522a3dc100576
