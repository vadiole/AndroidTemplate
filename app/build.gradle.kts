plugins {
    id("com.android.application")
    kotlin("android")
//    kotlin("kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "vadiole.template"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
        setProperty("archivesBaseName", "Template v$versionName ($versionCode)")
    }

    buildTypes {
        getByName("debug") {
            applicationIdSuffix = ".debug"
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    lint {
        disable(
            "RtlHardcoded", "RtlCompat", "RtlEnabled",
            "ViewConstructor",
            "UnusedAttribute"
        )
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
}