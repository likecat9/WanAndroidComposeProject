package com.biabiabia.wanandroid.version_and_plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author xk
 *
 * 自定义依赖plugin，在bulid.gradle中添加此plugin
 * 可以自定义plugin，也可以仅使用定义的依赖描述
 * 所有的依赖声明都放在此类中，根据 公司名/组件名/用途 进行分类
 * 如：lifecycle组件则创建object Lifecycle 类
 * 如：com.google.xxx/com.squareup.xxx 创建 [Google]/[Squareup]
 * object类 命名规则为首字母大写即可
 * 依赖名称的变量命名规则为：全小写；将依赖名称copy过来，将所有的[.]或[:]改为下划线 [_]即可
 * 如：[Deps.Lifecycle.androidx_lifecycle_lifecycle_viewmodel_ktx]
 * 注意，需要在 [Versions] 类中创建对应的类
 *
 * */

class Deps : Plugin<Project> {

    override fun apply(target: Project) {

    }

    object AndroidX {
        const val androidx_appcompat_appcompat =
            "androidx.appcompat:appcompat:${Versions.AndroidX.androidx_appcompat_appcompat}"

        const val androidx_compose_ui_ui =
            "androidx.compose.ui:ui:${Versions.AndroidX.androidx_compose_ui_ui}"

        const val androidx_compose_material_material =
            "androidx.compose.material:material:${Versions.AndroidX.androidx_compose_material_material}"

        const val androidx_compose_ui_ui_tooling =
            "androidx.compose.ui:ui-tooling:${Versions.AndroidX.androidx_compose_ui_ui_tooling}"

        const val androidx_compose_ui_ui_tooling_preview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.AndroidX.androidx_compose_ui_ui_tooling_preview}"


        const val androidx_activity_activity_compose =
            "androidx.activity:activity-compose:${Versions.AndroidX.androidx_activity_activity_compose}"

    }

    /**
     * 生命周期感知型组件可执行操作来响应另一个组件（如 Activity 和 Fragment）的生命周期状态的变化。这些组件有助于您写出更有条理且往往更精简的代码，这样的代码更易于维护。
     */
    object Lifecycle {

        /**
         * ViewModel*/
        const val androidx_lifecycle_lifecycle_viewmodel_ktx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"

        /**
         * LiveData*/
        const val androidx_lifecycle_lifecycle_livedata_ktx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"

        /**
         * Lifecycles only (without ViewModel or LiveData)*/
        const val androidx_lifecycle_lifecycle_runtime_ktx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"

        /**
         * Saved state module for ViewModel*/
        const val androidx_lifecycle_lifecycle_viewmodel_savedstate =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}"

        /**
         * Kapt Annotation processor */
        const val androidx_lifecycle_lifecycle_compiler =
            "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_version}"

        /**
         * optional - helpers for implementing LifecycleOwner in a Service */
        const val androidx_lifecycle_lifecycle_service =
            "androidx.lifecycle:lifecycle-service:${Versions.lifecycle_version}"

        /**
         * optional - ProcessLifecycleOwner provides a lifecycle for the whole application process */
        const val androidx_lifecycle_lifecycle_process =
            "androidx.lifecycle:lifecycle-process:${Versions.lifecycle_version}"

    }

    /**
     * Android 上的 Kotlin 协程 */
    object Coroutines {
        const val org_jetbrains_kotlinx_kotlinx_coroutines_android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines.org_jetbrains_kotlinx_kotlinx_coroutines_android}"
    }

    object Android_KTX {
        const val androidx_core_core_ktx =
            "androidx.core:core-ktx:${Versions.Android_KTX.androidx_core_core_ktx}"
    }

    object Google {
        const val com_google_android_material_material =
            "com.google.android.material:material:${Versions.Google.com_google_android_material_material}"

    }

    object Junit {
        const val junit_junit = "junit:junit:${Versions.Junit.junit_junit}"
    }

    object Squareup {
        const val com_squareup_retrofit2_retrofit =
            "com.squareup.retrofit2:retrofit${Versions.Squareup.com_squareup_retrofit2_retrofit}"

    }

    object Test {
        const val androidx_test_ext_junit =
            "androidx.test.ext:junit:${Versions.Test.androidx_test_ext_junit}"

        const val androidx_test_espresso_espresso_core =
            "androidx.test.espresso:espresso-core:${Versions.Test.androidx_test_espresso_espresso_core}"

        const val androidx_compose_ui_ui_test_junit4 =
            "androidx.compose.ui:ui-test-junit4:${Versions.Test.androidx_compose_ui_ui_test_junit4}"

        const val androidx_compose_ui_eui_tst_junit4 =
            "androidx.compose.ui:eui-tst-junit4:${Versions.Test.androidx_compose_ui_eui_tst_junit4}"

    }
}