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

open class UpdateBase : UpdateBaseInfo {
    private var mName: String? = null
    private var mDownloadUrl: String? = null
    private var mDownloadId: String? = null
    private var mTimestamp: Long = 0
    private var mType: String? = null
    private var mVersion: String? = null
    private var mFileSize: Long = 0

    constructor()

    constructor(update: UpdateBaseInfo) {
        mName = update.getName()
        mDownloadUrl = update.getDownloadUrl()
        mDownloadId = update.getDownloadId()
        mTimestamp = update.getTimestamp()
        mType = update.getType()
        mVersion = update.getVersion()
        mFileSize = update.getFileSize()
    }

    override fun getName(): String? {
        return mName
    }

    fun setName(name: String?) {
        mName = name
    }

    override fun getDownloadId(): String? {
        return mDownloadId
    }

    fun setDownloadId(downloadId: String?) {
        mDownloadId = downloadId
    }

    override fun getTimestamp(): Long {
        return mTimestamp
    }

    fun setTimestamp(timestamp: Long) {
        mTimestamp = timestamp
    }

    override fun getType(): String? {
        return mType
    }

    fun setType(type: String?) {
        mType = type
    }

    override fun getVersion(): String? {
        return mVersion
    }

    fun setVersion(version: String?) {
        mVersion = version
    }

    override fun getDownloadUrl(): String? {
        return mDownloadUrl
    }

    fun setDownloadUrl(downloadUrl: String?) {
        mDownloadUrl = downloadUrl
    }

    override fun getFileSize(): Long {
        return mFileSize
    }

    fun setFileSize(fileSize: Long) {
        mFileSize = fileSize
    }
}
