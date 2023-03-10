package com.example.jetpack

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class SimpleWorker(context:Context,params:WorkerParameters):Worker(context,params){
    override fun doWork(): Result {
        Log.d("---SimpleWorker", "do work in simpleWorker")
        return Result.success()
    }

}