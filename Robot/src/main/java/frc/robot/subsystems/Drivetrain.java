package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.OI;
import frc.robot.RobotMap;

public class Drivetrain {
    private static CANSparkMax l1, l2, r1, r2;
    private static double rightSpeed, leftSpeed;
    public  static double speed;
    public double x;
    public double y;
    public static void drivetrain() {
         l1 = new CANSparkMax(RobotMap.Drivetrain.l1, MotorType.kBrushless);
         l2 = new CANSparkMax(RobotMap.Drivetrain.l2, MotorType.kBrushless);
         r1 = new CANSparkMax(RobotMap.Drivetrain.r1, MotorType.kBrushless);
         r2 = new CANSparkMax(RobotMap.Drivetrain.r2, MotorType.kBrushless);

        SpeedControllerGroup leftSpeed = new SpeedControllerGroup(l1, l2);
        SpeedControllerGroup rightSpeed = new SpeedControllerGroup(r1, r2);
    
        public static void setleftSpeed() {
            rightSpeed.set(speed);
        }
        public static void setRightSpeed() {
            leftSpeed.set(speed);
        }
        public static void arcadeDrive() {
            double y = OI.driver.getRX();
            double x = OI.driver.getLY();
            leftSpeed = x * y * 1;
            rightSpeed = x * y * -1;
        }
        

    }


    }
}