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
import org.checkerframework.common.subtyping.qual.Bottom

//not acc used just implemented
class BottomSenzor(hwMap: HardwareMap) {
    companion object {
    }
    private val senzor =  hwMap.opticalDistanceSensor["bottomSenzor"] ?: throw Exception("Failed to find bottomSenzor")

    init{}
    fun checkDistance():Double{
        // no method for returning distance detected??
        return 1.0;
    }



    //SLIDER positions are protected in order to remain private. That's why we use these 3 functions to determine where the slider is
    //relative to target position




}