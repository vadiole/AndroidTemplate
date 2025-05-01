plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "vadiole.template"
    compileSdk = 35

    defaultConfig {
        applicationId = "vadiole.template"
        minSdk = 26
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
        getByName("debug") {
            applicationIdSuffix = ".debug"
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles("proguard-rules.pro")
        }

        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles("proguard-rules.pro")
        }
    }

    packaging {
        resources.excludes.addAll(
            listOf(
                "META-INF/LICENSE",
                "META-INF/NOTICE",
                "META-INF/DEPENDENCIES",
                "META-INF/java.properties",
                "**/*.txt",
                "**/*.md",
                "*.md",
                "*.txt",
            )
        )
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        kotlinOptions {
            jvmTarget = "17"
        }
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
    implementation("androidx.core:core-ktx:1.16.0")
}