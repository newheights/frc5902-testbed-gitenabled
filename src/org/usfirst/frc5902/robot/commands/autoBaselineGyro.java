package org.usfirst.frc5902.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * autoBaseLine.java
 * Written for NE District Granite State District Event by Brennan Macaig (FRC-1721)
 * 3/2/2017
 * 
 * Notes:
 * This doesn't implement a gyro. A gyro is really unneccessary for this purpose.
 * 
 */
public class autoBaselineGyro extends CommandGroup {

    public autoBaselineGyro() {
        addSequential(new driveForwardGearWithGyro());
    }
}
