# The Wire Clippers - FRC 5902 Robot Code - 2017 Season
2017 is our 2nd year in the FIRST Robotics competition.

We used Robot builder and followed along these videos from WPI 
https://www.youtube.com/playlist?list=PLYA9eZLlgz7t9Oleid2wtlgnvhGObeKzp

#2017 Notes
TEST
# Robot Subsystems

## DriveTrain - Robot Driving
Talon SRX Motor Controllers connected 
- Left Motor Lead
- Left Motor Follow

- Right Motor Lead
- Right Motor Follow

## (Not setup yet) - fuelIntake - Method to Intake and Eject the Fuel Balls
- (Not setup yet) IntakeMotor - powers the intake system to intake the ball. It does have encoders but not sure how to interact with it.

## (Not setup yet) - sensorBase
- Any sensors the robot has on it

## cameraControl 
- panServo - Controls pan of camera
- tiltServo - Controls tilt of camera

# Autonomous Mode

Using an autonomous command chooser in the code drivers are able to select which code is run during the autnomous mode.
- AutonomousBaseLine
- AutonomousDoNothing

# Teleop Mode

During teleop mode our robot can run commands as well as having the driver drive around. On the drive station computer we have a SmartDashboard that will display informaiton from the robot to the drivers.

## Driver Station SmartDashboard

On the smart dashboard we have the following
- USB Camera Feed
- (not programmed yet) Axes of the Driver Joystick


## 2017 Driver Controls

### Driver Logitech Joystick - Operator Interface Assignments

| Button  | Command |
| ------------- | ------------- |
| Joystick  | Regular ArcadeDrive  |

### Driver Xbox - Operator Interface Assignments

| Button  | Command |
| ------------- | ------------- |
| Main joystick | Camera Control (Pan/Tilt) |
