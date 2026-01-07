/*
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lineageos.updater.model

import java.io.File

class Update : UpdateBase, UpdateInfo {
    private var mStatus: UpdateStatus? = UpdateStatus.UNKNOWN
    private var mPersistentStatus = UpdateStatus.Persistent.UNKNOWN
    private var mFile: File? = null
    private var mProgress = 0
    private var mEta: Long = 0
    private var mSpeed: Long = 0
    private var mInstallProgress = 0
    private var mAvailableOnline = false
    private var mIsFinalizing = false

    constructor()

    constructor(update: UpdateInfo) : super(update) {
        mStatus = update.getStatus()
        mPersistentStatus = update.getPersistentStatus()
        mFile = update.getFile()
        mProgress = update.getProgress()
        mEta = update.getEta()
        mSpeed = update.getSpeed()
        mInstallProgress = update.getInstallProgress()
        mAvailableOnline = update.getAvailableOnline()
        mIsFinalizing = update.getFinalizing()
    }

    override fun getStatus(): UpdateStatus? {
        return mStatus
    }

    fun setStatus(status: UpdateStatus?) {
        mStatus = status
    }

    override fun getPersistentStatus(): Int {
        return mPersistentStatus
    }

    fun setPersistentStatus(status: Int) {
        mPersistentStatus = status
    }

    override fun getFile(): File? {
        return mFile
    }

    fun setFile(file: File?) {
        mFile = file
    }

    override fun getProgress(): Int {
        return mProgress
    }

    fun setProgress(progress: Int) {
        mProgress = progress
    }

    override fun getEta(): Long {
        return mEta
    }

    fun setEta(eta: Long) {
        mEta = eta
    }

    override fun getSpeed(): Long {
        return mSpeed
    }

    fun setSpeed(speed: Long) {
        mSpeed = speed
    }

    override fun getInstallProgress(): Int {
        return mInstallProgress
    }

    fun setInstallProgress(progress: Int) {
        mInstallProgress = progress
    }

    override fun getAvailableOnline(): Boolean {
        return mAvailableOnline
    }

    fun setAvailableOnline(availableOnline: Boolean) {
        mAvailableOnline = availableOnline
    }

    override fun getFinalizing(): Boolean {
        return mIsFinalizing
    }

    fun setFinalizing(finalizing: Boolean) {
        mIsFinalizing = finalizing
    }

    companion object {
        const val LOCAL_ID: String = "local"
    }
}
