plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "vadiole.template"
    compileSdk = 35

    defaultConfig {
        applicationId = "vadiole.template"
        minSdk = 31
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        setProperty("archivesBaseName", "Template-v$versionName")
    }

    androidResources {
        @Suppress("UnstableApiUsage")
        localeFilters += listOf("en")
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles("proguard-rules.pro")
        }

        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles("proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    lint {
        disable.addAll(
            listOf(
                "SetTextI18n",
                "RtlHardcoded", "RtlCompat", "RtlEnabled",
                "ViewConstructor",
                "UnusedAttribute",
                "NotifyDataSetChanged",
                "ktNoinlineFunc",
                "ClickableViewAccessibility",
            )
        )
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
}