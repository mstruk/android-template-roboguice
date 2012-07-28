For this template RoboGuice project we are following the instructions here: http://code.google.com/p/roboguice/wiki/InstallationNonMaven

For ant build, configured by default by IDEA Android support, we add those lib to libs dir, and use Module Settings project Dependencies to add the jars as dependencies.

For maven build, we used http://www.sonatype.com/books/mvnref-book/reference/android-dev-sect-helloandroidexample.html to create a pom.xml, and then improved it from there.


We added roboguice dependency as described here: http://code.google.com/p/roboguice/wiki/InstallationMaven

We added ProGuard activation to pom.xml (look for <proguard>) and config file proguard.cfg for maven build - to minimize the output .apk

We followed

