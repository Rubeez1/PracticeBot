package frc.robot.subsytems;

package com.revrobotics.CANSparkMax;

package frc.robot.RobotMap;
package frc.robot.OI;

public class Drivetrain {
    private CANSparkMax l_primary, l_secondary, r_primary, r_secondary;
    private Drivetrain() {
        l_primary = new CANSparkMax(RobotMap.Drivetrain.LEFT_PRIMARY, MotorType.kBrushless);
        r_primary = new CANSparkMax(RobotMap.Drivetrain.RIGHT_PRIMARY, MotorType.kBrushless);
        l_secondary = new CANSparkMax(RobotMap.Drivetrain.LEFT_SECONDARY, MotorType.kBrushless);
        l_secondary = new CANSparkMax(RobotMap.Drivetrain.LEFT_PRIMARY, MotorType.kBrushless);

        leftSpeedControl = new SpeedControllerGroup(l_primary, l_secondary);
        leftSpeedControl = new SpeedControllerGroup(r_primary, r_secondary);
    }
    private static Drivetrain instance;
    public static Drivetrain getInstance() {
        if (instance == null) {
            return new Drivetrain();
        }
        else(
            return instance;
        )
    }
}