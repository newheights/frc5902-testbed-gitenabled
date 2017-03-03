# The Wire Clippers - FRC 5902 Robot Code - 2017 Season
2017 is our 2nd year in the FIRST Robotics competition.

We used Robot builder and followed along these videos from WPI 
https://www.youtube.com/playlist?list=PLYA9eZLlgz7t9Oleid2wtlgnvhGObeKzp

#2017 Notes

Controls:

- A button (button 1) - Hold to enable camera control
- B button (button 2) - Press to restart camera feed (?)
- X button (button 3) -
- Y button (button 4) -
- Left bumper (button 5) - Hold to activate shooter
- Right bumper (button 6) - Press to intake
- Left stick button (button 7) -
- Right stick button (button 8) -
- START button (button 9) -
- BACK button (button 10) -
- HOME button (button 11) -
- D-pad up (button 12) -
- D-pad down (button 13) -
- D-pad left (button 14) -
- D-pad right (button 15) -



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

| Button  | Button # | Command |
| ------------- | ------------- | ------------- |
| Joystick  | NA | Regular ArcadeDrive  |
| Button 7  | 7 | Reset Left Drive Encoder to 0  |


### Driver Xbox - Operator Interface Assignments

| Button  | Button # | Command |
| ------------- | ------------- | ------------- |
| Left analog stick | NA | Camera Control (Pan/Tilt) - When Move Camera Button Held |
| A Button | 1 | Held - Shooter .90 |
| B Button | 2 | Held - Shooter .85 |
| X Button | 3 | Held - Shooter .75 |
| Y Button | 4 | Held - Shooter .80 |
| Left Bumper | 5 | Held - Move Camera |
| Right Bumper | 6 | Toggle - Intake System |
| Left Stick Button | 7 | Assignment |
| Right Stick Button | 8 | Assignment |
| START Button | 9 | Assignment |
| BACK Button | 10 | Assignment |
| HOME Button | 11 | Assignment |
| D-Pad Up | 12 | Assignment |
| D-Pad Down | 13 | Assignment |
| D-Pad Left | 14 | Assignment |
| D-Pad Right | 15 | Assignment |
