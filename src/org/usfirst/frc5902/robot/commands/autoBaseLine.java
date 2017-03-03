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
public class autoBaseLine extends CommandGroup {

    public autoBaseLine() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
