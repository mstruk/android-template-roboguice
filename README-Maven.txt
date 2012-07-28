Preparing Maven Android support
===============================

For reference information about using Maven with Android check out: http://www.sonatype.com/books/mvnref-book/reference/android-dev.html

Here we provide step-by-step instructions for our use case.


Step 1
------

We’ll presume that Android SDK is installed in

/opt/android-sdk

We’ll go to shell and set an env variable:

export ANDROID_HOME=/opt/android-sdk


Step 2
------

Now we have to make sure we have all the Android APIs, and Google APIs.

$ANDROID_HOME/tools/android

Make sure all the Android API versions, and Google API versions are installed. You may alternatively only install those API version that you actually plan to use in your project, but that will require a more manual procedure in the next step.

For a phone application that would run on most devices in use today, for example, we might target Android API 1.5, and Google API corresponding to that version.

We may also want to use fragments approach to UI development to easily create applications that switch their looks between phone, and tablet screens.

Make sure to install Android Support library to use this functionality with older platform versions. You'll find that in $ANDROID_HOME/tools/android tool under 'Extras'.


Step 3
------

Now we have to create and install Maven artifacts into the local Maven repository ($HOME/.m2/repository)

Go to your development directory and use Git to clone a project that will do that for us:

git clone git://github.com/mosabua/maven-android-sdk-deployer.git
cd maven-android-sdk-deployer

Building this project will by default install all the Android API versions, and Google API versions as artifacts into a local Maven repository. If some APIs are missing (were not installed in previous step), this build process will fail.

You can opt to only install specific API versions by activating specific profiles.

You can use the following profiles: 1.5, 1.6, 2.1, 2.2, 2.3.3, 3.0, 3.1, 3.2, 4.0, 4.0.3, 4.1

For Tattletale we only need Android 1.5 + Google API so we can do:

cd platforms
mvn install -P1.5
cd ../add-ons
mvn install -P1.5


You may experience failures even if you did everything right. We have experienced inconsistent naming of specific directories which causes the tool to look for existence of directory that does not exist, when in fact the directory exists under a slightly different name. Symbolic linking helps in these situations, but problems have to be resolved manually, and build has to be re-run.


