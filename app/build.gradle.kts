plugins {
    id("com.android.application")
}

android {
    namespace = "com.mytaskapplication"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.mytaskapplication"
        minSdk = 23
        targetSdk = 33
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

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    /*---Networking----*/
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")
    implementation ("com.google.code.gson:gson:2.8.8")

    implementation ("androidx.room:room-runtime:2.4.3")
    implementation ("androidx.room:room-ktx:2.4.3")
    annotationProcessor ("androidx.room:room-compiler:2.4.3")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}