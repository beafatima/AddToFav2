import org.gradle.accessors.dm.LibrariesForLibs

val LibrariesForLibs.glide: Any
    get() {
        TODO("Not yet implemented")
    }

plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.addtofav"
    compileSdk = 34

    dataBinding{
        enable=true
    }
    viewBinding{
        enable=true
    }

    defaultConfig {
        applicationId = "com.example.addtofav"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.recyclerview)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.glide)



}