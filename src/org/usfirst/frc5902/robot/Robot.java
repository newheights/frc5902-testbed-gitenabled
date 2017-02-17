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

import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc5902.robot.commands.autoCommandExample;
import org.usfirst.frc5902.robot.subsystems.cameraControl;
import org.usfirst.frc5902.robot.subsystems.driveTrain;
import org.usfirst.frc5902.robot.subsystems.encoderDev;
import org.usfirst.frc5902.robot.subsystems.intake;
import org.usfirst.frc5902.robot.subsystems.sensorBase;
import org.usfirst.frc5902.robot.subsystems.shooter;
import org.usfirst.frc5902.robot.subsystems.trackerPipeline;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.VisionThread;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory. Something there
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;
    SendableChooser autoChooser;
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static driveTrain driveTrain;
    public static sensorBase sensorBase;
    public static intake intake;
    public static shooter shooter;
    public static cameraControl cameraControl;
    public static encoderDev encoder1;
    public static encoderDev encoder2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// Define Speed - WM
    public static double speed;
    
    // Make Gyro
    ADXRS450_Gyro gyro;
    // GRIP Defines
    
    private static final int IMG_WIDTH = 640;
	private static final int IMG_HEIGHT = 380;
	
	private VisionThread visionThread;
	private double centerX = 0.0;
	private RobotDrive drive;
	
	private final Object imgLock = new Object();
	
	// GRIP END Defines

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new driveTrain();
        sensorBase = new sensorBase();
        intake = new intake();
        shooter = new shooter();
        cameraControl = new cameraControl();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
       
        //Make Gyro & Reset to 0 & Calibrate
        
        gyro = new ADXRS450_Gyro(); 
		gyro.reset();
		gyro.calibrate();
		encoder1 = new encoderDev(RobotMap.shooter);
		encoder2 = new encoderDev(RobotMap.driveTrainleftDriveLead);
		
        /**    
         ** 	CAMERA CODE
         */        
        
		// GRIP CAMERA CODE
        UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
        camera.setResolution(IMG_WIDTH, IMG_HEIGHT);
        visionThread = new VisionThread(camera, new trackerPipeline(), pipeline -> {
            if (!pipeline.filterContoursOutput().isEmpty()) {
                Rect r = Imgproc.boundingRect(pipeline.filterContoursOutput().get(0));
                synchronized (imgLock) {
                    centerX = r.x + (r.width / 2);
                }
            }
        });
        visionThread.start();
        // END GRIP CAMERA CODE
                
                /**    
                 ** 	END CAMERA CODE
                 */ 
  
        
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

        autonomousCommand = new autoCommandExample();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        
        //Autonomous Chooser Code
        autoChooser = new SendableChooser();
        autoChooser.addDefault("Autonomous Example", new autoCommandExample());
        
        SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);

    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Xbox X axis", oi.driverXbox.getX());
        SmartDashboard.putNumber("Xbox Y axis", oi.driverXbox.getY());
        SmartDashboard.putNumber("Gyro Reading", gyro.getAngle());
        SmartDashboard.putNumber("Throttle Reading", oi.logitech.getThrottle());
        SmartDashboard.putNumber("Encoder 1 Reading", encoder1.pulseWidthPos);
        SmartDashboard.putNumber("Encoder 1 Velocity", encoder1.pulseWidthVelocity);
        SmartDashboard.putNumber("Encoder 2 Reading", encoder2.pulseWidthPos);
        SmartDashboard.putNumber("Encoder 2 Velocity", encoder2.pulseWidthVelocity);
        encoder1.run(RobotMap.shooter);
        encoder2.run(RobotMap.driveTrainleftDriveLead);
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
     
    }
}
