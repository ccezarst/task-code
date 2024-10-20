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




class HangMode(hwMap: HardwareMap) {
    companion object {
    }
    private val backPistons =  BackPistons(hwMap)
    private val frontPistons = FrontPistons(hwMap)
    private val bottomWeight = BottomWeight(hwMap)

    init{}

    fun activate(){
        frontPistons.extend();
        Timer().schedule(2000) {
            frontPistons.close();
            Timer().schedule(2000) {
                // change position based on needs
                backPistons.rotate(0.0);
                bottomWeight.release();
                Timer().schedule(2000) {
                    // change position based on needs
                    backPistons.extend();
                    Timer().schedule(2000) {
                        // change position based on needs
                        backPistons.close();
                        frontPistons.extend();
                        Timer().schedule(2000) {
                            // change position based on needs
                            frontPistons.close();

                        }
                    }
                }
            }

        }
    }



    //SLIDER positions are protected in order to remain private. That's why we use these 3 functions to determine where the slider is
    //relative to target position




}