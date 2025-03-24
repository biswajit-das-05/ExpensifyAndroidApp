buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.1") // Use Kotlin DSL syntax
    }
}



// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false


    // Add the Realm plugin here
}
