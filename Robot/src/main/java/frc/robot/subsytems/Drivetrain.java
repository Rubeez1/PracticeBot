package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.OI;
import frc.robot.RobotMap;

public class Drivetrain {
    private CANSparkMax l1, l2, r1, r2;
    private static void Drivetrain() {
        l1 = new CANSparkMax(RobotMap.Drivetrain.l1, MotorType.kBrushless);
        l2 = new CANSparkMax(RobotMap.Drivetrain.l2, MotorType.kBrushless);
        r1 = new CANSparkMax(RobotMap.Drivetrain.r1, MotorType.kBrushless);
        r2 = new CANSparkMax(RobotMap.Drivetrain.r2, MotorType.kBrushless);
        

    }




    )

