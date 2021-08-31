package com.biabiabia.wanandroid.version_and_plugin

/**
 * 此类配合[Deps]使用，负责定义依赖的版本号
 * */
object Versions {
    private const val compose_version = "1.0.0"

    const val lifecycle_version = "2.3.1"

    object AndroidX {
        const val androidx_appcompat_appcompat = "1.3.0"

        const val androidx_activity_activity_compose = "1.3.0"

        const val androidx_compose_ui_ui = compose_version
        const val androidx_compose_ui_ui_tooling = compose_version
        const val androidx_compose_ui_ui_tooling_preview = compose_version

        const val androidx_compose_material_material = compose_version
    }

    object Android_KTX {
        const val androidx_core_core_ktx = "1.6.0"
    }

    object Coroutines {
        const val org_jetbrains_kotlinx_kotlinx_coroutines_android = "1.3.9"
    }

    object Google {
        const val com_google_android_material_material = "1.4.0"
    }

    object Junit {
        const val junit_junit = "4.13.2"
    }

    object Test {
        const val androidx_test_ext_junit = "1.1.3"
        const val androidx_test_espresso_espresso_core = "3.4.0"

        const val androidx_compose_ui_eui_tst_junit4 = compose_version
        const val androidx_compose_ui_ui_test_junit4 = compose_version
    }

    object Squareup {
        const val com_squareup_retrofit2_retrofit = "2.9.0"
    }
}