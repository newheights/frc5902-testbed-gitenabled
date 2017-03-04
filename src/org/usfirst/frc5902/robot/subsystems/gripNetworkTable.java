package org.usfirst.frc5902.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class gripNetworkTable extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	NetworkTable table;
	public double area;
	boolean isActive;
	public gripNetworkTable() {
		table = NetworkTable.getTable("GRIP/myContoursReport");
		isActive = true;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	double[] defaultValues = new double[0];
    	while(isActive) {
    		double[] areas = table.getNumberArray("area", defaultValues);
    		for (double area: areas) {
    			this.area = area;
    		}
    		Timer.delay(1);
    	}
    }
    public void stop() {
    	isActive = false;
    }
    public void restart() {
    	isActive = true;
    }
}

