package frc.robot.motor;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkAbsoluteEncoder;
import com.revrobotics.spark.SparkAnalogSensor;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

public class Motor {
    
    public final SparkMax motor;
    public SparkAnalogSensor analogEncoder;
    public SparkAbsoluteEncoder absoluteEncoder;
    public RelativeEncoder inBuiltEncoder;
    public final MotorInfo info;
    public SparkMaxConfig config;

    public Motor(MotorInfo info, boolean analog, boolean absolute) {

        this.info = info;
        this.motor = new SparkMax(info.ID, MotorType.kBrushless);
        this.inBuiltEncoder = motor.getEncoder();
        config = new SparkMaxConfig();
        config.idleMode(IdleMode.kBrake);

        if (analog) {
            this.analogEncoder = motor.getAnalog();
        } 
        if (absolute) {
            this.absoluteEncoder = motor.getAbsoluteEncoder();
        } 

    }

    public double getRawAngle(boolean degreesOrVoltage) {
        
        double rawAngle;

        if (degreesOrVoltage) {
            double degreePosition = analogEncoder.getPosition();
            
            rawAngle = degreePosition;
        } else {
            double degreesPerVolt = 360/info.MAX_ENCODER_VALUE;
            double encoderVoltage = analogEncoder.getVoltage();
            double voltsPosition = degreesPerVolt * encoderVoltage;

            rawAngle = voltsPosition;
        }

        return rawAngle;

    }

    public double getAngle() {
        
        double angle = getRawAngle(true) - info.REFERENCE_ANGLE;
        
        return angle;

    }

    public double getAbsoluteRawAngle() {

        double angle = absoluteEncoder.getPosition();

        return angle;

    }

    public double getAbsoluteAngle() {

        double angle = absoluteEncoder.getPosition() - info.REFERENCE_ANGLE;

        return angle;

    }

}
