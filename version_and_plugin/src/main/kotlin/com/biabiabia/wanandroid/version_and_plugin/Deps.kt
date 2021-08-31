package com.biabiabia.wanandroid.version_and_plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class Deps : Plugin<Project> {

    override fun apply(target: Project) {

    }

    object AndroidX {

        const val androidx_core_core_ktx =
            "androidx.core:core-ktx:${Versions.androidx_core_core_ktx}"

        const val androidx_appcompat_appcompat =
            "androidx.appcompat:appcompat:${Versions.androidx_appcompat_appcompat}"

        const val androidx_compose_ui_ui =
            "androidx.compose.ui:ui:${Versions.androidx_compose_ui_ui}"

        const val androidx_compose_material_material =
            "androidx.compose.material:material:${Versions.androidx_compose_material_material}"

        const val androidx_compose_ui_ui_tooling =
            "androidx.compose.ui:ui-tooling:${Versions.androidx_compose_ui_ui_tooling}"

        const val androidx_compose_ui_ui_tooling_preview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.androidx_compose_ui_ui_tooling_preview}"

        const val androidx_lifecycle_lifecycle_runtime_ktx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidx_lifecycle_lifecycle_runtime_ktx}"

        const val androidx_activity_activity_compose =
            "androidx.activity:activity-compose:${Versions.androidx_activity_activity_compose}"

        const val androidx_test_ext_junit =
            "androidx.test.ext:junit:${Versions.androidx_test_ext_junit}"

        const val androidx_test_espresso_espresso_core =
            "androidx.test.espresso:espresso-core:${Versions.androidx_test_espresso_espresso_core}"

        const val androidx_compose_ui_ui_test_junit4 =
            "androidx.compose.ui:ui-test-junit4:${Versions.androidx_compose_ui_ui_test_junit4}"

        const val androidx_compose_ui_eui_tst_junit4 =
            "androidx.compose.ui:eui-tst-junit4:${Versions.androidx_compose_ui_eui_tst_junit4}"
    }

    object Google {
        const val com_google_android_material_material =
            "com.google.android.material:material:${Versions.com_google_android_material_material}"

    }

    object Junit {
        const val junit_junit = "junit:junit:${Versions.junit_junit}"
    }

    object Squareup {
        const val com_squareup_retrofit2_retrofit =
            "com.squareup.retrofit2:retrofit${Versions.com_squareup_retrofit2_retrofit}"

    }

}