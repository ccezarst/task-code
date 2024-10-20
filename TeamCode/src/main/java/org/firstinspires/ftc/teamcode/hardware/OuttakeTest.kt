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
 * OutTake subsystem.
 *
 * This class controls the hardware for placing freight
 */

class OuttakeTest(hwMap: HardwareMap) {

    companion object {

     const val TARGET = 500

    }

    private val motorOuttake = hwMap.dcMotor["motorOuttake"] ?: throw Exception("Failed to find motorOuttake")

    init{
    motorOuttake.zeroPowerBehavior=DcMotor.ZeroPowerBehavior.FLOAT
    motorOuttake.direction=DcMotorSimple.Direction.FORWARD
    motorOuttake.mode=DcMotor.RunMode.RUN_USING_ENCODER
        motorOuttake.mode=DcMotor.RunMode.STOP_AND_RESET_ENCODER
        motorOuttake.power = 0.0
    }

    fun openSlider()
    {
        motorOuttake.mode=DcMotor.RunMode.RUN_TO_POSITION
        motorOuttake.targetPosition = TARGET
        motorOuttake.power = 1.0

    }

    fun closeSlider()
    {
        motorOuttake.mode=DcMotor.RunMode.RUN_TO_POSITION
        motorOuttake.targetPosition = 0
        motorOuttake.power = 1.0

    }




    //SLIDER positions are protected in order to remain private. That's why we use these 3 functions to determine where the slider is
    //relative to target position
    fun printPosition(telemetry: Telemetry)
    {
        telemetry.addData("MotorOuttake position:",motorOuttake.currentPosition)
        telemetry.update()
    }



}