# android-demo-lib
Simple Toast demo lib

How to add our library:

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
>
>
    allprojects {

                  repositories {
                          ...
                          maven { url 'https://jitpack.io' }
		             }
	  }




# Step 2. Add the dependency

>
>
    dependencies {
           implementation 'com.github.candratop3:android-demo-lib:1.0'
        }
