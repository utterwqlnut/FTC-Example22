package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.DuckySpinnerSubsystem;


public class DuckyCommand extends CommandBase {
    private DuckySpinnerSubsystem ds;
    public DuckyCommand(DuckySpinnerSubsystem ds){
        this.ds = ds;
        addRequirements(ds);
    }

    public DuckyCommand() {

    }

    @Override
    public void execute(){
        ds.forward();
    }
    @Override
    public void end(boolean interrupted){
        ds.stop();
    }
}
