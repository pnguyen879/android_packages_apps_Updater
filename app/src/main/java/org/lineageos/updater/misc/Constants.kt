/*
 * Copyright (C) 2017-2023 The LineageOS Project
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
package org.lineageos.updater.misc

object Constants {
    const val AB_PAYLOAD_BIN_PATH: String = "payload.bin"
    const val AB_PAYLOAD_PROPERTIES_PATH: String = "payload_properties.txt"

    const val AUTO_UPDATES_CHECK_INTERVAL_NEVER: Int = 0
    const val AUTO_UPDATES_CHECK_INTERVAL_DAILY: Int = 1
    const val AUTO_UPDATES_CHECK_INTERVAL_WEEKLY: Int = 2
    const val AUTO_UPDATES_CHECK_INTERVAL_MONTHLY: Int = 3

    const val NOTIFICATION_ID_EXPORT_UPDATE: Int = 16
    const val NOTIFICATION_ID_INSTALL_ERROR: Int = 0
    const val NOTIFICATION_ID_NEW_UPDATES: Int = 1
    const val NOTIFICATION_ID_ONGOING: Int = 10
    const val NOTIFICATION_ID_POST_INSTALL: Int = 11
    const val NOTIFICATION_CHANNEL_EXPORT_UPDATE: String = "notification_channel_export_update"
    const val NOTIFICATION_CHANNEL_INSTALL_ERROR: String = "notification_channel_install_error"
    const val NOTIFICATION_CHANNEL_NEW_UPDATES: String = "notification_channel_new_updates"
    const val NOTIFICATION_CHANNEL_ONGOING: String = "notification_channel_ongoing"
    const val NOTIFICATION_CHANNEL_POST_INSTALL: String = "notification_channel_post_install"

    const val PREF_LAST_UPDATE_CHECK: String = "last_update_check"
    const val PREF_AUTO_UPDATES_CHECK_INTERVAL: String = "auto_updates_check_interval"
    const val PREF_AUTO_DELETE_UPDATES: String = "auto_delete_updates"
    const val PREF_AB_PERF_MODE: String = "ab_perf_mode"
    const val PREF_METERED_NETWORK_WARNING: String = "pref_metered_network_warning"
    const val PREF_NEEDS_REBOOT_ID: String = "needs_reboot_id"
    const val PREF_UPDATE_RECOVERY: String = "update_recovery"

    const val UNCRYPT_FILE_EXT: String = ".uncrypt"

    const val PROP_AB_DEVICE: String = "ro.build.ab_update"
    const val PROP_ALLOW_MAJOR_UPGRADES: String = "lineage.updater.allow_major_upgrades"
    const val PROP_BUILD_DATE: String = "ro.build.date.utc"
    const val PROP_BUILD_VERSION: String = "ro.lineage.build.version"
    const val PROP_BUILD_VERSION_INCREMENTAL: String = "ro.build.version.incremental"
    const val PROP_DEVICE: String = "ro.lineage.device"
    const val PROP_NEXT_DEVICE: String = "ro.updater.next_device"
    const val PROP_RELEASE_TYPE: String = "ro.lineage.releasetype"
    const val PROP_UPDATER_ALLOW_DOWNGRADING: String = "lineage.updater.allow_downgrading"
    const val PROP_UPDATER_URI: String = "lineage.updater.uri"

    const val PREF_INSTALL_OLD_TIMESTAMP: String = "install_old_timestamp"
    const val PREF_INSTALL_NEW_TIMESTAMP: String = "install_new_timestamp"
    const val PREF_INSTALL_PACKAGE_PATH: String = "install_package_path"
    const val PREF_INSTALL_AGAIN: String = "install_again"
    const val PREF_INSTALL_NOTIFIED: String = "install_notified"

    const val UPDATE_RECOVERY_EXEC: String = "/vendor/bin/install-recovery.sh"
    const val UPDATE_RECOVERY_PROPERTY: String = "persist.vendor.recovery_update"

    const val HAS_SEEN_INFO_DIALOG: String = "has_seen_info_dialog"
    const val HAS_SEEN_WELCOME_MESSAGE: String = "has_seen_welcome_message"
}
