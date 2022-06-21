package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.commands.DuckyCommand;
import org.firstinspires.ftc.teamcode.commands.DuckyServoBackward;
import org.firstinspires.ftc.teamcode.commands.DuckyServoForward;
import org.firstinspires.ftc.teamcode.subsystems.DuckyServo;
import org.firstinspires.ftc.teamcode.subsystems.DuckySpinnerSubsystem;

@TeleOp(name="TO")
public class teleOp extends CommandOpMode {
    private Motor ds;
    private ServoEx servo;
    private DuckyServo duckyServo;
    private DuckySpinnerSubsystem dss;
    private DuckyServoBackward dsb;
    private DuckyServoForward dsf;
    private GamepadEx g1;
    @Override
    public void initialize() {
        ds = new Motor(hardwareMap, "duckSpin");
        ds.setRunMode(Motor.RunMode.RawPower);
        dss = new DuckySpinnerSubsystem(ds);
        servo = new SimpleServo(hardwareMap, "servo_name", -(Math.PI)/2, (Math.PI)/2, AngleUnit.RADIANS);
        duckyServo = new DuckyServo(servo);
        dsf=new DuckyServoForward(duckyServo);
        dsb=new DuckyServoBackward(duckyServo);
        g1 = new GamepadEx(gamepad1);
        g1.getGamepadButton(GamepadKeys.Button.RIGHT_BUMPER).toggleWhenPressed(new DuckyCommand(dss));
        g1.getGamepadButton(GamepadKeys.Button.LEFT_BUMPER).toggleWhenPressed(dsf.andThen(dsb));
    }
}
