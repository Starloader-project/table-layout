TableLayout - An Alternative to GridBagLayout
=============================================

## Disclaimer required by the license

I do not know from which exact version and source this repository stems from as such the disclaimer below is especially true:
This work is derived from Clearthought's TableLayout, https://tablelayout.dev.java.net, by means of patch files
rather than subclassing or composition.  Therefore, this work might not contain the latest fixes and features of TableLayout.

##  Licensing issues

Given that java.net is permamently down it is very hard to track down a working state of the code, and it is also hard to
get/obtain the license that was active at that time (I know that this application was relicensed at some time) as sadly
archive.org did not archive the repository to the fullest before java.net died. As such I used the license that was already
found within upstream's codebase, The Clearthought Software License, Version 2.0. As such this repository does <b>NOT</b>
have binary compatibillity with upstream as I am forced to rename all the packages.

The current license also has the issue that it is rather vague on forks of forks. For the sake of aiding you, the forker
I hereby note that you are not required to change the name of the package again. All code that I wrote can be considered
to be licensed under the BSD 2-Clause License, though technically it is also licensed under the Clearthought Software License,
in case you want to relicense just my code, then mail me.

Should you have a newer copy of the repository that is licensed under a more liberal license,
the feel free to give it to me (or show where it is located/mirriored) by opening an issue (or mailing it to me, depending
on whether this repo is archived or not).

## Maven coordinates:


    <repository>
      <id>geolykt-maven</id>
      <url>https://geolykt.de/maven</url>
    </repository>

    <dependency>
      <groupId>de.geolykt.starloader</groupId>
      <artifactId>tableLayout</artifactId>
      <version>4.4.0</version>
    </dependency>

## Changes compared to upstream

This repository has following changes:
 * Migrated from semi-gradle/semi-maven to full gradle 7.
 * Bumped Java to Java 11
 * Removed/Altered deprecated stuff
 * Use JPMS

