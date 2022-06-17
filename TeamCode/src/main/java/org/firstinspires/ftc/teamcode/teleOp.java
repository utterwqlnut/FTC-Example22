package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.commands.DuckyCommand;

@TeleOp(name="TO")
public class teleOp extends CommandOpMode {
    private Motor ds;
    private GamepadEx g1;
    @Override
    public void initialize() {
        ds = new Motor(hardwareMap, "duckSpin");
        ds.setRunMode(Motor.RunMode.RawPower);
        g1 = new GamepadEx(gamepad1);
        g1.getGamepadButton(GamepadKeys.Button.RIGHT_BUMPER).toggleWhenPressed(new DuckyCommand());
    }
}
