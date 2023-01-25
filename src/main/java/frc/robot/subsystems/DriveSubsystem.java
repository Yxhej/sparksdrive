package frc.robot.subsystems;

import java.lang.Math;
import frc.robot.PortMap;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax.IdleMode;

public class DriveSubsystem extends SubsystemBase {
    private CANSparkMax rearLeftMotor = new CANSparkMax(PortMap.SPARK_LEFT_REAR, MotorType.kBrushed);
    private CANSparkMax rearRightMotor = new CANSparkMax(PortMap.SPARK_RIGHT_REAR, MotorType.kBrushed);
    private CANSparkMax frontLeftMotor = new CANSparkMax(PortMap.SPARK_LEFT_FRONT, MotorType.kBrushed);
    private CANSparkMax frontRightMotor = new CANSparkMax(PortMap.SPARK_RIGHT_FRONT, MotorType.kBrushed);

    public DriveSubsystem() {
        rearLeftMotor.follow(frontLeftMotor);

        rearRightMotor.follow(frontRightMotor);

        rearLeftMotor.setIdleMode(IdleMode.kBrake);
        frontLeftMotor.setIdleMode(IdleMode.kBrake);
        
        rearRightMotor.setIdleMode(IdleMode.kBrake);
        frontRightMotor.setIdleMode(IdleMode.kBrake);        

    }
    
    public void setSpeed(double rightSpeed, double leftSpeed) {
       
        // Prevent motor burnout in case joysticks fail to reset position
        if (Math.abs(rightSpeed) < 0.05) {
            rightSpeed = 0;
        } else if (Math.abs(leftSpeed) < 0.05) {
            leftSpeed = 0;
        }

        // Set one side of motors to (-) if wheels are in opposite directions
        frontRightMotor.set(rightSpeed);
        frontLeftMotor.set(leftSpeed);
    }
    
}
