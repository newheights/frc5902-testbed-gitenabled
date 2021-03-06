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

import org.usfirst.frc5902.robot.commands.autoBaseline;
import org.usfirst.frc5902.robot.commands.autoBaselineGyro;
import org.usfirst.frc5902.robot.commands.autoGearLeft;
import org.usfirst.frc5902.robot.commands.autoGearRight;
import org.usfirst.frc5902.robot.commands.autoGearStraight;
import org.usfirst.frc5902.robot.commands.autoNothing;
import org.usfirst.frc5902.robot.subsystems.agitator;
import org.usfirst.frc5902.robot.subsystems.cameraControl;
import org.usfirst.frc5902.robot.subsystems.driveTrain;
import org.usfirst.frc5902.robot.subsystems.encoderDev;
import org.usfirst.frc5902.robot.subsystems.gyro;
import org.usfirst.frc5902.robot.subsystems.intake;
import org.usfirst.frc5902.robot.subsystems.sensorBase;
import org.usfirst.frc5902.robot.subsystems.shooter;
import org.usfirst.frc5902.robot.subsystems.trackerPipeline;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.VisionThread;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory. Something there
 */
@SuppressWarnings("unused")
public class Robot extends IterativeRobot {

    Command autonomousCommand;
	SendableChooser<Command> autoChooser;
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static driveTrain driveTrain;
    public static sensorBase sensorBase;
    public static intake intake;
    public static shooter shooter;
    public static cameraControl cameraControl;
    public static encoderDev leftDriveEncoder;
    public static encoderDev rightDriveEncoder;
    public static agitator agitator;
    public static double speed;
    public final double pulseToInches = (6*Math.PI)/4096.0;
    
    //agitator
    // Make Gyro
    public static gyro gyro;
    // GRIP Defines
    
//    private static final int IMG_WIDTH = 640;
//	private static final int IMG_HEIGHT = 380;
//	
//	private VisionThread visionThread;
//	private double centerX = 0.0;
//	private RobotDrive drive;
//	
//	private final Object imgLock = new Object();
	
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
        agitator = new agitator();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
       
        //Make Gyro & Reset to 0 & Calibrate
        
        // Commented out - actions are performed in gyro init
		//gyro.reset();
		//gyro.calibrate();

		// Encoder Code
        gyro = new gyro();
        leftDriveEncoder = new encoderDev(RobotMap.driveTrainleftDriveLead);
        rightDriveEncoder = new encoderDev(RobotMap.driveTrainrightDriveLead);

        /**    
         ** 	CAMERA CODE
         */        
        
        UsbCamera shooterCamera = CameraServer.getInstance().startAutomaticCapture();
        UsbCamera intakeCamera = CameraServer.getInstance().startAutomaticCapture();
        
//		// GRIP CAMERA CODE
//		//New
//		//Source Destination may not be accurate - Harrison
//		//camera = CameraServer.getInstance().startAutomaticCapture();
//        camera.setResolution(IMG_WIDTH, IMG_HEIGHT);
//        visionThread = new VisionThread(camera, new trackerPipeline(), pipeline -> {
//            if (!pipeline.filterContoursOutput().isEmpty()) {
//                Rect r = Imgproc.boundingRect(pipeline.filterContoursOutput().get(0));
//                synchronized (imgLock) {
//                    centerX = r.x + (r.width / 2);
//                }
//            }
//        });
//                visionThread.start();
//        // END GRIP CAMERA CODE
                
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


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        
        //Autonomous Chooser Code
        autoChooser = new SendableChooser<>();
        autoChooser.addDefault("Gyro for Baseline UNTESTED", new autoBaselineGyro());
        autoChooser.addObject("Auto Do Nothing", new autoNothing());
        autoChooser.addObject("Auto Gear Middle Starting", new autoGearStraight());
        autoChooser.addObject("Auto Gear Left Starting", new autoGearLeft());
        autoChooser.addObject("Auto Gear Right Starting", new autoGearRight());
        SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);
        
        SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);

    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }
    /**
     * Diasables the robot run execution
     */
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }
    /**
     * Starts Autonomous
     */
    public void autonomousInit() {
        autonomousCommand = autoChooser.getSelected();
        autonomousCommand.start();
        gyro.gyro.reset();
       // leftDriveEncoder.leftDriveEncoder.setEncPosition(0);
        leftDriveEncoder.reset();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        leftDriveEncoder.run();
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Gyro Reading", gyro.getAngle());
        SmartDashboard.putNumber("Left Drive Distance Inches", ((leftDriveEncoder.pulseWidthPos * pulseToInches)*100)/(int)100);
    }
    /**
     *   This makes sure that the autonomous stops running when
     *   teleop starts running. If you want the autonomous to
     *   continue until interrupted by another command, remove
     *   this line or comment it out.
     */
    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        gyro.gyro.reset();
        //leftDriveEncoder.leftDriveEncoder.setEncPosition(0);
        leftDriveEncoder.reset();

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Xbox X axis", oi.driverXbox.getX());
        // SmartDashboard.putNumber("Xbox Y axis", oi.driverXbox.getY());
        SmartDashboard.putNumber("Gyro Reading", gyro.getAngle());
        SmartDashboard.putNumber("Throttle Reading", oi.logitech.getThrottle());
      //  SmartDashboard.putNumber("Left Drive Encoder Reading", leftDriveEncoder.pulseWidthPos);
        // SmartDashboard.putNumber("Left Drive Encoder Velocity", leftDriveEncoder.pulseWidthVelocity);
        SmartDashboard.putNumber("Left Drive Distance Inches", ((leftDriveEncoder.pulseWidthPos * pulseToInches)*100)/(int)100);
        SmartDashboard.putNumber("Pan Servo Position Inches", cameraControl.panServo.getPosition());
        SmartDashboard.putNumber("Xbox X axis", oi.driverXbox.getX());
        
        leftDriveEncoder.run();
        
        gyro.run(gyro);
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
     
    }
    
    
    /**To move the robot with a GRIP inputStream we have to create a loop
     * in Teleop or method on it's only (possibly called by a button)
     * that will run GRIP over and over again
     * this link give some info, we have to grab data from a network table out algorithm
     * is running to see if it gives us the blob with proper spec (aka: area, pos)
     * https://www.chiefdelphi.com/forums/showthread.php?t=141283
     * 
     * When it meet the data then we can enter the logic to move the robot - Harrison
     * 
     */
    public static void RunCode() {
    	
    }
    
}
