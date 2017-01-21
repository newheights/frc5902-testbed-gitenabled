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
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainleftDriveLead;
    public static CANTalon driveTrainrightDriveLead;
    public static RobotDrive driveTrainrobotDrive;
    public static Servo cameraControlpanServo;
    public static Servo cameraControltiltServo;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// WM-  *START* Add in Motor Controllers for the 4 motor controller system.
    
    public static CANTalon driveTrainleftDriveFollow;
    public static CANTalon driveTrainrightDriveFollow;
   
    // WM-  *END* Add in Motor Controllers for the 4 motor controller system.
    
    // Intake Motor Code
    
    public static Spark intakeMotor;
   

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftDriveLead = new CANTalon(1);
        LiveWindow.addActuator("driveTrain", "leftDriveLead", driveTrainleftDriveLead);
        
        driveTrainrightDriveLead = new CANTalon(3);
        LiveWindow.addActuator("driveTrain", "rightDriveLead", driveTrainrightDriveLead);
        
        driveTrainrobotDrive = new RobotDrive(driveTrainleftDriveLead, driveTrainrightDriveLead);
        
        driveTrainrobotDrive.setSafetyEnabled(true);
        driveTrainrobotDrive.setExpiration(0.1);
        driveTrainrobotDrive.setSensitivity(0.5);
        driveTrainrobotDrive.setMaxOutput(1.0);

        cameraControlpanServo = new Servo(0);
        LiveWindow.addActuator("cameraControl", "panServo", cameraControlpanServo);
        
        cameraControltiltServo = new Servo(1);
        LiveWindow.addActuator("cameraControl", "tiltServo", cameraControltiltServo);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    
        //WM- *START* Init of driveTrainFollow
        
        driveTrainleftDriveFollow = new CANTalon(2);
        LiveWindow.addActuator("driveTrain", "leftDriveFollow", driveTrainleftDriveFollow);
        
        driveTrainrightDriveFollow = new CANTalon(4);
        LiveWindow.addActuator("driveTrain", "rightDriveFollow", driveTrainrightDriveFollow);
        //WM- *END* Init of driveTrainFollow
        intakeMotor = new Spark(2);
       
    }
}
