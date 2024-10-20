package org.firstinspires.ftc.teamcode.hardware

import com.qualcomm.hardware.rev.RevTouchSensor
import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.HardwareMap
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.hardware.TouchSensor

import org.firstinspires.ftc.robotcore.external.Telemetry
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.*
import kotlin.math.absoluteValue
import com.qualcomm.robotcore.hardware.DistanceSensor


/**
 * intake subsystem.
 *
 * This class controls the hardware for placing freight
 */

class Intake(hwMap: HardwareMap) {
    companion object {

    }
    /**if x ==1
    {ok=1
    } else ok =0

     if x==1 ? ok=1 : ok=0
     if x==1 ok=1 ?: ok=0

     telemtry -- mod de afisare a datelor pt un cod
     Exception-- erori
     **/
    private val intakeMotor1 = hwMap.dcMotor["intakeMotor1"] ?: throw Exception("Failed to find intakeMotor1")
    private val intakeMotor2 = hwMap.dcMotor["intakeMotor2"] ?: throw Exception("Failed to find intakeMotor2")


    init {
        intakeMotor1.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.FLOAT;
        intakeMotor2.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.FLOAT;
        intakeMotor1.mode = DcMotor.RunMode.RUN_WITHOUT_ENCODER;
        intakeMotor2.mode = DcMotor.RunMode.RUN_WITHOUT_ENCODER;
    }
    //X- cleste deschis
    //Y-cleste inchis
    fun startIntake()
    {
        intakeMotor1.power = 1.0;
        intakeMotor2.power = 1.0;
    }
    fun stopIntake()
    {
        intakeMotor1.power = 0.0;
        intakeMotor2.power = 0.0;
    }














}
