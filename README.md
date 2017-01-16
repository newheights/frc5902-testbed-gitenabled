# The Wire Clippers - FRC 5902 Robot Code - 2017 Season
2017 is our 2nd year in the FIRST Robotics competition.

We used Robot builder and followed along these videos from WPI 
https://www.youtube.com/playlist?list=PLYA9eZLlgz7t9Oleid2wtlgnvhGObeKzp

#2017 Notes (Some are leftover from 2016

# Robot Subsystems

## DriveTrain - Robot Driving
Talon SRX Motor Controllers connected 
- Left Motor Lead
- Left Motor Follow

- Right Motor Lead
- Right Motor Follow

## (Not setup yet) - Fule Intake - Method to Intake and Eject the Fuel Balls
- (Not setup yet) IntakeMotor - powers the intake system to intake the ball. It does have encoders but not sure how to interact with it.

## (Not setup yet) - Sensor Base
- Ultrasonic Sensor - put the reading of inches away from the robot on the screen.

# Autonomous Mode

Using an autonomous command chooser in the code drivers are able to select which code is run during the autnomous mode.
- AutonomousBaseLine
- AutonomousDoNothing

# Teleop Mode

During teleop mode our robot can run commands as well as having the driver drive around. On the drive station computer we have a SmartDashboard that will display informaiton from the robot to the drivers.

## Driver Station SmartDashboard

On the smart dashboard we have the following
- USB Camera Feed
- X & Y Axis of the Driver Xbox Controller
- Status of the Pnuematic Cylinder is displayed either Retracted & Extended


## 2016 Driver Controls

### Driver Xbox - Operator Interface Assignments

| Button  | Command |
| ------------- | ------------- |
| Left stick  | Regular ArcadeDrive  |
| Right Bumper (while held)  | Half Speed ArcadeDrive  |
| A Button  | Inverted ArcadeDrive  |
| Y Button  | Half Speed Inverted ArcadeDrive  |

### Driver Joystick - Operator Interface Assignments

| Button  | Command |
| ------------- | ------------- |
| Main joystick | Intake Flap |
| Button 3  | Retract Ball Kicker |
| Button 4  | Extend Ball Kicker  |
| Button 5  | 180 Intake Flap  |
